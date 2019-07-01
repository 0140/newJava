package com.aug09.invoke;

import com.aug09.MethodsExample;
import com.aug09.Provider;

public class Client {
	
	public static void main(String[] args) {
		
		MethodsExample m = new MethodsExample();
		m.process();
		
		/*double x = m.processReturn();
		System.out.println("x:" + x);
		
		String s = m.processString();
		
		m.getLocal()*/;

		/* double result = m.printTan(3);
		 System.out.println("result:" + result);

		result = m.printSum(3,  4);
		System.out.println("result sum:" + result);
		*/
		//m.printTan(2);
		
		// Print pyramid:
		/*****
		***
		**
		*
		
		*****
		****
		***
		**
		**/
		
		Provider p = new Provider();
		p.getRegistration();
		
		InstitutionalProvider inst = new InstitutionalProvider();
		inst.setRegistration("sdsd");
		inst.getProviders();
		
		Provider q = new InstitutionalProvider(); // Up casting, Sub class casted to super class.
		q.setRegistration("gjhgf");
		//q.getProviders();
		
		q= new Provider();
		q = new InstitutionalProvider();
		
		p.setRegistration("vnvn");
		
 		
	}

}
