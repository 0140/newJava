package sample2;

import java.util.ArrayList;
import java.util.HashMap;

public class WrapperEx {
	
	public static void main(String[] args)
	{
		int i = 34;
		
		double d = 23.5;
		
		Integer intWrapper = new Integer(1);
		
		Double dblWrapper = Double.valueOf(d);
		
		int resultInt = intWrapper.intValue();
		double resultDbl = dblWrapper.doubleValue();
		
		System.out.println("int i=" + intWrapper.toString());
		
		ArrayList al = new ArrayList();
		al.add(intWrapper);
		al.add(3567);
		
		// Interview qtn -- after you read from web element value -- How do you compare
		String s = String.valueOf(7);
		 
		int n = new Integer(s).intValue();
		
	    HashMap<Integer, Double> map = new HashMap<Integer, Double>();
	    map.put(new Integer(3), new Double(34.5));
	    
	    map.put(9, 356.7); // Auto boxing
	    
	    double d2=   map.get(9); // Autounboxing
	    
	    double d5 = new Double(23.5);
	    
	    
		
	}

}
