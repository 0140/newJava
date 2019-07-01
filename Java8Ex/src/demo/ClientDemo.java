package demo;

import practice.AccessTest;
import practice.Vehicle;



public class ClientDemo {

	public static void main(String[] args) {

		AccessTest at = new AccessTest();
		at.d = 90;
		//at.result = true;
		Vehicle v  = new Vehicle();
		v.getManufacturer();
		//v.get
		//System.out.println(v.getPrice());
		v = new Car();
		//System.out.println(v.getPrice());
		System.out.println("------------------");
		

		
		
		
		
		
		
		
		
		
		
		Car car = new Car();
		System.out.println(car.getPrice());
		car.cube(4);
		
		Vehicle v2  = new Car();
		//System.out.println(v2.getPrice());
		v2.setNumberOfWheels(6);
		
		
		
		//v2.cube(5);

	}
	
	/*double getPrice();
	String getPrice();*/
	
	public void demo()
	{
		//getPrice();
		
	}
}
