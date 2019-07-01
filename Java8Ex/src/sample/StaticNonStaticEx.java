package sample;

import java.util.ArrayList;

 
 

public class StaticNonStaticEx {
	
	public int n;
	
	// Static method can call another static // because both belong to class
	// static method can not call non static method directly. Create object and call. -- non static belongs to object
	//non static method can call static method -- Yes
	
	// Static method can not call non static variable directly -- non static belongs to object
	
	public static void main(String[] args)
	{
		
		int i =3;
		int p=8;
		
		if ( i>4 & i<8)
		{
			int pt;
			System.out.println("Yes.");
		}
		
		
		i();
		
		StaticNonStaticEx op = new StaticNonStaticEx();
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
    
    City calc2(int t) {
		System.out.println("From i");
		
		
		//City c = new City();
		return new City();
	}

	

}



