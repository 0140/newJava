package com.sbr.homework;

/**
 * Eclipse do you have????
 * Write in notepad -- compile from command line and run there
 * 
 * You have Java????
 * @author Bhaskara Sama
 *
 */
public class Macys_Palindrome {

	public static void main(String[] args) {
		
		boolean result = process("radar");
		if (result) System.out.println("Palindrome");
		else System.out.println("Not Palindrome");
	}	
	public static  boolean process(String s) {
		boolean result = true;		
		int iterations = s.length()/2 ;		
		for (int i=0; i <iterations; i++ )
		{			
			if ( s.charAt(i) != s.charAt(s.length() -i-1))
			{  //s.charAt(0) ==  s.charAt(5-0-1) 0 and 4 compared 
						//-- r != r    -- false -- so goes to next iteration   
				//s.charAt(1) ==  s.charAt(5-1-1) -- 1 and 3 compared
				//s.charAt(2) ==  s.charAt(5-2-1) -- 2 good 2 compared
				
			//  //s.charAt(3) ==  s.charAt(5-3-1) -- 3 good 1 compared
			//  //s.charAt(4) ==  s.charAt(5-4-1) -- 4 good 0 compared
				// works good
				result = false; // I come here only if not palindrome
				break;  // dDeepika -- run in eclipse -- You do it
			}
		}		
		return result;
	}

}
