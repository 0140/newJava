package com.aug09.abstractionEx;

public class AirConditionedHotel extends Hotel {
	boolean airConditioned = true;

	public int prepareInvoice() {
		if (airConditioned) price += 20;
		return price;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
