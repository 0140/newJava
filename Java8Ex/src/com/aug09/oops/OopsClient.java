/*package com.aug09.oops;

import java.util.Date;

import com.sbr.homework.Car;
import com.sbr.homework.Vehicle;

public class OopsClient {

	public static void main(String[] args) {
		
		MobileCar mc = new MobileCar();
		mc.setLeather(true);
		mc.setOwner("Ram");
		mc.setVinid("ghghgf");
		
		System.out.println(mc.getOwner());
		
		mc = new MobileCar("David", "hh", true);
		//---------------------------
		
 		Visa visa = new Visa();
 		String issuer = visa.getAIssuer();
 		
 		CreditCardAug09 crd = new Visa();
 		crd.getType();
  
 		String type = args[0];
 		if (type.equals("VISA")) {
 	 		crd = new Visa();
 		} else if(type.equals("AMEX")) {
 	 		crd = new Amex();
 		}
 		
 		CreditCardAug09 cr = crd;
 		
 		crd.validate("", new Date());
 		crd.validate("", new Date(), "678");
 		
 		Vehicle v= new Vehicle();
 		//double d = v.getPrice();
 		
 		
 		v = new Car();
 		//v.getPrice();  // Runtime polymorphism
 		
 		
 		
 		 
}
}
*/