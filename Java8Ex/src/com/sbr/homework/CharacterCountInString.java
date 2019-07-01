package com.sbr.homework;

import java.util.HashMap;

public class CharacterCountInString {

	public static void main(String[] args) {
		HashMap<Character, Integer> countRes = nameCount("Allen Sanders");
		
		countRes.forEach( (key, val) -> System.out.println(key +":" + val) );		
	}	

	public static HashMap<Character, Integer> nameCount(String name) {		
		//a map to hold count of characters
		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
		
		for(int i=0; i< name.length(); i++) //Looping on all input charaters
		{
			char c = name.charAt(i);		// take each character	
			Integer countNow = countMap.get(new Character(c)); // Is it already in map
			
			if(countNow == null) { // It is not present
				countMap.put(new Character(c), 1); // set count one
			} else
			{
				countNow = 1 + countNow.intValue(); // increment count by one
				countMap.put(new Character(c), countNow);
			}	
		}		
	    // Print count
		return countMap;		
		
 	}

}


