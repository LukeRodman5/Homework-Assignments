package com.techelevator;

public class Fibonacci {
	
		
		/*********************************************************************
		 * Sample logic for Fibonacci problem
		 **********************************************************************
		* 1. Get the upper limit for the sequence from the user.
		* 2. Define a variable to hold the previously processed loop value
		* 3. Display a zero which is always the first number in the sequence
		* 4. Loop from 1 to the limit value
		*    (the for loop variable is the current loop value)
		*    (NOTE:  DO NOT CODE AN INCREMENT IN THE for STATEMENT  
		*     e.g. for (init; condition;)
		*    a. Display the current loop value
		*       (you may need to include a ' , ' somewhere too)
		*    b. Create a variable to hold the sum of the current loop value
		*              and the previous loop value
		*    c. Remember the current loop value in the variable
		*              that is holding the previously processed loop value
		*    d. Set the loop variable to the sum of the
		*              previous loop value + current loop value (step b)
		***********************************************************************/
//		public static void main(String[] args) {
// cannot figure this out? exception in thread "main" Index 0 out of bounds for length 0
//			int limit = Integer.parseInt(args[0]);
//			int previous = 0;
//			System.out.print("0");
//			for(int next = 1; next < limit; ) { 
//				System.out.print(", "+next);
//				int temp = previous + next;
//				previous = next;
//				next = temp;
//			}
//		}
//	}