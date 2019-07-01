package com.aug09.abstractionEx;

public class NonACHotel extends Hotel {
	boolean airConditioned = false;

	@Override
	public int prepareInvoice() {
		 if ( !airConditioned) price += 10;
		 return price;
	}

}
