package com.techelevator;

public class FranksArrayExample {
	
	public static void main(String[] args) {  
		
		System.out.println("Welcome to Frank's Array Example Program"); 
		int score1 = 10;
		int score2 = 20;
		int score3 = 30;
		int score4 = 50;	// this was added after the code was written & tested
		int score5 = 90; 
		
		int sum = 0; 		// this will hold the sum of the scores
		double avg = 0.0; 	// this will hold the avg of scores
	
		sum = score1 + score2 + score3 + score4 + score5;	
		avg = sum / 5;			
							// a change in data requires a change in code
							// this code is tightly coupled bc changes to the data requires changes to the code
							// tightly coupled code is bad practice bc one might forget to change the code in one place or another
		
		System.out.println("sum of scores: " + sum);
		System.out.println("sum of scores: " + avg);
							//------------------------------------------------------------------------------------------------
							// use an array to hold & process the scores to make the code loosely coupled
							// loosely coupled code is not directly bound to the data - sign of a professional programmer
							// changes to data does not require changes to the code
							//
		// Define an empty array & add elements to it later
//			int[] score = new int[5];  // define a new int array with 3 elements
//			
//			score[0] = 10; 	// set the first element in the array to the value of 10
//			score[1] = 20; 	// set the first element in the array to the value of 20
//			score[2] = 30; 	// set the first element in the array to the value of 30
//			score[3] = 80; 	// set the first element in the array to the value of 30
//			score[4] = 120; // set the first element in the array to the value of 30
			
		String[] instructors = { "Frank", "Mike", "Craig" };
		for (int i = 0; i < instructors.length; i++)
		{
		   System.out.println(instructors[i+1]);
		}
		
		
		// Defined & initialized an array to know the values - do not specify the number of elements 
		//	int[] score = {12,20,30,80,120}; // define & initialize at the same time
											// Java will allocate the # of elements based on the values in the list
			
		//Define a variable to hold the # of elements we want in the array & use that variable to define
			int numberElements = 5;  				// the value for this variable can come from anywhere
													// it must have a value when its used to create the variable
			
			int[] score= new int[numberElements];  // Java will use the value in numberElements to set the size of the array
			
							// changing the data does not require any changes to the code - loosely coupled code
							// use a for-loop to process each element in the array to determine the sum
			sum = 0;		// rest sum to 0 to remove previous value in sum
							// for-loop will iterate through a block of code until a condition is false.
							// a loop variable is defined in the for-loop & incremented each time through the loop
							// a condition in the for-loop is tested BEFORE each loop to see if it should loop
							// you will loop as long as the condition is true
							//
							// for (int i=0; i <scores.length; i++) - the value in i will start at 0 & will go to the length of scores (0,1,2,3)
							// 1. i will be set to 0
							// 2. check to see if i is less then the number of elements in score array (i < 3) - i=0,1,2 we loop; i=3=exit loop
							// 3. if #2 is true -continue on to step 4; if #2 is false - exit the loop
							// 4. execute the statement in the block
							// 5. increment i (add 1 to i)
							// 6. go back to step #2
							//
			
			 // init		cond		increment
			for (int i = 0; i < score.length; i++) { // loop while i is a valid index for the score array (i < scores.length)
				sum = sum + score[i];			  	 // add the element in score[i] to sum; score[i] is called the current element
			}
				avg = sum / score.length;			// divide sum by the number of elements in the array 
													// at the end of the loop sum will contain the total of all elements to get the avgerage
			
			System.out.println("sum of scores: " + sum);
			System.out.println("sum of scores: " + avg);
			}
   
}