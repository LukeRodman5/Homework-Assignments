package com.techelevator;

import java.util.ArrayList;

public class UsePlayingCards {

	public static void main(String[] args) {
		
		AmericanPlayingCard aUSACard  = new AmericanPlayingCard(1, "HEARTS");
		System.out.println("aUSACard is :");
		aUSACard.showCard();

		AmericanPlayingCard aUSACard2 = new AmericanPlayingCard(14, "SPADES");
		System.out.println("aUSACard2 is :" );
		aUSACard2.showCard();
		
		AmericanPlayingCard aUSACard3 = new AmericanPlayingCard(-1, "SPADES");
		System.out.println("aUSACard3 is :");
		aUSACard3.showCard();
			
		AmericanPlayingCard aUSACard4 = new AmericanPlayingCard(11, "JASON");
		System.out.println("aUSACard4 is :");
		aUSACard4.showCard();
		
		ItalianPlayingCard anItalianCard1 = new ItalianPlayingCard(13, "SWORDS");
		System.out.println("anItalianCard1 is :");
		anItalianCard1.showCard();
		
		ItalianPlayingCard anItalianCard2 = new ItalianPlayingCard(9, "COINS");
		System.out.println("anItalianCard2 is :");
		anItalianCard2.showCard();
		
		ItalianPlayingCard anItalianCard3 = new ItalianPlayingCard(11, "JASON");
		System.out.println("anItalianCard3 is :");
		anItalianCard3.showCard();
		
		SwissPlayingCard aSwissCard1 = new SwissPlayingCard(13, "ROSES");
		System.out.println("aSwissCard1 is :");
		aSwissCard1.showCard();
		
		SwissPlayingCard aSwissCard2 = new SwissPlayingCard(9, "SHIELDS");
		System.out.println("aSwissCard2 is :");
		aSwissCard2.showCard();
			
		SwissPlayingCard aSwissCard3 = new SwissPlayingCard(10, "ACORNS");
		System.out.println("anSwissCard3 is :");
		aSwissCard3.showCard();
			
		SwissPlayingCard aSwissCard4 = new SwissPlayingCard(11, "JASON");
		System.out.println("anSwissCard4 is :");
		aSwissCard4.showCard();		
		//*************************************************************************
		// The start of the Polymorphism examples
		//*************************************************************************
		
		System.out.println("\n----------Polymorphism examples start here --------\n");
		
		PlayingCard aCard = null; // Define a super class object that is empty
		
		aCard = aUSACard;      // Assign a subclass object to a super class variable
						     // Normally you cannot assign an object of one class to an object of another class
					        // Inheritance lets you assign a subclass object to a super call variable
						   // 		so you take advantage of Polymorphism
	// PlayingCard.PlayingCardMethod() - the compiler thinks that it's running the method that belong to the class of the object
		aCard.showCard(); // Use the super class object to run a common method in the Inheritance hierarchy
						 // All subclasses have  of a showCard() method - Polymorphosm will decide which to run
						// In this case, it runs the AmericanPlayingCard showCard() method
		
		

		aCard = aSwissCard1; 
		aCard.showCard(); // run the SwissCard showCard()
			
		aCard = anItalianCard1;
		aCard.showCard(); // run the ItalianCard showCard()
			
			
		System.out.println("\n--------Polymorphism examples using an ArrayList-------\n");
		
		// Define a Collections class object or a regular array w/ the data type of super class
		// You have a group of super class objects
		ArrayList<PlayingCard> cardList = new ArrayList();
		
		// Add subclass objects to the ArrayList of super class objects
		cardList.add(aSwissCard1); // add a subclass object
		cardList.add(aSwissCard2); // add a subclass object
		cardList.add(anItalianCard1); // add a subclass object
		cardList.add(aUSACard); // add a subclass object
		cardList.add(aUSACard2); // add a subclass object
		
		for(PlayingCard theCard: cardList) { // use the superclass for the for-each variable
			theCard.showCard();				 // use the for-each variable to invoke the method
		}
		//because of Polymorphism we don't need to know or care what type of object is in the for-loop
		//			variable each time through the loop
		
		
		
	 } // end of main() method
		
  } // end of the application program class

