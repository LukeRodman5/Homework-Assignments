package com.techelevator;  // the package that holds the classes for this application

public class Lecture {     // a class within the application

	public static void main(String[] args) { // a function in the application class
		                                     //every Java application has at least a main function
		 /* variables are used to hold data needed for the program
          * Data & understanding the data is fundamental to writing a successful program	
          * In Java a variable is defined:  datatype name;
          * 								datatype name = initial-value;
          * 
          * If an initial value is not specified when you define the variable
          *   it's content is unknown which may lead to errors or unpredictable results.
          *   
          *   It's a good idea to ALWAYS initialize variables
          *   
          *   variable names must be unique within a block of code (between {})
          *   
          *   Common Java Data Types based on what they represent:
          *   
          *     If the value is numeric, without a decimal point:  int
          *     If the value is numeric, with a decimal point:     double
          *     If the value is a single character:                char
          *     If the value is multiple characters or words:      String
          * 	If the value is true or false:                     boolean
          * 
          *  String is a "special" data type
          * 
		/*
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
		*/
		int numberOfExercises = 26;
		// If you want to indicate a String value put it inside " "
		// display   these words    & the value in this variable
		System.out.println("the value in numberOfExercises is " + numberOfExercises); // Display whatever is between the ()

		/*
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/
		double half = .5; // 0.5 is ok too
		System.out.println("half contains: " + half);
		/*
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/
		String name ="Tech Elevator";
		System.out.println("name is " + name);

		/*
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/
		int seasonsOfFirefly = 1;
		System.out.println(seasonsOfFirefly);
		/*
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/
		String myFavoriteLanguage = "Java";
		System.out.println("my fav lang is " + myFavoriteLanguage);
		/*
		6. Create a variable called pi and set it to 3.1416.
		*/
		double pi = 3.1416;
		System.out.println("value of pi is " + pi);
		/*
		7. Create and set a variable that holds your name.
		*/
		String myName = "Luke Rodman";
		System.out.println("my name is " + myName);
		/*
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/
		int numMouseButtons = 2;
		System.out.println("# of mouse buttons = " + numMouseButtons);
		/*
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/
		int pctBattery = 0;
		System.out.println("battery % on your phone " + pctBattery);
		/*
		10. Create an int variable that holds the difference between 121 and 27.
		*/
		int diffBetween = 121-27;
		System.out.println("121 - 127 = " + diffBetween);
		/*
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/
		double sum = 12.3+32.1;
		System.out.println("12.3 + 32.1 = " + sum); //due to converting the internal format of a double to a display format
		/*
		12. Create a String that holds your full name.
		*/
		String fullName = "Luke A Rodman";
		System.out.println(fullName);
		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/
												  // + when used with String means concatenation (stick strings together)
		System.out.println("Hello " + fullName); // + when used with numerics means addition
												// data types used determine the operation performed
										       // .at the end of a string of words means end of a sentence (period)
											  // .between two numbers means decimal point
		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/
		fullName = fullName + " Esquire";  //DO NOT CODE THE DATATYPE when assigning a value to existing variable
		System.out.println(fullName);
		/*
		15. Now do the same as exercise 14, but use the += operator.
		*/
		fullName += " Esquire";
		System.out.println(fullName);
		/*
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/
		String movie = "Saw";
		movie += " 2";
		System.out.println(movie);
		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/
		movie = movie + "0";
		System.out.println(movie);
		/*
		/*
		18. What is 4.4 divided by 2.2?
		*/
		System.out.println("4.4 / 2.2 is: " + 4.4 / 2.2);
		/*
		19. What is 5.4 divided by 2?
		*/
		System.out.println("5.4 / 2 is: " + 5.4 / 2);
		/*
		20. What is 5 divided by 2?
		*/
		System.out.println("5 / 2 is: " + 5 / 2);
		/* 
		   /* the result = 2 NOT 2.2
		    *  5 / 2
		    *  int / int -Java does integer divide
		    *  int   -result is an int
		    *  integer divide results in a quotient & remainder
		    *  5/2 - quotient =2, remainder = 1	
		   */
		/*
		21. What is 5.0 divided by 2?
		*/
		System.out.println("5.0 / 2 is: " + 5.0 / 2);
		System.out.println("5F / 2 is: " + 5F / 2);
		/*
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/
		System.out.println("66.6 / 100 is " + 66.6 / 100); // answer is displayed oddly due to the issue of converting double to display value
		/*
		23. If I divide 5 by 2, what's my remainder?
		*/
		System.out.println("5 % 2 is: " + 5 % 2); // is modulus operator which returns the remainder of int divide
												  // 5/2 - quotient is 2 the  remainder is 1
		/*
		24. What is 1,000,000,000 * 3? -expecting the value 3,000,000,000
		*/
		System.out.println("10000000000 * 3 is " + 1000000000*3);   // result is not correct bc 3000000000 doesn't fit in an int
																    // int * int - result is an int
		System.out.println("10000000000 * 3L is " + 1000000000*3L); // by using the 'L' as a modifier the result will be a long
		/*
		25. Create a variable that holds a boolean called doneWithExercises and
		set it to false.
		*/
		boolean doneWithExercises = false;
		System.out.println("done With Exercises= " + doneWithExercises);
		/*
		26. Now set doneWithExercise to true.
		*/
		doneWithExercises = true;
		System.out.println("done With Exercises= " + doneWithExercises);
	}

}
 