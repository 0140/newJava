package CollectionsEx;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Anagrams are string where one string has only the characters that are there in 
 * another string.
 * ex: listen silent
 *     radar rad
 *      Mother-in-law = Hitler woman
 *      Debit card  = Bad  credit
 *      Dormitory = Dirty Room
 *      The earthquakes = The queer shakes
 *      Astronomer = Moon starrer
 *      Punishments = Nine Thumps
 *      School master = The classroom 
 * @author bhaskar
 *
 */
public class Anagram_Practice {
	
	public static void main(String[] args) {
		 if (isAnagram("Debit card", "Bad creditz") && isAnagram("Bad creditz", "Debit card"))
	       {
	    	   System.out.println("Anagram of each other");
	       } else {
	    	   System.out.println("Not Anagrams");
	       }
	}	
	// we need to call this twice with words interchanged.
		public static boolean isAnagram(String word, String anagram) {
				String first = word.toLowerCase();
				String second = anagram.toLowerCase();
				boolean isAnagram = true;
				char[] chars = first.toCharArray(); // finding all characters of the string
				for (char c : chars) { // looping on all characters
					int index = second.indexOf(c); // check if character in anagram string.
					if (index == -1) { //if character is not there in anagram
						// It is not  anagram // done
						isAnagram = false;
						break;
		 			}  
				}
				return isAnagram;  
			}
	
	public static void anagramSortingMethod()
	{
		String copyOfs1 = "First";
		String copyOfs2 = "isFtr"; // Anagram
		
		char[] s1Array = copyOfs1.toLowerCase().toCharArray();		 
        char[] s2Array = copyOfs2.toLowerCase().toCharArray();

        //Sorting both s1Array and s2Array

        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        //Collections.sort(list);

        //Checking whether s1Array and s2Array are equal // modify code for duplicates // for loops
        boolean status = Arrays.equals(s1Array, s2Array);
        
        if (status) System.out.println("Anagrams");
	}

	public static void main22222(String[] args) {
		 //
		// k/// TestNG -- annotations, parameters. 
		// BDD cucumber  features
		// WHy HBO -- automated testing -- mobiles
		// The technologies, environment
		// File IO stream, object stream
		
		// locating dynamic elements -- not simple
		// Is it aeduten?
		// streams also validated -- encode and decode the streams -- check for expected results
		
		// Stream and save to object
		// Then decode the object and get back the stream 
		
		// contribute to strenghten the testing of the web app also
		
		// 
		String first = "The earthquakes";
 		String second = "The queer shakes";

		
		boolean firstAnagram = checkAWordForAnagram(first, second);
		boolean secondAnagram = checkAWordForAnagram(second, first);
		
		if (firstAnagram && secondAnagram) System.out.println("One is anagram of another");
		else System.out.println("Not Anagrmas."); 	  
	}
	private static boolean checkAWordForAnagram(String first, String second) {
		char[] sourceArr = first.toLowerCase().toCharArray();
         
		for (int i=0; i < sourceArr.length; i++ )
		{
			String tmp = String.valueOf(sourceArr[i]); 			
			if (!second.toLowerCase().contains(tmp)) { 
				// checking each character in the second
		  		return false;
			}
		}
		return true;
	}
	
	

}
