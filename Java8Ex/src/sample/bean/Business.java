package sample.bean;

import java.util.Date;

public class Business {
	
	public void performBusiness()
	{
		
		Customer customer = new Customer();
		
		customer.setName("Ramesh");
		
		Address address = new Address();
		address.setAddressLine1("14 Washington Rd");
		address.setAddressLine2("  ");
		address.setCity("Princeton JCT");
		
		customer.setAddress(address);
		
		//customer.setAddr1("20 Washington Rd");
		//customer.setCity("Princeton");
		
		CreditCard card = new CreditCard();
		card.setCcNum("234345435");
		card.setExpDate(new Date());
		card.setCcNum("565");
		
		customer.setCc(card);
		
		// Printing ...
		
		CreditCard cccard = customer.getCc();
		
		System.out.println(customer.getName());
		
		
		
		
	}

	public static void main(String[] args) {
		 
		Business business = new Business();
		business.performBusiness();
		
		System.out.println("Done");

	}

}
