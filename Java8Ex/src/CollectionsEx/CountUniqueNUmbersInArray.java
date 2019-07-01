package CollectionsEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class CountUniqueNUmbersInArray {

	public static void main(String[] args) {

		int[] n = { 2, 4, 8, 3    };
		
		
		
		 HashMap<Integer, Integer> c = new HashMap<Integer, Integer>();
		
		for (int i=0; i < n.length; i++) {
			
			// find ifcharacter in mp is already
			Integer now = c.get(n[i]);
			if (now ==null) {
				c.put(new Integer(n[i]), new Integer(1));
			} else {
				
				
			} 
			
		}  
		String[] sarr = {"ss", "sds"     };
		
		String s = "One Three one Four Five Three";

		int count = 0;
 
		String[]  words = s.split(" ");
		
		ArrayList<String> listUniqueWords = new ArrayList<String>();
		
		for (int i=0; i < words.length; i++) {
			
			if(!listUniqueWords.contains(words[i])) {
				listUniqueWords.add(words[i]);
			}
			
		}
		System.out.println("No of unique words" + listUniqueWords.size());

		

		/*for (int i = 0; i < words.length; i++) {
			String word = words[i].toLowerCase();
			Integer countWord = map.get(word);

			if (countWord != null) {
				//countWord = countWord + 1;
				map.put(word, (countWord+1));
			} else {
				map.put(word, 1);
			}
		}*/

		 	
		 
		
 		
	}

}
