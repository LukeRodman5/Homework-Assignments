package com.techelevator;

// public indicate anyone may use this class - instantiate objects of the class
public class PlayingCard {

	// This is a class to represent a Playing Card
	//
	// A class has data (variables) & behaviors (methods)
	//
	// We've identified the following characteristics for a Playing Card:
	// 
	//		value
	//		suit
	//		color
	//		shape
	//		face up / face down
	//
	// The characteristics or date for a class may also be called attributes
	//
	// The attributes for a class are defined as member variables
	// A variable is a "member variable" if it's defined in a class
	// 
	// TO define a member variable: access - public - anyone can access it
	//										 private - only members of the class can access it
	//								data-type
	//								name
	//
	// using private on variables implements encapsulation
	// encapsulation means we are protecting the data from access outside the class
	//
	/***************************************************************************************
	 * Data members of the class
	 ***************************************************************************************/
	private int cardValue; // Ace=1, Jack=11, Queen=12, King=13
	private String cardSuit; 
	private String cardColor;
	private String cardShape;
	private boolean faceUp;
	
	/***************************************************************************************
	 * Methods for the class
	 * @param string 
	 * @param i 
	 ***************************************************************************************/
	//---------------------------------------------------------------------------------------
	// Constructors - initialize new objects - run automatically by Java when new objects are created
	//---------------------------------------------------------------------------------------
	// Every class should provide constructor methods to initialize objects of the class
	// If constructors are not provided, Java runs a default constructor to initialize an object
	// The Java default constructor set objects-null, numerics=0 & booleans=false
	//
	// constructors are special methods in a class: no return type (not even void), name is same name as the class
	//
	// method overload is method w/ the same name as another method, but w/ deifferent parameters
	//
	// constructors are always overloaded methods
	//
	// Define a default constructor for this class
	
	PlayingCard(int i, String string) { // default constructor - takes not args & assigns default values to the data members
		cardValue = 9;
		cardColor = "Red";
		cardSuit  = "Clubs";
		cardShape = "Nonagon";
		faceUp 	  = true ;
		
	}
	
	// To allow a user to define any PlayingCard we need to create a constructor that take parameters for the data values
		PlayingCard(int value, String color, String suit) { // s arg constructor bc it takes 3 parameters
			cardValue = value; // Set the cardValue to the value parameter passed from the user
			cardColor = color; // Set the cardColor to the color parameter passed from the user
			cardSuit  = suit; // Set the cardSuit to the suit parameter passed from the user
			cardShape = "Nonagon"; // cardShape will always be "Nonagon"
			faceUp 	  = true ; // faceUp will always be true
			
		}
//---------------------------------------------------------------------------------------
// Getters / Setters - methods that allow the user to retrieve values from the object
//					...& change values in the object
//		
// Due to encapsulation (making data members private) there is not access to the data outside the class
//
// Getters / Setters allow us to control access from outside through methods
// 
//		
//---------------------------------------------------------------------------------------			
		
		
//---------------------------------------------------------------------------------------
// Additional class methods to support the class
//---------------------------------------------------------------------------------------		
// Getters & Setters generated by Eclipse follow the convention for getter/setter name
// 	getVariableName		setVariableName		isVariableName(boolean getter)		
	public int getCardValue() {
			return cardValue;
		}

		public void setCardValue(int cardValue) {
			this.cardValue = cardValue;
		}

		public String getCardSuit() {
			return cardSuit;
		}

		public void setCardSuit(String cardSuit) {
			this.cardSuit = cardSuit;
		}

		public String getCardColor() {
			return cardColor;
		}

		public void setCardColor(String cardColor) {
			this.cardColor = cardColor;
		}

		public String getCardShape() {
			return cardShape;
		}

		public void setCardShape(String cardShape) {
			this.cardShape = cardShape;
		}

		public boolean isFaceUp() {  // Conventional name for a boolean getter
			return faceUp;
		}

		public void setFaceUp(boolean faceUp) {
			this.faceUp = faceUp;
		}

	// toString() which will return a PlayingCard object as a String
	public String toString() {
		return "PlayingCard [cardValue=" + cardValue + ", cardSuit=" + cardSuit + ", cardColor=" + cardColor
				+ ", cardShape=" + cardShape + ", faceUp=" + faceUp + "]";
		
	}
	}
	
	
	
	
