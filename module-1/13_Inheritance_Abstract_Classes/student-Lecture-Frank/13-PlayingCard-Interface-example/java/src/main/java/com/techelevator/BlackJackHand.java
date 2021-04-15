package com.techelevator;

import java.util.ArrayList;

// a BlackJack hand is a type of CardHand - "type of" == interface
public class BlackJackHand	 implements CardHand {

	private int numCardsInHand = 2; 		// starting number of cards in a hand
	
	private ArrayList<PlayingCard> aHand;	// Represent the hand as an ArrayLiast
	
	public BlackJackHand() {				// Define how many card in your hand
		aHand = new ArrayList<PlayingCard>(numCardsInHand);
	}
	
	// we need to override the methods required by the CardHand interface
	
	@Override
	public ArrayList<PlayingCard> getHand() {
		return aHand;
	}

	@Override
	public void addCard(PlayingCard aCard) {
		aHand.add(aCard);	// Use the ArrayList add() a card to the hand
		numCardsInHand++;
	}

	@Override
	public void emptyHand() {
		aHand.clear();		// Use the ArrayList clear() to empty the hand

	}

	@Override
	public void show() {
		for (PlayingCard aCard : aHand)
		{
			System.out.println(aCard);
		}
			return;
	}
	// Methods to provide additional functionality beyond what is required by the CardHand interface
	// Do not code the @override to ask the compiler to verify the proper overrides since they are not overrides
	public void dealHand(CardDeck aDeck) {
		for (int i=0; i < numCardsInHand; i++ ) {
			aHand.add(aDeck.dealCard());
		}	
	}
	
}
	
