package com.sbr.homework;

public class MinimumOfThree {

	public static void main(String[] args) {
		int t = MinimumOfThree.minOfThree(45,  -34, 7);
		
		System.out.println(t);
     
	}
	
	
	public static int minOfThree(int a, int b, int c) {
		int temp = a; // initializing to a
		if ( a > b) temp = b; // if b is smaller of a, b, then put b to temp.
		                      //temp has smaller of these two
		if(temp > c) temp = c;	// Now compare with c.	
		return temp; // This returns minimum value of three	
		
	}

	
	
	
	
	
	
	
}
