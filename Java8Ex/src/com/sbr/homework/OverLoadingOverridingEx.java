package com.sbr.homework;

import java.io.IOException;
import java.util.Date;

import ExceptionPack.aug08.ATTException;

public class OverLoadingOverridingEx extends CreditCard {

	  
	
	
	// Overloading 2, same name diiferent arguments...
	public static Object getAccountInfo(String name, String account_number) {
		return new Object(); // account object
	}
	
	/*public static Account getAccountInfo(String name, String account_number) {
		return new Account(); // Only return type can not be different
	}*/
	
	public static Account getAccountInfo(String name, Address addr ) {
		return new Account(); // account object
	}
	
	/**
	 *  Super class method is overridden
	 * @see sample.CreditCard#validateCard(java.lang.String)
	 */
	public boolean validateCard(String cardNumber)  {
		System.out.println("From sub class validateCard");
		return true;		
	}
	
	@Override  // Covariant return type // Visibility can not decrease, Increase possible.
	public CheckingAccount validateCard(String cardNumber, Date date)   {
		System.out.println("From CreditCard validateCard");
		return new CheckingAccount();		
	}
	
	public static void main(String[] args)   {
		OverLoadingOverridingEx example = new OverLoadingOverridingEx();
		example.getAccountInfo("54675476"); // Compiletime polymorphism
		example.getAccountInfo("Ram", "Address");
		
		CreditCard card = null;
		card = new CreditCard();
		card = new OverLoadingOverridingEx();
		
		try {
			card.validateCard("", new Date()); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// card ????
	}

}
