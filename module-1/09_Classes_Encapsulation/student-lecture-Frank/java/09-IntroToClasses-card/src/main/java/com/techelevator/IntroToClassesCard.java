package com.techelevator;

public class IntroToClassesCard {
        //------------------------------------------------------------------------------------------------------------
        // Application program for the Intro To Classes App
        //------------------------------------------------------------------------------------------------------------
        // Every Java application must have one method called main()
		//
		// main () is where execution starts for any Java application
		//
		// main() is the Application Program
		//
		// Application Program instantiates & manipulates object to get it's work done
		// 
	
		public static void main(String[] args) {
        /*
        *  This program will demonstrate several concepts presented in the Java cohort
        *  in the topic Introduction to Classes 		
        */
// to instantiate an object:
//			ClassName  objName = new ClassName();	 // the () after the class name causes a constructor for the class to be run
													 // if no constructor for the class is found a default constructor
			PlayingCard aCard  = new PlayingCard();  // Instantiate a PlayingCard object
			
			System.out.println(aCard);				 // display aCard
													 // System.out.println - displays Strings
													 // Whatever you give it inside () must be convertible to a String
													 // aCard is a PlayingCard type - not a String
													 // System.out.println looks to a method to convert aCard to a String
													 // A class may provide a method called toString() to return a String 
													 //											...representation of an object of the class
			 									     //	If a toString() is not provided for the class an error occurs when a String is needed										
			 										 // System.ou.println() is NOT found for the class of an object, it looks to any class
													 //										...in the family of classes the Object belongs to
													 // PlayingCard does not have a toString() method, but it's ancestor, the Object class
													 //										... does have a toString() method so it is used
													 // Object class toString() method returns: package-name.class-name@location
		PlayingCard anotherCard = new PlayingCard(1, "Black", "Clubs");
		System.out.println("anotherCard is " + anotherCard);
		
		PlayingCard card3 = new PlayingCard(9, "Red", "Hearts");
		System.out.println("card3 is " + anotherCard);
		
		PlayingCard card4 = new PlayingCard(6, "Red", "Hearts");
		System.out.println("card4 is " + anotherCard);
		
		PlayingCard card5 = new PlayingCard(3, "Black", "Spades");
		System.out.println("card5 is " + anotherCard);
		
		
//		System.out.println("The value in card3 is: " + card3.cardValue);  // error bc cardValue is private in PlayingCard
			System.out.println("The value in card3 is: " + card3.getCardValue());  // Use the getter to see the value in the object
			System.out.println("The value in card4 is: " + card4.getCardValue()); 
			System.out.println("The value in card5 is: " + card5.getCardValue()); 
			
			card3.setCardValue(1);  // Change the cardValue in card3 to 1 using the setter method
			card4.setCardValue(4);
			card5.setCardValue(5);
			
			PlayingCard card6 = new PlayingCard (6, "Red", "Hearts");
			PlayingCard card7 = new PlayingCard (3, "Black", "Spades");
			
			if(aCard == card7) {  // you cannot use == to see if reference variables are equal - locations are compared not the content
				System.out.println("aCard is equal to itself");
			}
			else {
				System.out.println("aCard is NOT equal to itself");
				
			}
		}
}
