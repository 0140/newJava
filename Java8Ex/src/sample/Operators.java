package sample;

import java.util.ArrayList;

 
 

public class Operators {
	
	public int n;
	
	public static void main(String[] args)
	{
		
		int i =3;
		int p=8;
		
		if ( i>4 & i<8)
		{
			int pt;
			System.out.println("Yes.");
		}
		
		if ( i>4 && i<8)
		{
			
			System.out.println("Yes.");
		}
		
		// What is NullPointerException and when it comes?
		Object f = null;
		
		if ( f != null &&  f.hashCode() > 100)
		{
			System.out.println("Yes First");
		}
		
		
		if ( f == null ||  f.hashCode() > 100)
		{
			System.out.println("Pipe line");
		}
		
		
		System.out.println("End.");
		
		 
		
		String g= (4 > 5) ? "Hello" : "sorry"; /// tertiary operator
		
		int a =9, b = 5;
		// Exchange the values between a and b without using third variable
		
		
		a = a+ b;
		b = a - b;
		a = a - b;
		//---------------------------------
		int n = 34;  // fizz buzz
		
		// --------------------------------------------
		 //n % 3 == 0
		
		// -------------------------------
		
		n = 10;
		 
		System.out.println(n++ + ++n);
		//10 + 12
		n = 10;
		i = n++;
		System.out.println("i=" + i);
		
		ArrayList a1 = new ArrayList();
		
		for(Object o: a1)
		{
			System.out.println(o);
		}
		
		// Bubble sort
		
		/*
		 
		*****
		****
		***
		**
		*
		*
		            */
		
		Dog d= new Dog();
		
		 
		
		i();
		
		Operators op = new Operators();
		op.calc();
		
	}
	
	
	public  static void i() {
		System.out.println("From i");
		//n = 22;
	}
    
    double calc() {
		System.out.println("From i");
		return 6.7;
	}
    
    City calc2() {
		System.out.println("From i");
		
		//City c = new City();
		return new City();
	}

	

}



