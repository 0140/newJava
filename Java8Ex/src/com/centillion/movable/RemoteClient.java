package com.centillion.movable;

import com.centillion.Vehicle;

public class RemoteClient {

	public void makeEmergency() {
		//call1800();
	}
	
	public static void main(String[] args) {
		Vehicle v= new Vehicle();
		v.setName("Guava Inc");
		System.out.println(v.getName());
		
		String m = v.getMake();
		//v.call1800();
		

	}

}
