package sample;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

public class ArrayEx {
	
	
	
	static public  void main(String args[])
	{
		int[] arrayRefVar = new int[10]; //0 -- 9
		arrayRefVar[0] = 11;
		arrayRefVar[1] = 14;
		arrayRefVar[9] = 17;
		//arrayRefVar[10] = 17;
		
		System.out.println("Array elemnt:" + arrayRefVar[0]);
		
		double[] myList = {1.9, 2.9, 3.4, 3.5};
		
		System.out.println("Line 24" );

		for (int i = 0; i < myList.length; i++) {
	        // System.out.println(myList[i] + " ");
	         
	         int length = myList.length;
	         System.out.println(myList[length - i-1]);
	      }
		
		System.out.println("-----------------------------");
		for(double element:myList)
		{
			System.out.println(element);
		}
		
		List<String> teams = Arrays.asList("India" , "Australia" , "England" );
	    
	     System.out.println("Original List: " + teams);
	     
	     // Array to ArrayList
	     String names[] = {"Ramesh", "Suresh" };	     
	     List<String> teams2 = Arrays.asList(names );
	     
	     // convert List into array
	     String[] namesarray = (String[]) teams2.toArray();
		    
	     System.out.println("Original List: " + teams);
	     
	   
	      // Print second larget value from array
	     
	     // how to insert an element in middle of array
		
	}
}
