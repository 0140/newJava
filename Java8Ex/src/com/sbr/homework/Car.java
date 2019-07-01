/*package com.sbr.homework;

import java.util.HashMap;

import com.aug09.oops.Visa;

*//**
 * 
 * UML
 * IsA HasA relation. Difference.
 * Contains relation
 * 
 * 
 * @author bhaskar
 *
 *//*
public class Car extends Vehicle  { // 
	
	public static final double PI = 22/7;

	private boolean leatherInteriors;
	private Address addr = null;
	private HashMap map = new HashMap();
	private String owner;
	
	public Car() {
		leatherInteriors = false;
	
	}
	
	
	public Car(boolean leatherInteriors, Address addr) {
		//this();
		super("brbfv4387r8", 4);
		this.leatherInteriors = leatherInteriors;
		this.addr = addr;
		
		double d = getPrice();
		super.noOfWheels = 6;
		double d2 = super.getPrice();
		

	}
	
	public Car getTheCar() {
		return this;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	public boolean isLeatherInteriors() {
		return leatherInteriors;
	}


	public void setLeatherInteriors(boolean leatherInteriors) {
		this.leatherInteriors = leatherInteriors;
	}


	public Car getCar() {
		return this;
	}
	
	
	
	public boolean applyBrakes(boolean frontBrakes, boolean rearBrakes){
 		return false;
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		 c.blowHorn();
		 c.vinid = "";
		 
		if (c instanceof Car) System.out.println("c instanceof Car.");
		
		Vehicle v = new Car();
		if(v instanceof Car) System.out.println("v instanceof Car.");
		//v.getPrice(); 
		
		
		v = new Vehicle();
		if(v instanceof Car) System.out.println("v instanceof Car.");
		
		//double d = v.getPrice(); 
		//v.getPrice(2000);
		
		boolean frontBrakes = true;
		v.applyBrakes();
		v.applyBrakes(frontBrakes); // // compile time polymorphism
									// Overloading
									// static binding
		v = new Vehicle();
		v.getPrice();  // super class method
		v = new Car();
		v.getPrice();  // sub class method 
						// runtime polymorphism -- ref var pointing sub
		//class type or super type 
		// compiler does not know which class or method to invoke
		// Java knows which class and method to invoke at runtime.
		// So, runtime polymorphism
		
		// overloading can be implemented in sub class or same class
		// overriding is implemented only in sub class
		
		// overloading can have entirely different return type.
		// But, only, return type can not be different.
		
		// overloading is static binding. -- compile time -- compiler 
		// knows which class and method. So, it is static binding
		
		// Overriding -- dynamic binding -- at runtime lnoy,  java
		// knows which class and method to invoke. Not at compile time.
		// So, it is dynamic binding.
		
		// Polymorphism -- poly -- means many.
		//					morph means forms.
		// polymorphism means multiple forms.
		// Same method name with different parameters is known as 
		// overloading.
		// Same method name with same parameters in sub class is known as
		// overriding
		// Polymorphism can be implemented using overloading or overriding.
		
		
		
		
		
	}
	
	@Override
	public Visa getPrice() {

		//return noOfWheels * 3000;
		
		return null;
	}
	
	 
	public double getPrice(boolean leather, boolean sports) {
		
		double price = 5000;
		price = leather ? price+ 1500: price;
		if(sports) price+= 2000;
		 
		return price;
	}
}
*/