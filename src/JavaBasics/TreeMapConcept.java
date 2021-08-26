package JavaBasics;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<>();
		
		map.put(1000,"Tom");
		map.put(2000,"Peter");
		map.put(3000,"Steve");
		map.put(11000,"Naveen");
		map.put(1400,"Robby");
		
		System.out.println(map); 
		//output is auto-sorted: {1000=Tom, 1400=Robby, 2000=Peter, 3000=Steve, 11000=Naveen}

		
		map.forEach((k,v) -> System.out.println(("key = "+ k +" value = "+ v)));
		/*	Output
		 	key = 1000 value = Tom
			key = 1400 value = Robby
			key = 2000 value = Peter
			key = 3000 value = Steve
			key = 11000 value = Naveen
		 */
		
		System.out.println(map.lastKey());
		//output: 11000 (since 11000 is the last key after sorting is done)
		
		System.out.println(map.firstKey());
		//output: 1000 (since 1000 is the first key after sorting is done)
		
		//Get keys less than 3000
		Set<Integer> keysLessThan3k = map.headMap(3000).keySet();
		System.out.println(keysLessThan3k);
		//output: [1000, 1400, 2000]
		
		//Get keys greater than than 3000
		Set<Integer> keysMoreThan3k = map.tailMap(3000).keySet();
		System.out.println(keysMoreThan3k);
		//output: [3000, 11000]

		
		TreeMap<String, Integer> userMap = new TreeMap<>();

		userMap.put("James",100);
		userMap.put("Brad",200);
		userMap.put("Albert",400);
		userMap.put("George",50);
		userMap.put("Larry",900);
		userMap.put("Ted",120);
		userMap.put("Paul",300);
		
		userMap.forEach((k,v) -> System.out.println(("key = "+ k +" value = "+ v)));
		/* Output (auto-sorted based on key)
		    key = Albert value = 400
			key = Brad value = 200
			key = George value = 50
			key = James value = 100
			key = Larry value = 900
			key = Paul value = 300
			key = Ted value = 120 
		 */
		
	TreeMap<Integer, String> mapReversed = new TreeMap<>(Comparator.reverseOrder());
		
	mapReversed.put(1000,"Tom");
	mapReversed.put(2000,"Peter");
	mapReversed.put(3000,"Steve");
	mapReversed.put(11000,"Naveen");
	mapReversed.put(1400,"Robby");
	
	mapReversed.forEach((k,v) -> System.out.println(("key = "+ k +" value = "+ v)));
	/* Output (sorted but now in reverse order)
		 key = 11000 value = Naveen
		key = 3000 value = Steve
		key = 2000 value = Peter
		key = 1400 value = Robby
		key = 1000 value = Tom
	 */

		
		
		
	}

}
