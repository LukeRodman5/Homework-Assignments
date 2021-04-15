package com.techelevator;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class TestWordCount {

	
	WordCount testCode = new WordCount();
	@Test
	public void test_getCount_to_return_the_correct_map() {
	
	/*
	 * Given an array of strings, return a Dictionary<string, int> with a key for
	 * each different string, with the value the number of times that string appears
	 * in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * getCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
	 * getCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
	 * getCount([]) → {}
	 * getCount(["c", "b", "a"]) → {"c": 1, "b": 1, "a": 1}
	 *
	 */

	WordCount testCode = new WordCount(); // Define an object with the methods to be tested
	
	String[] STRINGArray = {"Jeff","Aiden","Avery","Sam","Sam","Avery"};
	
	Map<String, Integer> expectedResultMap = new HashMap<String, Integer>();
		expectedResultMap.put("Jeff",1);
		expectedResultMap.put("Aiden",1);
		expectedResultMap.put("Avery",2);
		expectedResultMap.put("Sam",2);
	
	assertEquals("getCount Test Failed", expectedResultMap, testCode.getCount(StringArray));
		
}
