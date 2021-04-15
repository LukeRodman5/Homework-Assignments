package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Exercises {

	/*
	 Note, for-each is preferred, and should be used when possible.
	 */

	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order
	 array2List( {"Apple", "Orange", "Banana"} )  ->  ["Apple", "Orange", "Banana"]
	 array2List( {"Red", "Orange", "Yellow"} )  ->  ["Red", "Orange", "Yellow"]
	 array2List( {"Left", "Right", "Forward", "Back"} )  ->  ["Left", "Right", "Forward", "Back"]
	 */
	public List<String> array2List(String[] stringArray) {
		ArrayList<String> result = new ArrayList();		// what is being returned from the function
													   // go through the array passed in, one element at a time
													  // Assign each element in the array to the ArrayList
		for(int i=0; i < stringArray.length; i++) {
			result.add(stringArray[i]);				// add current element to the ArrayList
		}
		return result;							  // return the result
	}
	/*
	 Given a list of Strings, return an array containing the same Strings in the same order
	 list2Array( ["Apple", "Orange", "Banana"] )  ->  {"Apple", "Orange", "Banana"}
	 list2Array( ["Red", "Orange", "Yellow"] )  ->  {"Red", "Orange", "Yellow"}
	 list2Array( ["Left", "Right", "Forward", "Back"] )  ->  {"Left", "Right", "Forward", "Back"}
	 */
	public String[] list2Array(List<String> stringList) {
		String[] copyOfList = new String[stringList.size()];
		for (int i = 0; i < stringList.size(); i++) {
			copyOfList[i] = stringList.get(i);
		}
		return copyOfList;
	}
	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order
	 except for any words that contain exactly 4 characters.
	 no4LetterWords( {"Train", "Boat", "Car"} )  ->  ["Train", "Car"]
	 no4LetterWords( {"Red", "White", "Blue"} )  ->  ["Red", "White"]
	 no4LetterWords( {"Jack", "Jill", "Jane", "John", "Jim"} )  ->  ["Jim"]
	 */
	public List<String> no4LetterWords(String[] stringArray) {
		List<String> notFour = new ArrayList<String>();	
		for (String element : stringArray) {
			if (element.length() != 4) {
				notFour.add(element);
			}
		}
		return notFour;
	}
	/*
	 Given an array of ints, divide each int by 2, and return an ArrayList of Doubles.
	 arrayInt2ListDouble( {5, 8, 11, 200, 97} ) -> [2.5, 4.0, 5.5, 100, 48.5]
	 arrayInt2ListDouble( {745, 23, 44, 9017, 6} ) -> [372.5, 11.5, 22, 4508.5, 3]
	 arrayInt2ListDouble( {84, 99, 3285, 13, 877} ) -> [42, 49.5, 1642.5, 6.5, 438.5]
	 */
	public List<Double> arrayInt2ListDouble(int[] intArray) {
		List <Double> doubles = new ArrayList<>();
		for(Integer element : intArray) {	
			doubles.add(((double) (element) / 2));
		}
		return doubles;
	}
	/*
	 Given a List of Integers, return the largest value.
	 findLargest( [11, 200, 43, 84, 9917, 4321, 1, 33333, 8997] ) -> 33333
	 findLargest( [987, 1234, 9381, 731, 43718, 8932] ) -> 43718
	 findLargest( [34070, 1380, 81238, 7782, 234, 64362, 627] ) -> 64362
	 */
	public Integer findLargest(List<Integer> integerList) {
		int largest = 0;
		for (Integer element : integerList) {
			if (element >= largest) {
				largest = element;
			}
		} return largest;
	}
	/*
	 Given an array of Integers, return a List of Integers containing just the odd values.
	 oddOnly( {112, 201, 774, 92, 9, 83, 41872} ) -> [201, 9, 83]
	 oddOnly( {1143, 555, 7, 1772, 9953, 643} ) -> [1143, 555, 7, 9953, 643]
	 oddOnly( {734, 233, 782, 811, 3, 9999} ) -> [233, 811, 3, 9999]
	 */
	public List<Integer> oddOnly(Integer[] integerArray) {		 // like four letter words one
		List<Integer> onlyOdd = new ArrayList<>();				// create new ArrayList w/ only odd elements
		for (Integer element : integerArray) {				   // loop the Array
			if (element % 2 != 0) {							  // if element is not an even number 
				onlyOdd.add(element);						 // adding only odd values
				}
		}
		return onlyOdd;									 // returns List of Integers w/ odd values 
	}
	/*
	 Given a List of Integers, and an int value, return true if the int value appears two or more times in
	 the list.
	 foundIntTwice( [5, 7, 9, 5, 11], 5 ) -> true
	 foundIntTwice( [6, 8, 10, 11, 13], 8 -> false
	 foundIntTwice( [9, 23, 44, 2, 88, 44], 44) -> true
	 */
	public boolean foundIntTwice(List<Integer> integerList, int intToFind) {  //return a boolean, list is almost irrelevant
	    int numCount = 0;
	    for (int element : integerList) {
	        if (element == intToFind) numCount++;
	    }
	    return numCount > 1;
	}
	/*
	Given an array of Integers, return a List that contains the same Integers (as Strings). Except any multiple of 3
	should be replaced by the String "Fizz", any multiple of 5 should be replaced by the String "Buzz",
	& any multiple of both 3 & 5 should be replaced by the String "FizzBuzz"
	** INTERVIEW QUESTION **
	
	 fizzBuzzList( {1, 2, 3} )  ->  [1, 2, "Fizz"]
	 fizzBuzzList( {4, 5, 6} )  ->  [4, "Buzz", 6]
	 fizzBuzzList( {7, 8, 9, 10, 11, 12, 13, 14, 15} )  ->  [7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz"]
	
	 HINT: To convert an integer x to a string you can call x.toString() in your code (e.g. if x = 1 then x.ToString()
	 equals "1")
	 */
	public List<String> fizzBuzzList(Integer[] integerArray) {
		List <String> list = new ArrayList <>();
		for (Integer element : integerArray) {
			if ((element % 3 == 0) && (element % 5 == 0)) { 
			 list.add("FizzBuzz");
			} else if (element % 3 == 0)
				list.add("Fizz");
			else if (element % 5 == 0) {
				list.add("Buzz");	
			} else {
				list.add(element.toString());
		}
	}	
		return list;
	}
	/*
	 Given two lists of Integers, interleave them beginning with the first element in the first list followed
	 by the first element of the second. Continue interleaving the elements until all elements have been interwoven.
	 Return the new list. If the lists are of unequal lengths, simply attach the remaining elements of the longer
	 list to the new list before returning it.
	 interleaveLists( [1, 2, 3], [4, 5, 6] )  ->  [1, 4, 2, 5, 3, 6]
	 */
	public List<Integer> interleaveLists(List<Integer> listOne, List<Integer> listTwo) {
		List<Integer> combinedList = new ArrayList<>();
		int size = Math.min(listOne.size(), listTwo.size());
	    int i;
	    for (i = 0; i < size; i++) {
	        int num = listTwo.get(i);
	        listOne.add(2 * i + 1, num);
	    }
	    if (i < listTwo.size()) {
	        for (int j = i; j < listTwo.size(); j++) {
	            listOne.add(listTwo.get(j));
	        }
	    }
	    combinedList.addAll(listOne);
	    return combinedList;
	}
}