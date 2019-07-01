package com.centillion;

public class Looping {

	public static void main(String[] args) {
		 
		int p =4;
		int i=6;
		for ( i=0 ; i < 6; i++) { // fixed iter
			p++;
			System.out.println("i=" + i);
			System.out.println("p=" + p);

		}
		
		p++;
		System.out.println("Done.");
		
		i=5;
		while (i > 0) { // when we do not know how many times
			System.out.println("Done.");	
			i--;
		}
		
		i = 4;
		do {
			System.out.println("Done.");	
			i--;
			
		} while (i > 0);
		
		for (  i=0 ; i < 6; i++) {  
			 
			if (i == 3) break;
			System.out.println("i=" + i);

		}
		
		System.out.println("Last line after break" );

		for (  i=0 ; i < 6; i++) {  
			 
			if (i == 3) continue; // stop current iteration 
							// and begin next iteration immediately
			System.out.println("i=" + i);

		}
		
		System.out.println("Last line after continue" );

		
		
		
		
		

	}

}
