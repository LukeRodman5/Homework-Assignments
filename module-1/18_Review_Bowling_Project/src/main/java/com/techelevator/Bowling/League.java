package com.techelevator.Bowling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class League {

	private String leagueName;
	private Map<Integer, ArrayList<Bowler>> leagueMembers; // key = team number, value = a set of Bowlers

	// Default
public League() {
	leagueName 	  = null;
	leagueMembers = null;
	}
	// 2-arg constructor
public League(String leagueName, String dataFileName) throws FileNotFoundException {
	this.leagueName = leagueName; //this. is required because the parameter has the same name as the data name
	// Load the data from the file given into the leagueMembers
	// Call a member function to load the data from the file (given into the leagueMembers using member function
	loadFile(dataFileName); // run the loadFile method sending the file to be loaded
}
// method to load the file given into leagueMembers - it's private because we don't want the users to run it
// Only members of the class can call this method
private void loadFile(String fileNameToLoad) throws FileNotFoundException {
	File aFile = new File(fileNameToLoad); 				  // Define a File object for the file
	Scanner inputDataFile = new Scanner(aFile); 		  // Define a Scanner for the File object
	
	// Define the variables to hold data from file
	int teamNumber			  = 0;
	int bowlerNumber 	 	  = 0;
	String bowlerName		  = null;
	ArrayList<Integer> scores = new ArrayList<Integer>();// Define a place to hold a set of scores
		
	while(inputDataFile.hasNext()) { 			  		 // loop while the file has lines to read
		String aLine= inputDataFile.nextLine();   		 // Read a line from the file
		String []valuesInLine = aLine.split(","); 		 // Separate the values between the commas

		// Assign the variables needed to instantiate a bowler		
		teamNumber = Integer.parseInt(valuesInLine[0]);  // convert the first value from the line to an int & store it
		bowlerNumber = Integer.parseInt(valuesInLine[1]);// convert the second value from the line to an int & store it
		bowlerName = valuesInLine[2]; // store the third value from the line
		
		scores.add(Integer.parseInt(valuesInLine[3]));   // convert the first score to an int & add it to an ArrayList
		scores.add(Integer.parseInt(valuesInLine[4]));   // convert the second score to an int & add it to an ArrayList
		scores.add(Integer.parseInt(valuesInLine[5]));   // convert the third score to an int & add it to an ArrayList
		// We have all the data from the file stored in variables
		// We can define a Bowler
		Bowler aBowler = new Bowler(teamNumber,bowlerNumber, bowlerName, scores);
		//Create an ArrayList of bowlers & add it to the Map using the teamNumber
		}
	}
}
