package com.centillion;

public class LocalClient {

	public static void main(String[] args) {
		Vehicle v= new Vehicle();
		v.setName("Guava Inc");
		System.out.println(v.getName());
		
		String m = v.getMake();
		
		Car c = new Car();
		c.getName();
		System.out.println("Check Car constructor");

		Vehicle veh = new Vehicle();
		veh.getName();
		veh.applyBrakes();
		
		System.out.println("Before Car constructor");
		veh = new Car();
		veh.applyBrakes();
		System.out.println("After Car constructor");

		System.out.println(veh.getType());
		
		Vehicle vw = new Vehicle("GM", 1500);
		
		//Car car = new Car("GM", 1500);
		Car c2 = new Car("GM", 456, "SUSK");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
