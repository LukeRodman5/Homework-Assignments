package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RTNValidator {
	
	// This program will validate bank routing numbers stored in a file
	// The file used is called: rtn.txt
	
	// constant of values used to determine if rtn is valid - has nothing to do w/ File I/O
	private static final int[] CHECKSUM_WEIGHTS = new int[] { 3, 7, 1, 3, 7, 1, 3, 7, 1 };

	public static void main(String[] args) throws FileNotFoundException {

		printApplicationBanner(); //Display a polite hello message
		
// instantiate a File object for the path returned from getInputFileFromUser() method	
	//	File inputFile = getInputFileFromUser();			// Define a file object for the file
															// We get the path from a method
	
// Instantiating the Scanner object in a try () causes it to be automatically closed at the end of the program
// If you define the Scanner object yourself, you are responsible for closing it at the end of the program
// Leaving a file open at the end of t he program, results in causing a "resource leak"
// A "resource leak" is when resources (memory) used by programs are not freed at the end of the program	
// "resource leaks" can lead to slower processing, unexpected errors of the computer just stopping	
		
		
		File inputFile = new File("rtn.txt");				// Identify the path as a String literal (hard coded value)
		//try(Scanner fileScanner = new Scanner(inputFile)) { // Define Scanner object for the file
			
			Scanner fileScanner = new Scanner(inputFile);  // Define Scanner object for the file
			
			// If you try to read more lines than are in the file, an Exception is thrown - program terminates w/ a message
			
			while(fileScanner.hasNextLine()) {				// Loop through the file as long as the file has a line
				String line = fileScanner.nextLine();		//		Get the next line from the file
				String rtn = line.substring(0, 9);			//		Extract the first 9 chars as the rtn
				
				if(checksumIsValid(rtn) == false) {			// Pass the rtn to the validation method - return true if valid
					System.out.println(line);				// 		if the rtn was not valid - display it
				}
			}
			// before the program ends, close any files that were not instantiated in a try ()
			fileScanner.close();  // CLose the file to release resources used to process it
		}  //end of main()
	

	private static void printApplicationBanner() {
		System.out.println("******************");
		System.out.println("RTN Validator 9000");
		System.out.println("******************");
		System.out.println();
	}

	@SuppressWarnings("resource")
	// This method will get a path from a user & if a valid file, return a File object for the path
	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);		// Instantiate an object for keyboard
		System.out.print("Please enter path to input file >>> "); //Display a user prompt for input
		String path = userInput.nextLine();				// Get a line of input from the keyboard
		
		File inputFile = new File(path);				//Instantiate a File object for the path entered by the user

	//	check to be sure what the user entered was valid, existing path to a file
		
		if(inputFile.exists() == false) { // checks for the existence of a file
			System.out.println(path+" does not exist"); // does the path given NOT exist
			System.exit(1); // Ends the program			// if so, display a message
		} else if(inputFile.isFile() == false) {		//		and end the program with a return code 1
			System.out.println(path+" is not a file");	// was the path given NOT a file?
			System.exit(1); // Ends the program			// if so, display a message
		}												// 		and end the program with a return code 1
		
		// if we get here, we know the path was valid, existing file
		return inputFile;	// return the File object for the path
	}

	private static boolean checksumIsValid(String routingNumber) {
		int checksum = 0;
		for(int i = 0; i < 9; i++) {
			int digit = Integer.parseInt(routingNumber.substring(i, i+1));
			checksum += digit * CHECKSUM_WEIGHTS[i];
		}
		return checksum % 10 == 0;
	}
}
