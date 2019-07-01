package StringEx;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicatesInString {

	public static void main(String[] args) {

		String s = "OK. Todya is the day.";

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		// define map to maintain count of characters

		for (Character ch : s.toCharArray()) { // loop on all
			if (charMap.containsKey(ch)) { // if char is in target map already,
											// increment count
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}

		Set<Character> set = charMap.keySet();

		for (Character c : set) {
			Integer intCount = charMap.get(c);

			if (intCount.intValue() > 1) {
				System.out.printf("Key %s  is occuring %d  times.\n",
						c.toString(), intCount.intValue());

			}

		}

	}
}
