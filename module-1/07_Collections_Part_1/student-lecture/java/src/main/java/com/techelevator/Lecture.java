package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
					// import statement includes java code into your code that you need for what you are doing
					// format of the import statement:  package-name.ClassName
					// usually this is code for CLasses you use, but have not defined yourself in this code
public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		// ArrayList is a type of list that functions similar to an array
		//			ArrayList has elements that are stored in the order in which they are added to the ArrayList
		// Two ways to define a new ArrayList
		//			ArrayList<data-type-it-holds>  name = new ArrayList();
		//			List<data-type-it-holds>  name = new ArrayList();
		
		ArrayList<String> names = new ArrayList(); // a new empty ArrayList of Strings
		
		// the .add() method is used to add elements to our ArrayList
		names.add("Jason");		// add a String object to the ArrayList
		names.add("Sam");		// an ArrayList of Strings can only hold Strings. not int's
		names.add("Avery");		// .size() method returns the # of elements in an ArrayList
		names.add("Daniel");
		names.add("D");
		names.add("Joel");
		
		System.out.println("Our ArrayList contains " + names.size() + " elements");
		
		
		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");
		
		for (int i=0; i < names.size(); i++) {
			System.out.println("Element #" + i + ": " + names.get(i));
}

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		names.add("Avery");
		for (int i=0; i < names.size(); i++) {
			System.out.println("Element #" + i + ": " + names.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		names.add(3,"Anne");
		for (int i=0; i < names.size(); i++) {
			System.out.println("Element #" + i + ": " + names.get(i));
		}
		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");
		
		names.remove(0);
		for (int i=0; i < names.size(); i++) {
			System.out.println("Element #" + i + ": " + names.get(i));
		}

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");
		
		System.out.println("is Luke in the ArrayList? " + names.contains("Luke"));
		System.out.println("is Joel in the ArrayList? " + names.contains("Joel"));
		
		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

	//	names.indexOf(object)
		System.out.println("the first time Avery appears in the list is at index " + names.indexOf("Avery"));
	
		System.out.println("the last time Avery appears in the list is at index " + names.lastIndexOf("Avery"));
		
		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");
		
		String [] namesArray = names.toArray(new String[0]);
		for (int i=0; i < namesArray.length; i++) {
			System.out.println("Element #" + i + ": " + names.get(i));
		}
		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		Collections.sort(names);
		for (int i=0; i < namesArray.length; i++) {
			System.out.println("Element #" + i + ": " + names.get(i));
		}		
		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		Collections.reverse(names);
		for (int i=0; i < namesArray.length; i++) {
			System.out.println("Element #" + i + ": " + names.get(i));
		}		
		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

			for (String aName : names) {
			System.out.println("Current Element: " + aName);
		}
	}
}
	

