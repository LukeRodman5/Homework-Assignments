package com.techelevator;

/**
 * CreditCardAccount
 * 
 *  CreditCardAccount is a type of Accountable class
 */
public class CreditCardAccount implements Accountable {
	
/*******************************************************************
 * Place the code for  your CreditCard class here
 *******************************************************************/
	private String accountHolder; // need a getters for Strings & int
	private String accountNumber; 
	private int debt;
	
	public CreditCardAccount(String accountHolder,String accountNumber) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.debt 		   = 0;
	}
	public int pay(int amountToPay) {
		debt -= amountToPay;
		return debt;
	}	
	public int charge(int amountToCharge) {
		debt += amountToCharge;
		return debt;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getDebt() {
		return debt;
	}
	 

    public int getBalance() {	// required do to implementing the Accountable interface
    	//***************************************************************
    	// This should return the negative of the debt data member
    	//***************************************************************
    	
        return -0;
    }

 

}