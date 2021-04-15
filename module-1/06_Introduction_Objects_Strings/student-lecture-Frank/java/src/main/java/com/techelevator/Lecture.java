package com.techelevator;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */
		/*
		 * Two way to create a string:
		 * String name = new String (); // Creates a new empty String
		 * String name = "some value"; // Creats a new String w/ a value
		 * 	a String literal is enclosed in " " - a series of one or more characters
		 * 	a char literal is enclosed in ' ' - char is a SINGLE character
		 * 	a String is NOT a char & a char is NOT a String
		 * 
		 */
		
		String softDrink = "Mtn Dew";
		String beverage = softDrink + " by Pepsi"; // + with Strings - concatenation
		System.out.println(beverage); 			  // expecting to see "Mtn Dew by Pepsi"



//--------------------------------------------------------------------------------------------------------		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();

		/*
		 * String is a class
		 * a class is a description of what an object of the class should look like & what the object can do.
		 *  
		 * an object is an instance of a class.
		 * 
		 * In cooking a recipe describes the ingredients & process for creating a food dish
		 * 
		 * A cake recipe describes how to make a cake. - it is NOT the cake.
		 * 
		 * The cake you make from a recipe is an instance of the recipe (an object)
		 * 
		 * A class contains methods to interact & manipulate objects of the class.
		 * 
		 * a method is a function associated w/ a class
		 * 
		 * a member method is a method associated w/ a specific class.
		 * 
		 * to use a method for class: anObjectOFtheClass.method(parameters)
		 * 
		 */
		
		/* Commonly used String Class methods:  stringname.methodname(parameters)
		 *
		 * .length() - return the number of characters in a String
		 * .charAt(index) - returns the character at the index - 0 is first character
		 * .endsWith(search-string) - return true if the String ends with the search-string 
		 * .startsWith(search-string) - return true if the String starts with the search-string
		 * .indexOf(search-string) - return the index of the start of the 1st occurrence of search-string in the String
		 * .lastIndexOf(search-string) - return the index of the start of the last occurrence of search-string in the Stri
		 * .substring(start-index) - return from the start-index to rest of String
		 * .substring(start-index,end-index) - return from the start-index to the end-index (but not the char at end-index)
		 * .toLowerCase() - return the String in all lowercase
		 * .toUpperCase() - return the String in all uppercase
		 * .trim() - return the String with spaces removed from beginning and end of the String
		 * .split(delimiter) - returns and array of strings containing the characters between the delimiter specified
		 */
			// indexes: 1,2,3,4,5,6,7,8,9
		String name = "Luke Rodman";
				
				System.out.println("The variable name contains: " + name);
				System.out.println("The length of the value in name is: " + name.length());
				
				System.out.println("Does name end with the word man? " + name.endsWith("man"));
				System.out.println("Does name end with the word Rod? " + name.endsWith("Luke"));
				
				System.out.println("Does name start with the word man? " + name.startsWith("man"));
				System.out.println("Does name start with the word Luke? " + name.startsWith("Luke"));
				System.out.println("Does name start with the word luke? " + name.startsWith("luke"));
				
				if (name.startsWith ("Luke")) {
					System.out.println("Yea!!!");
				}
				else {
					System.out.println("Booo!");
				}
				
				System.out.println("Does name contain the word Rod? " + name.contains("Rod"));
				
				// charAt(index) - index start at 0 - positions start at 1
				System.out.println("The character at position 4: " + name.charAt(3));
				System.out.println(name.charAt(7)); // display the 'd' in "Luke Rodman"
				
				System.out.println("where is the 'm' in name?: " + name.indexOf("m"));
				System.out.println("where is the 'm' in name?: " + name.indexOf("m"));
				System.out.println("name in all lowercase is: " + name.toLowerCase());
				System.out.println("name in all Uppercase is: " + name.toUpperCase());
				
				// you can chain methods passing the result from one method to the next
				System.out.println("name in all lowercase is: " + name.toUpperCase().indexOf("M"));
				
				// substring(index) - give me chars from the index specified to the end (index start at 0)
				System.out.println("chars from the th to the end in name: " + name.substring(4)); // index 4 = 5th character
				
				//
				//
				System.out.println("chars from the 5th to 8th in name: " + name.substring(4,8));
				
				
				
				
//--------------------------------------------------------------------------------------------------------	
		
		/*   A String may also be created easily from an array of characters (char) */

		char[] helloArray = new char[] { 'H', 'e', 'l', 'l', 'o' }; // Array of characters 
		
		String hello1 = new String(helloArray);  // Create a String using the array of characters
		String hello2 = new String(helloArray);  // Create a String using the array of characters
		
//--------------------------------------------------------------------------------------------------------			
		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();

		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */

		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

//--------------------------------------------------------------------------------------------------------			
		System.out.println();
		System.out.println("**************************");
		System.out.println("****** USING .split ******");
		System.out.println("**************************");
		System.out.println();

		String movieTitle = "External Sunshine of the Spotless Mind";
		
		// display each word of the movie title on a separate line
		// That means we need to split the title based on the space
		// String .split method will separate the String into parts based on a character you give it
		// .split method returns an array of Strings w/ the part of the original String
		
		String[] wordsInTitle = movieTitle.split(" ");  // separate the parts of the movie title based on the space
		
		System.out.print("Movie Title: " + movieTitle); // .print method does not go to a new line when it's done
		System.out.println("It contains " + wordsInTitle.length + " words\n"); // '\n' is a new line character to give us a blank line
		
		for (int i=0; i < wordsInTitle.length; i++) {
			System.out.println("Word #" + (i+1) + " is " + wordsInTitle[i]);
		}
		movieTitle = "The Good, the Bad, & the Ugly";
		
		// display each word of the movie title on a separate line
		// That means we need to split the title based on the comma
		// String .split method will separate the String into parts based on a character you give it
		// .split method returns an array of Strings w/ the part of the original String
		
		String[] wordInTitle = movieTitle.split(",");  // separate the parts of the movie title based on the space
		
		System.out.print("Movie Title: " + movieTitle); // .print method does not go to a new line when it's done
		System.out.println("It contains " + wordInTitle.length + " words\n"); // '\n' is a new line character to give us a blank line
		
		for (int i=0; i < wordInTitle.length; i++) {
			System.out.println("Word #" + (i+1) + " is " + wordInTitle[i]);
		}
	
	}
}
