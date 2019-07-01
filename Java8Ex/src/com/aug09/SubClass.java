package com.aug09;

public class SubClass extends SuperClass {
	
	public SubClass() {
		super();
		System.out.println("Sub class constructor");
		
	}
	
	public void process() {
		super.setWeight(23);
	}

}
