package JavaBasics;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {

		Hashtable<String, Integer> marks = new Hashtable<String, Integer>();
		marks.put("Naveen",100);
		marks.put("Tom",200);
		marks.put("Lisa",300);
		marks.put("Peter",400);
		marks.put("Robby",600);
		marks.put(null,700); //will allow this statement here
		marks.put("Test",null); //will allow this statement here
		
		System.out.println(marks.get("Naveen"));
		//output: 100
		
		System.out.println(marks.get(null));
		//output: Exception in thread "main" java.lang.NullPointerException
		
		System.out.println(marks.get("Test"));
		//output: Exception in thread "main" java.lang.NullPointerException
	}

}
