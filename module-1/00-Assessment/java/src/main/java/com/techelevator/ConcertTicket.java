package com.techelevator;

public class ConcertTicket {
	String TicketType;
	Boolean tshirtPurchased;
	Boolean isVIP;
	double ticketPrice;

	//ticket price: indicates the price of the ticket based on type (Orchestra $100.00, Balcony
	//		$79.99, General $50.00, Promo $0). VIPs get 40% off the regular price of their ticket
	//		3. Create a constructor that accepts ticket type, t-shirt purchased, and is VIP.
	//		4. Instantiate an object (or objects) in main() or Main() and use the object(s) to test your methods.

	//5. Create a method that determines an adjusted ticket price based on how many days before the event a
	//ticket was purchased. The method will receive int daysBefore.
	//Return the ticket price if daysBefore is equal to 0.
	//Return ticket price times .95 if daysBefore is between 1 and 10.
	//Return ticket price times .90 if daysBefore is between 11 and 20.
	//Return ticket price times .80 if daysBefore is between 20 and 30.
	//Return ticket price times .75 if daysBefore is greater than 30
	
	
	
	
public ConcertTicket(String TicketType,Boolean tshirtPurchased,Boolean isVIP,double ticketPrice) {
	this.TicketType			= TicketType;
	this.tshirtPurchased	= tshirtPurchased;
	this.isVIP				= isVIP;
	this.ticketPrice		= ticketPrice;
	
 	}
}