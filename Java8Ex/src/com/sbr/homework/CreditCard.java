package com.sbr.homework;

import java.io.IOException;
import java.util.Date;

public class CreditCard {
	
	public boolean validateCard(String cardNumber)  {
		System.out.println("From CreditCard validateCard");
		return true;		
	}
	
	 
	
	public Account validateCard(String cardNumber, Date date) throws IOException {
		System.out.println("From CreditCard validateCard");
		return new Account();		
	}
	
	public String getCardNumber() {
		return "";
	}
	
	private CreditCardDetails getCreditCardDetails(String SSN, Person p) {
		return new CreditCardDetails();
	}
	
	public CreditCardDetails getCreditCardDetails(String cardNumber, Date expiryDate, String securityCode) {
		return new CreditCardDetails();
	}
	
	// Overloading 1
		public static Object getAccountInfo(String SSN) {
			return new Object(); // account object
		}
	
	public static void main(String[] args) {
		CreditCard cr = new CreditCard();
		cr.validateCard("6587385383");	
		
		/*CreditCard cr2 = new Visa();
		cr2.validateCard("6587385383");
		
		cr2 = cr;
		cr2.validateCard("6587385383"); // runtime polymorphism
*/		
		/*cr2 = new Amex();
		cr2.validateCard("6587385383");*/
		
		
		
	}

}
