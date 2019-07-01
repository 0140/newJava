package com.sbr.homework;

import java.util.HashMap;

public class CharacterCountInString222 {
	public static void main(String[] args) {
		HashMap<Character, Integer> countRes = countCharacters("Allen Sanders");		
		countRes.forEach( (key, val) -> System.out.println(key +":" + val) );	
		// If value is more than one, it has duplicate characters
	}	
	public static HashMap<Character, Integer> countCharacters(String input) {		
		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>(); 
		//a map to hold count of characters -- holds characters and their count
		
		for(int i=0; i< input.length(); i++) //Looping on all input charaters
		{			char c = input.charAt(i);		// take each character	
			Integer countNow = countMap.get(new Character(c)); // Is it already in map			
			if(countNow == null) { // If It is not present
				countMap.put(new Character(c), 1); // set count one
			} else
			{
				countNow = 1 + countNow.intValue(); // increment count by one
				countMap.put(new Character(c), countNow);
			}	
		}			    
		return countMap; // Print count			
 	}
}


