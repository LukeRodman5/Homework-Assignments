package com.techelevator.myFileReadingCode;

import java.io.File;		// include the code to support Java file i/o
import java.io.FileNotFoundException; // include the code to support FileNotFoundException
import java.util.Scanner;	// include the code to support Java Scanner

public class MyFileReader {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Read the data from a file containing lines of numbers separated by commas
		// Display the line we read from the file
		// Sum the numbers
		// Average the numbers
		// Print the sum & the average
		
		int sum = 0;			// Hold the sum of the #'s in a line from the file
		double average = 0;		//
		
		
		// Instantiate a File object for the file containing our data
		File theFile = new File("./data/numbers.txt");

		// Instantiate a File object for the file containing the data
		Scanner fileReader = new Scanner(theFile);
		
		// Loop through the file on line at a time
		while(fileReader.hasNext()) {			 				// As long as the file has a next line to read
			String aLine = fileReader.nextLine();				// Get the next line from the file
			System.out.println("The line read: " + aLine);		// Display the line from the file
			String[] theNumbers = aLine.split(",");				// Split the line based on a comma
			
			sum = 0;											// Reset sum to clear any old value
			
			for (int i=0; i < theNumbers.length; i++) {			// Loop through the String number values one at a time
				int aNumber = Integer.parseInt(theNumbers[i].trim());	// '.trim()' removes the spaces from code		Convert the current element in theNumbers to an int
				sum += aNumber;									// 		add the number to sum
			}
			average = (double) sum / theNumbers.length;			// calculate the average by dividing sum by the number of number
			System.out.println("Sum: " + sum + " avg:" + average);
		}	// end of while loop
		fileReader.close(); // close the Scanner to avoid a resource leak
	} // end of main()
}







