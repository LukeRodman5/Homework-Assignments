package com.techelevator;

public class ItalianCard extends PlayingCard {// This is a subclass of PlayingCARD
	// Every class needs at least one constructor
	public ItalianCard () { // Default constructor
	// Because this is a subclass, we need to run a constructor of the class
	// The superclass has only one 3-arg constructor that takes a value, suit , & color
	//
	// Default Italian card: 1, SWORDS, RED
	super(1,"SWORDS","RED");	// call the superclass constructor to initialize the data it knows about
}

}
