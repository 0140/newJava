package jan22;

/**
 * Objects -- All entities in Java are modeled like a Class and Object.
 *       Objects interact with one another.
 *       
 * INheritance, Polymorphism, Encapsulation, Abstraction
 * 
 * 
 * 
 * @author bhaskar
 *
 */
public class Car extends Vehicle { //IsA

	
	public boolean blowHorn() {
		System.out.println("blowHorn");
		return true;
	}
	
	@Override
	public double getPrice() {
		System.out.println("getPrice");
		return 500;
	}
	
	
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.applyBrakes();
		double price = v.getPrice(); // 100
		
		System.out.println("For car");
		Car c = new Car();
		c.applyBrakes();
		c.blowHorn();
		price = c.getPrice(); // 500
		
		
		Vehicle v2 = new Car(); // Upcasting
		v2.applyBrakes();
		price = v2.getPrice(); // 
		System.out.println("upcasting price =" + price); 

		//v2.blowHorn();
		
		//Car c3 = (Car) new Vehicle(); // Downcasting 
		Car c3 = (Car) v2;
		//Typecasting is needed in Downcasting.
		
		int i = 10;
		double d =22.9;
		
		//d = i;
		i = (int) d;
		System.out.println("i=" + i);

		
		
		
		

	}

}
