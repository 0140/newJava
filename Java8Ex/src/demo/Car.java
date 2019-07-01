package demo;

import java.io.FileNotFoundException;

import practice.Vehicle;

/**
 * IsA. Relation between sub and super class is known as IsA relation. Car IsA Vehicle.
 * HasA The relation between a class and its members is known as IsA relation.
 *       It is also a contains relation ship.
 *       Car contains type. Car hasA type.
 * 
 * @author bhaskar
 *
 */
public class Car extends Vehicle {
	 
	
	String type = "Sports";
	int numberOfWheels = 4;
	
	/*protected String getEngineType() {
		return "4 Cylinder";
	}*/
	
	 public int cube( final int n){  
		 
		 //n = 4;
		 return n*n*n;
	 }
	
	public String configureEngine() throws IllegalAccessException {
		Vehicle v = new Vehicle();
		// setManufacturer("GM"); // default not visible
		
		String eng = getEngineType(); 
		// protected not visble to non sub classes outside the package
		// protected visible to sub class outside the package
		
		if (type.equals("sports"))  eng  = "8 cylinder";
		
		if(getManufacturer().equals("GM")) return "10 Cylinder";
		
		return eng;
	}

	 
	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		
		Vehicle v = new Vehicle();
		//v.setManufacturer("GM");
		System.out.println("Vehicle Manufacturer:" + v.getManufacturer());
		//v.manufacturer = "GM";
		
		
	}
	
	public double getPrice()  {
		 double price = numberOfWheels *1000;
		 return price;
	 }

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	
}
