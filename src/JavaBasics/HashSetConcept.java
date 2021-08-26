package JavaBasics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {

		Set<String> hs = new HashSet<String>();
		
		hs.add("Alpha");
		hs.add("testing");
		hs.add("Beta");
		hs.add("Alpha"); //won't be added since HashSet doesn't allow duplicates
		hs.add(null);//null is allowed in a HashSet
		
		System.out.println(hs);
		//output: [null, testing, Alpha, Beta]
		
//GET method
		System.out.println(hs.contains("testing")); //returns true
		
		//for-each loop
		for(String e: hs) {
			System.out.println(e);
			//output: [null, testing, Alpha, Beta]
		}
		
		//Iterator
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

//Remove method
		hs.remove("Beta");
		
		
//Mathematical Operations
		
		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] {1,3,5,6,8,9,10}));
		
		Set<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] {1,3,5,7,0,9,2}));
		
	//Union
		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);//output: [0, 1, 2, 3, 5, 6, 7, 8, 9, 10] (dupes removed automatically)
		
	//Intersection
		Set<Integer> intersection = new HashSet<Integer>(first);
		intersection.retainAll(second);
		System.out.println(intersection);//output: [1, 3, 5, 9] (only common values)
		
	//Differences
		Set<Integer> diff = new HashSet<Integer>(first);
		diff.removeAll(second);
		System.out.println(diff); //output: [6, 8, 10] (only diffs)
		
	}

}
