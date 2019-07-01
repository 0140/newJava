package com.sbr.homework;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import sample.Car;
 

public class DuplicatesInString {

	public static void main(String[] s) {

		/*Map<Integer, Car> m = new HashMap<Integer, Car>();
		m.put(1, new Car());

		Map me = new HashMap();
		me.put(new Object(), new Object());
		me.put("1", new Car());*/

		String w = "Is this the assignment?";
		char[] characters = w.toCharArray(); // find all characters

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (Character ch : characters) {
			if (charMap.containsKey(ch)) { // if char is in target map already, increment count
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1); 
			}
		}
		
		Set<Character> set = charMap.keySet();
		
		for(Character c: set)
		{
			Integer intCount = charMap.get(c);
			
			if(intCount.intValue() > 1)
			{
				System.out.printf("Key %s  is occuring %d  times.\n", c.toString(), intCount.intValue() );
				 
			}
			
		}
		
		
		
		

		/*Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();

		for (Map.Entry<Character, Integer> entry : entrySet) {

			if (entry.getValue().intValue() > 1) {
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
			} 

		}
		*/
		//------------------
		/*w.replaceAll("this", "that");
		
		Character c = null;
		
		c.isDigit(ch)*/

	}

}
