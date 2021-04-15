package com.techelevator;

//If we use something that is not part of the standard Java language we need to import the code that supports it
import java.util.Scanner;  // Give me access to the Scanner stuff provided by Java

public class TempConvert {

	public static void main(String[] args) {

									
		/* 
		 * (F)ahrenheit to (C)elsius conversion formulas:
		 		* F to C conversion: Tc = (Tf - 32) * 5/9
		 					  * -or- Tc = (Tf - 32) * .56
		 		* C to F conversion: Tf = (Tc * 5/9) + 32
		 					  * -or- Tf = (Tc * .56) + 32 
		  		 	* Tc = Temp in Celsius
		 			* Tf = Temp in Fahrenheit
		 */
		
		Scanner userInput = new Scanner(System.in); // Create a Scanner object for the keyboard called userInput
			
		System.out.print("Please enter the temperature: ");
		String tempAs = userInput.nextLine();
			
		System.out.print("Is the temperature in (C)elcius, or (F)arenheit? ");
		String tempTypeAs = userInput.nextLine();

		double temp = Double.parseDouble(tempAs);
		
		char tempType = tempTypeAs.charAt(0);

		double result;
		
		char resultType;
			if(tempType == 'c' || tempType == 'C') {
				result = (temp *.56* + 32);
				resultType = 'F';
				} else {
					result = (temp - 32) *.56;
					resultType = 'C';
					}

		System.out.println("" + temp  + tempType + " is " + result + resultType);

		}
}
