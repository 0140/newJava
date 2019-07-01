package practice;

import java.io.FileNotFoundException;

public  class Vehicle {
	
    String manufacturer;
	int numberOfWheels = 2;
    
	String context = "Dealer";
	
	  public String getManufacturer()  {
		if (context.equals("Dealer")) {
			return manufacturer;
		} /*else {
			throw new IllegalAccessException();
		}
		*/
		else {
			return "";
		}
	}

    void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	protected  String getEngineType() {
		return "6 Cylinder";
	}

	 public double getPrice()  throws FileNotFoundException {
		 double price = numberOfWheels *1000;
		 return price;
	 }

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	 

	public static void main(String[] args) {
		 
	}
}
