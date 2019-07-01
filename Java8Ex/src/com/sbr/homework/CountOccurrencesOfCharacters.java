package com.sbr.homework;

import java.util.HashMap;

public class CountOccurrencesOfCharacters {

	public static void main(String[] args) {
		  
		String exampleStr = "This is a Test";
		performCount(exampleStr);		 
	}
	
	public static void performCount(String inStr) {
		HashMap<Character, Integer> occurrences = new HashMap<Character, Integer>();
		
		String inputUpper = inStr.toUpperCase();
		for(int i=0; i<inStr.length(); i++ ) {
			char ithChar = inputUpper.charAt(i);
			
			Integer countOfCurrent = occurrences.get(ithChar);
			
			if (countOfCurrent != null) 
			{
				countOfCurrent = new Integer(countOfCurrent.intValue() +1);
			} else				
			{
				countOfCurrent = new Integer(1);
			}			
			occurrences.put(ithChar, countOfCurrent);			
		}  		
		occurrences.forEach( (k, v) -> System.out.println(k + ": " + v)); 
					// printing occurrences Java 8
	}
}
