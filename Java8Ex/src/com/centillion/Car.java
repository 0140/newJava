package com.centillion;

// IsA hasA 
public class Car extends Vehicle {
	
	private String vinNumber = ""; // members // attributes or functuons
	private boolean specialEdition;
	
	public Car() {
		super();
		System.out.println("Car Constructor.");
	}
	
	public Car(String name, double weight, String vinNumber ) {
		super(name, weight);
		this.vinNumber =  vinNumber;
 		System.out.println("Car Constructor with parameters.");
	}
	
	
	@Override
	public String getType() {
		return "CAR";
	}

	public String getVinNumber() {
		return vinNumber;
	}

	public void setVinNumber(String vinNumber) {
		this.vinNumber = vinNumber;
	}

	public boolean isSpecialEdition() {
		return specialEdition;
	}

	public void setSpecialEdition(boolean specialEdition) {
		this.specialEdition = specialEdition;
	}
	
	@Override
	public void applyBrakes() {
		System.out.println("SPecial car brakes");
		System.out.println("Brakes applied.");

	}

	@Override
	public String toString() {
		return "Car [vinNumber=" + vinNumber + ", specialEdition="
				+ specialEdition + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		
		if (!(o instanceof Car)) return false;
		Car incoming = (Car) o;
		
		if (this.getName().equals(incoming.getName()) && this.getMake().equals(incoming.getMake())) {
			return true;
			
		}
		
		return false;
	}
	
	
	
}
