package Chapter7;

import java.util.*;

public class BackedCollection {

	public static void main(String[] args) {
		TreeSet h1 = new TreeSet();
		TreeMap hm1 = new TreeMap();
		
		h1.add("A");h1.add("B");h1.add("C");h1.add("Y");h1.add("E");h1.add("J");h1.add("I");h1.add("Z");
		
		SortedSet S2 = h1.subSet("B", "Y"); //Includes B and DOESN't include Y
		NavigableSet S3 = h1.subSet("A", false, "J",true); //Included based on argument
		
		System.out.println("Sorted Set S2:"+S2.toString());
		System.out.println("Sorted Set S3:"+S3.toString());
		
		hm1.put("2", "Two");hm1.put("1", "One");hm1.put("4", "Four");hm1.put("3", "Three");hm1.put("9", "Nine");
		hm1.put("6", "Six");hm1.put("5", "Five");hm1.put("8", "Eight");
		
		SortedMap S4 = hm1.subMap("1", "4"); //Includes 1 and DOESN't include 4
		SortedMap S5 = hm1.subMap("3", false, "9",true); //Included based on argument
		
		System.out.println("Sorted Set S2:"+S4.toString());
		System.out.println("Sorted Set S3:"+S5.toString());
		
	}

}
