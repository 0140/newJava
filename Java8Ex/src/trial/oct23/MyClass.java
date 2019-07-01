package trial.oct23;

import com.centillion.First;

public class MyClass {

	double d; // 0
	First g; //  null
	
	public static void main(String[] args) {
		 First first = null;
	        First second  = new First();
	        int x = 10;
	        
	        if (first == null & (x <5)) {
	        	System.out.println("First is null.");

	        } else {
	        	System.out.println("OK. False.");

	        }
	        
	        if (first != null &&  first.k != 7 ) { // Coding mistake. This should be avoided.
	        	System.out.println("First is not null.");
	        } else {
	        	System.out.println("OK !!!. False.");
	        }
	        
	       
	        if(first == null || first.k != 7 ) { // UNIX pipeline character
	        	System.out.println("Or. True.");

	        } else {
	        	System.out.println("Or. False.");
	        }
	        
	        
	        
	       

	}

}
