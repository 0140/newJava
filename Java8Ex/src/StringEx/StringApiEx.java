package StringEx;

import java.util.HashMap;

import demo.Car;
import practice.Vehicle;

/**
 * Ok This is my help.
 * 
 * https://javaconceptoftheday.com/java-string-interview-questions-and-answers/
 * https://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html
 * 
 * http://javarevisited.blogspot.in/2015/01/top-20-string-coding-interview-question-programming-interview.html
 * @author bhaskar
 *
 */
public class StringApiEx {

	/**
	 * Ok Thi is help for main method.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Object o1 = new Object();
		Object o2 = new Object();

		System.out.println(o1);
		System.out.println(o2);

		if(o1.equals(o2) ) {
			
			System.out.println("Equal");
			
		}
		
		 
		
		String s1= "David";
		String s2 = "David";
		
		if(s1.equals(s2)) {
			System.out.println("Equals");
		}
		
		
		String s45 = "hello Hklgh";
		char c3 = s45.charAt(4);
		System.out.println("Char:" + c3);

 		 
		s45.charAt(1);

		String s = "This is demonstration string meant for class and is simple.";
		
		System.out.println(s.charAt(8));
		
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(10));

		boolean upperCaseString = false;
		 for(int i=0; i < s.length(); i++) { // loop on alll characters in the string
			   char c =  s.charAt(i); // getting ith character
    		   if(Character.isUpperCase(c)) {
				   System.out.println("ch is upper case");
				   upperCaseString = true;
				   break;
			   }
			   // Wrapers, Character, Integer, Double
		 }
		 if(upperCaseString) System.out.println("String has upper case");
		System.out.println("-----------------------------------");
	    s = "This is demonstration string meant for class and is simple.";

		//String s = "This is demonstration string meant for class and is simple.";
		System.out.println(s.substring(5));
		System.out.println(s.substring(4, 10));
		System.out.println(s.substring(5, 21));
		
		System.out.println(s.charAt(6));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		System.out.println("333333333333333333333333333333333");

		CharSequence cs = "sd";
		System.out.println(s.contains("was")); // ATL357853783478dfjhen
		String res = s.replace("is", "was");
		System.out.println("res:" + res);
		System.out.println(s.replaceFirst("o", "p"));
		
		String str = new String("My .com site is BeginnersBook.com");
	    System.out.print("String after replacing all com with net :" );
	    System.out.println(str.replaceAll("com", "net"));
		
		if ( s.startsWith("This"))
		{
			System.out.println("starts with This.");
		}
		
		String t = " Yes ";
		
		Character charc = new Character('v');
		
		if(Character.isUpperCase(charc)) {  
			System.out.println("Upper case.");
		}
		
		if(Character.isUpperCase('d')) {  
			System.out.println("Upper case.");
		}
		
		System.out.println("88888888888888888888888888888888");

		if(Character.isAlphabetic('d'))   System.out.println("is Alphabetic.");  
		
		s.replace("o", ""); // This is how we remove

		 
		System.out.println("Trimmed:" + t.trim());
		
		char[] c = s.toCharArray(); // new String(c)
		byte[] b =  s.getBytes();
		
		 
		// new String(c);
		// new String(b); 
		
		s = "This is demonstration string meant for class and is simple.";
		
		String[] words = s.split(" ");
		//Print 3rd word in a given sentence
		System.out.println("words[3]:" + words[3]);
		
		//words[s.length()-1]
		 
		//if(s.length() == 0)  
		
		
		// ""
		if (!s.isEmpty()) {
			System.out.println("Not empty");
		}   
		
		// ==, equals
 		if (s.equals("Hello")) { }  // Hello hello
		else
		{
			System.out.println("Not equal");
		}
		
		// Hello hello
		if (s.equalsIgnoreCase("Hello")) { System.out.println("EqualsIgnoreCase");
		}   
		else
		{
			System.out.println("Not equal equalsIgnoreCase");
		}
		
		s = "This is demonstration string meant for class and is simple.";
		System.out.println(s.indexOf("i"));
		
		// Is a character is there in a string or not.
		if (s.indexOf("z") == -1)
		{
			System.out.println("z not there");
		}
		
		String s5 = "This is a good one.";
		String s6 = "Is it so?";
		
		// A B, // Lexicographic order
		// s1.compareTo(s2) < 0, S1 COMES FIRST
		
		 /*s1.compareTo(s2) > 0 s1 comes later
		 s1.compareTo(s2) == 0 , s1 s2 equal
		
		"ABC".compareTo("XYZ")  // Returns -1 // Lexicographic order
		"XYZ".compareTo("ABC")  // Returns  1
		"ABC".compareTo("ABC")  // Returns  0
*/		
		if (s5.compareTo(s6) == 0)
		{
			System.out.println("Strings same");

		} else if (s5.compareTo(s6) < 0) 
		{
			System.out.println("s5 comes first.");

		} else
		{
			System.out.println("s6 comes first..");

		}

		
		Character c2 = new Character('1');
		if(Character.isDigit(c2))
		{
			System.out.println("It is digit");
		}
		
		char ch = ' ';
		if (Character.isAlphabetic(ch))  {};
		
		double d = 23.4;
		String s3= String.valueOf(d); // Primitive to string
		System.out.println(s3);
		//Character.toString('d');
		
		double d2 = new Double(s3).doubleValue(); // Integer to Double 
													// String to primitive
		System.out.println(d2);
		
		String number = "fg";
		 //int result = Integer.parseInt(number);
		//System.out.println("After parsing:" + result);
		//Double.parseDouble(s3)
		
		String strex = "10t";
	    //result = Integer.parseInt(strex);
		
		s = "this is demonstration is string.";
		System.out.println(s.substring(3, 6));
		String newstr = s.replaceAll("is", "was");
		System.out.println(newstr );
		
		/*Assignments:
			1)4 upto 7

		2) Replace is with was
		3) verify whether a particular string contans capital letters or not.*/

		// Whether upper case character is there in a string
		boolean hasUpperCase = false;
		for( char schar: s.toCharArray())
		{
			if(Character.isUpperCase(schar))
			{
				hasUpperCase = true;
				break;
			}
		}
		
		if(hasUpperCase)
		{
			System.out.println("Has upper case" );

		} else {
			System.out.println("Has no upper case" );

		}
		
		/* Assignment: Print words in reverse
		s = "this is demonstration is string.";
		
		String words3[] =  s.split(" ");
		
		for(int i = words3.length -1; i >=0; i--)
		{
			System.out.println(words3[i] );

		}

		*/
		
		// what is the difference between == and equals method in java?

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		//hm.put("k", "v");
		
		hm.put(1, 2); // autoboxing
		hm.put(new Integer(1), new Integer(2));
		
		int n = (Integer) hm.get(1); 
		// auto unboxing //Converting an object of a wrapper type (Integer) to its corresponding primitive
		
		Integer ing = new Integer(4);
		int x;
		
		x = ing.intValue();		
		x = ing; // auto unboxing
		
		HashMap hm2 = new HashMap();
		hm2.put(new Car(), new Car());
		hm2.put(2000, new Car()); // Integer Double Boolean 
		int j = (int) hm2.get(2);
		
		
		HashMap<Integer, String> hm3 = new HashMap<Integer, String>();
		//hm3.put(new Car(), new Car());
	
		
		double d3 = 67.89;
		String sd3 = String.valueOf(d3); // Primitive to string
		System.out.println("sd3:" + sd3);
		
		double d4 = new Double(sd3).doubleValue(); // String to primitive
		System.out.println("d4:" + d4);
		
		sd3 = "tguhteuieg";
		double d5 = Double.parseDouble(sd3); // String to primitive
		
		// Reverse a string
		// 
		
		Vehicle v1 = null;
		Vehicle v2 = null;
		//if(v1.equals(v2)) {}
		
		String output = String.format("%s = %d", "joe", 35);

		System.out.println(output);
		System.out.printf("My name is: %s%n", "joe");
		// String.format("|%20d|", 93); // prints: |                  93|

	
		HashMap<Character, Integer> var = new HashMap<Character, Integer>();
		var.put('a', 13); //autoboxing
		var.put('b', 5);
		var.put('1', 13);
		
		System.out.println(var.get( '1' ));

		System.out.println(var.get(new Character('1')));
	}

}
