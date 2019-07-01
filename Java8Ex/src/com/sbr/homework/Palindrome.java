package com.sbr.homework;


public class Palindrome {

	public static void main(String[] args) {
		String s = "radar";
		
		// s.length() can be changed to middle index.
		//int middleIndex =  s.length()/2; //If length 7, middleIndex is 3.
		boolean palindrome = true;
		for (int i=0; i< s.length(); i++) {
			if ( s.charAt(i) != (s.charAt(s.length() - i-1)   )) {
				palindrome = false;
				break;				
			}			
		}
		
		if(palindrome) System.out.println("Palindrome");
		else System.out.println("Not a Palindrome");
 
	}
	
	public static boolean isPalindrome(String s) {

		// s.length() can be changed to middle index.
		// int middleIndex = s.length()/2; //If length 7, middleIndex is 3.
		boolean palindrome = true;
		for (int i = 0; i < s.length()/2; i++) {
			if (s.charAt(i) != (s.charAt(s.length() - i - 1))) {
				palindrome = false; // if two characters are not same, it is not
									// palindrome.
									// No more comparison needed
				break;
			}
		}

		return palindrome;
	}


}





