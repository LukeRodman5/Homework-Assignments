package com.techelevator;

import java.util.HashMap;	// include the code to support a HashMap
import java.util.LinkedHashMap;
import java.util.Map;		// include the code to support a generic Map
import java.util.Set;		// include the code to support a Set
import java.util.TreeMap;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();
							// Map is a Collections class to hold & access key-value pairs
							// The Key is a unique value that identifies the pair
							// The Value is what you want associated w/ the Key
							// Map is also known as an "associative array"
		
							// a Key must be unique w/in the Map
							
							// Types of Maps:
								// HashMap - entries are stored in unknown order
								// TreeMap - entries are stored in key sequence
								// LinkedHashMap - entries are stored in the order they are added to the Map
			
							// To define a Map:
									// Map>key-data-type, value-data-type> name-of-map = new type-of-map();
									// type-of-map<key-data-type, value-data-type> name-of-map = type-of-map();
									
									// Map<String, String> myMap = new HashMap();
									// HashMap<String, String> myMap = new HashMap();
									// Map<String, String> myMap = new HashMap<String,String>():
									// HashMap<String, String> myMap = new HashMap<String,String>();
		
		// key , value
		// type , type		name		type-of-map()
		Map<String,String> residence = new LinkedHashMap();
		residence.put("Frank", "Mayfield");
		residence.put("Brianna","North Tonawanda");
		residence.put("Jeff", "Istanbul");
		residence.put("Sam", "Youngstown");
		residence.put("Avery", "Cleveland Heights");
		residence.put("Wally", "Mayfield");
		
		//use .get(key-value) to access the Map using the key - the value associated w/ the key is returned
		System.out.println("Brianna lives in " + residence.get("Brianna"));
		System.out.println("Jeff lives in " + residence.get("Jeff"));
		System.out.println("Frank lives in " + residence.get("Frank"));
		
		String name = "Sam";
		System.out.println(name +" lives in :" + residence.get(name));
		System.out.println("------------------------");
		
		System.out.println("Try to add Daniel living in Timbuktu");
		residence.put("Daniel", "Timbuktu");
		
		
		
// to process all of the entries in the Map you need to get a list of keys in the Map & use the entries of the Map
// we need to get a list of keys out of the Map & then iterate through the list of keys using some kind of for-loop

		// .keySet() - returns the list of keys in a Map as a Set object
		// a Set object is an instance of the Collection class set
		// Set class is an unordered set of elements that must be unique
			// (different from ArrayList bc elements in an ArrayList do not have to be unique)
		// to define a Set: Set<data-type>
		// Get the list of keys in our Map
		
		Set<String> theKeys = residence.keySet(); 
		// Get the keys from residence as a Set - String is used bc keys are Strings
		// Go through the set of keys using for-each loop since we want to process all the keys 
			// for(data-type name of an element : object-with-elements)
		for(String anElement : theKeys) { 
			// loop through theKeys one at a time assigning the current key to an element
			String theValue = residence.get(anElement); // get the value of the current key & store it in theValue
			System.out.println(anElement + " Lives in " + theValue); // display the person's name & where they live
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
