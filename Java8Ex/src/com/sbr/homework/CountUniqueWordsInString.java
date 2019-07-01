package com.sbr.homework;

import java.util.Set;
import java.util.TreeMap;

public class CountUniqueWordsInString {

	public static void main(String[] args) {

		String s = "One Three one Four Five";
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();

		int count = 0;
 
		String[] words = s.split(" ");

		for (int i = 0; i < words.length; i++) {
			String word = words[i].toLowerCase();
			Integer countWord = map.get(word);

			if (countWord != null) {
				countWord = countWord + 1;
				map.put(word, countWord);
			} else {
				map.put(word, 1);
			}
		}

		 	
		Set<String> keys = map.keySet();
		
		for(String key: keys) {
			
			System.out.println(key + "-" + map.get(key));
		}
		
		//return words.length;
		
	}

}
