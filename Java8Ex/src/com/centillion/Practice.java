package com.centillion;

public class Practice {

	int n = 3;
	boolean result = false;
	float fg = 2.3F;

	// primitive types
	// reference variables

	public static void main(String[] args) {
		int x = 7;
		x = 78;
		
		double d2 = 45.6;
		System.out.println("Hello World");

		Practice p = new Practice(); // how to to cretae instance
		p.n = 4;
		p.fg = 4;

		Practice p2 = new Practice();
		System.out.println(p.n);

	 
		
		char myChar = 'D';
		
		char hj = '\u007D';
		System.out.println(x);

		First f = new First();
		f.k = 78;
		
		int a =4, b = 7;
		// exchange the values in a and b. Do not use third variable.
		
		b = a+ b; // 11
		a= b - a;  //  7
		b = b - a; // 4
		
		
		b = a- b;
		
		int n = 9;
		int m = n++;
		  
		System.out.println("m=" + m + " n=" + n);

		n = 10;
 		int q = n++; // n=11, q=10
		int z = ++n; // z= 12, n =12
		
		int h = n++ + ++n; // 10 + 12
		System.out.println("h=" + h);
		
		h--;
		
		b= a * b;
		
		a= 9; b= 2;
		b = a/b; // b= 4
		
		float j = a/b; // 4.5
		
		a= 10; b = 3;
		
		a= 7; b = 3;
		x = a % b;  // remainder 1
		
		// Ternary operator
		
		a= 7; b = 3;
        x = (a % b != 0) ? 100 : 200; 
        
        x = 10;
        if (x >= 5) {
        	System.out.println("x >= 5");
        } else {
        	System.out.println("x <  5");
        }
        
        if (x >= 5) System.out.println("x more than 5.");
        
        if ( x <= 5) {
        	System.out.println("First Part.");
        } else if (x <= 10) {
        	System.out.println("Second Part.");
        } else if (x <= 20) {
        	System.out.println("Third Part.");
        } else {
        	System.out.println("Final Part.");
        }
        
        
		int t = 10;
		t+= 3; // t=t+3;
		t-= 5;
		t/= 3;
		t *= 6; 
		
        t = 3;
        
        if ( ! ((t > 2) & (t < 10))  ) {        	
        	System.out.println("& is good.");
        } else {
        	System.out.println(" No &.");

        }
        
        First first = null;
        First second  = new First();
        
        if (first != null   ) {
        	System.out.println("First is not null.");

        }
        
        if (first == null ) {
        	System.out.println("First is null.");

        }
        	
        
		
		
		
		
		
		
		

	}

}
