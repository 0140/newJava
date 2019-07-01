package com.centillion;

public class Vehicle {
	private String name = "ABC Inc";
	double weight;
	
	public Vehicle(String name, double weight ) {
		this();
		System.out.println("Vehicle Constructor Parameterized.");
		this.name = name;
		this.weight = weight;
	}
	
	public Vehicle() {
		
		name = "XYZ Inc";
		System.out.println("Vehicle Constructor");
	}
	
	public String getName() {
		SUV s = new SUV();
		
		String type =  s.getType();
		return type+ " " + name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String getType() {
		return "VEHICLE";
	}
	
 	public final  String getMake() {
		return "Ford";
	}
	
	protected  void call1800() {
		System.out.println("Callling 1800");
	}
	
	public void applyBrakes() {
		System.out.println("Vehicle Brakes applied.");

	}
	
	
	
	

}
