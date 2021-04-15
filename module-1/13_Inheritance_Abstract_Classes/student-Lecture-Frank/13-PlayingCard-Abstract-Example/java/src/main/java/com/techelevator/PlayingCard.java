package com.techelevator;
// abstract is an attribute applied to a class that can never be instantiated
// an abstract class can only be a superclass
// it provides a generic description of an object, the subclass refined the description by adding/removing variables & methods
public abstract class PlayingCard {
	
	// protected violates the strict interpretation of encapsulation
	
	protected int value;     // only members of this class & any subclass can access it  
	private String color;    // only members of this class can access it
	private String suit;     // only members of this class can access it 
	
	
	public PlayingCard(int value, String suit, String color) {
		this.value = value;
		this.suit  = suit;
		this.color = color;
	}
	
	public int getValue() {
		return value;
	}
	public String getColor() {
		return color;
	}
	public String getSuit() {
		return suit;
	}
	// the this keyword always means the current object - object to the left of the . that invoked the this
	public void setValue(int value) {
// currentObject.value = parameter-value	anObject.setValue(4)
		this.value = value;	// the object used to invoke setValue should be assigned the parameter value
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	@Override   // Ask compiler to verify this is a proper Override - same name, same parameters, same return-type
	public String toString() {
		return "PlayingCard [value=" + value + ", color=" + color + ", suit=" + suit + ", getValue()=" + getValue()
				+ ", getColor()=" + getColor() + ", getSuit()=" + getSuit() + "]";
	}
	
	// Override the Object class equals because it doesn't like what we want it to do - it doesn't know how to compare PlayingCard
	
	// since the Object class equals receives an Object & returns a boolean, we must do the same thing
	@Override   // Ask compiler to verify this is a proper Override - same name, same parameters, same return-type
	public boolean equals(Object obj) {  // Receive any type of Object
		if (this == obj) {  // If compare a PlayingCard to itself - this represents the object to left of .equals
			return true;
		}
		if (obj == null) {  // If compare to an undefined PlayingCard
			return false;
		}
		if (getClass() != obj.getClass()) {  // If compare to an object of a different class
			return false;                    // getClass() return the Class of an object
		}
		PlayingCard other = (PlayingCard) obj;  // Define a PlayingCard for the object that was passed
		if (color != other.color) {
			return false;
		}
		if (suit != other.suit) {
			return false;
		}
		if (value != other.value) {
			return false;
		}
		return true;
	}
	// an abstract method is defined when a superclass wants to insure any subclass defines/overrides the method
	// we don't know what the abstract method should do in the superclass, we just know we want the method
	public abstract void showCard();  // subclass MUST override this method
									  // code a 
}
