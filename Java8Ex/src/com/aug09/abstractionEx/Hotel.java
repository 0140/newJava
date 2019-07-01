package com.aug09.abstractionEx;

public abstract class Hotel {
	

	int price;
	
	public void orderADish(String type) {
		if (type.equals("sandwich")) {
			prepareSandwich();
			prepareInvoice();
		}
	}
	
	public   void prepareSandwich() {
		// Prepare the sandwich;
	};
	
	public abstract int  	prepareInvoice();
		
	 


}
