package sample;

import java.util.Scanner;

/**
 * This helps understand....
 * 
 * @author bhaskar
 *
 */
public class One {
	
	int y  = 2;
	
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		 
		 System.out.println("Hello World.");
		 
		 int x = 45 ;
		 
		 System.out.println("Input Arr:" + args[0] + " " + args[1] 
				 			+ " " + args[2]);

		 
		 System.out.println(x );
		 System.out.println("Please enter some string:");

		 Scanner s = new  Scanner(System.in);
		 String s2 = s.nextLine();
		 System.out.println(s2 );
		 
		 int n = s.nextInt();
		 System.out.println(n );

		 One t = new One();
		 t.process();
		 
		 One m = new One();
		 m.y = 3;
		  
	}
	
	
	public void process() {
		 
	}
	
	

}
