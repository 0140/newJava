package sample;

public class StaticEx {

	static int i = 0;
	
	String timeout ;
	
	/**
	 * It is a block of code with no name.
	 * It is a block of code enclosed with {   } preceded by static.
	 * 
	 *  Static block of code runs when class is loaded into memory.
	 *  When we access the class first time, class loads into memory.
	 *  
	 *  We may be accessing the variables of the class or 
	 *  instantiating the class or accessing a static method..
	 *  
	 */
	
	static {
		// Read the data from DB or file if you want.
		// Use that to initialize the static var
		i = 45;
	}
	
	
	public static void main(String[] args) {
		int r = 54;
		
		/*
		 * When do use static?
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		{
			int g =0; //local variables
			System.out.println("main");
		}
		 
		
		process();

	}
	
	public static void process() {
		
		
	}

}
