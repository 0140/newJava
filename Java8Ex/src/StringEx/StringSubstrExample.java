package StringEx;

/**
 * http://www.tutorialspoint.com/java/java_strings.htm
 * http://www.tutorialspoint.com/javaexamples/java_strings.htm immutable:
 * 
 * http://www.java-examples.com/java-string-examples
 * 
 * http://www.javatpoint.com/immutable-string
 * http://javahungry.blogspot.com/2013/06/difference-between-string-stringbuilder.html
 * 
 * Assignments:
 * 
 * Print the words of a sentence in reverse order
 * 
 * Print the characters in a string in reverse
 * 
 * Reverse a sentence
 * 
 * 
 * 
 * @author Bhaskara Sama
 *
 */
public class StringSubstrExample {

	public static void main(String args[]) {
		String s = "Venkat Rama Lakshmi";
		int i = s.indexOf(" ");
		System.out.println("Index of space:" + i);

		String firstpart = s.substring(0, i);
		System.out.println("firstpart:" + firstpart);
		String secondpart = s.substring(i);
		System.out.println("secondpart:" + secondpart);

		System.out.println(secondpart + " " + firstpart);

		String s1 = "When" + " " + " it" + " happens.";
		System.out.println(s1);

		String s2 = s.concat(" Ramesh")
				     .concat(" Suresh")
				     .concat(" Mahesh")
				     .toString();

		System.out.println(s2);
		System.out.println(s);
		
		StringBuilder sbuilder = new StringBuilder("First");
		sbuilder.append(" Second")
				.append(" Third")
				.append(" Fourth");
		
		System.out.println(sbuilder.toString());
		
		 
		// print upper case
		// replace
		String replaceSample = "String replace Example of replacing Character Sequence";
		String newString = replaceSample.replace("re", "RE");
		System.out.println(newString);

		 
		// start with
		 String Str = new String("Welcome to Tutorialspoint.com");

	     
	      System.out.println(Str.startsWith("Welcome") );
		
		
		// contains example
	      String strc = "tutorials point"; //, str2 = "http://";
          CharSequence cs1 = "int";
	       
	      // string contains the specified sequence of char values
	      boolean retval = strc.contains(cs1);
	      System.out.println("Method returns cs1 : " + retval);
	      
		// compare to
	      String strcpr = "tutorials", strcpr2 = "point";

	      // comparing str1 and str2
	      int retvalcpr = strcpr.compareTo(strcpr2);
	      System.out.println("Method returns cs1 cpr: " + retvalcpr);

		// Very confusing
		String str1="Hello";
		String str2="Hello";
		String str3=new String("Hello"); //Using constructor.
		 
		// difference between == operator , equals method
		
		int i1, i2;
		i1 = 4;
		i2 = 5;
		
		if ( i1 == i2) // boolean b = false; if (b) 
		{
			System.out.println("i1 and i2 are equal");
		} else 
		{
			System.out.println("i1 and i2 are not equal");
		}
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		if ( o1 == o2 )
		{
			System.out.println("o1 and o2 refer to same object");
		} else
		{
			System.out.println("o1 and o2 refer to different objects");
		}
		
		// o2 = o1; // if ( o1 == o2 )
		
		if(str1 == str2) // For objects == operator will compare reference.
		        System.out.println("str1 str2 refer to same string");
		else
		        System.out.println("Not Equal 1");
		 
		if(str1 == str3)
		        System.out.println("Equal 2");
		else
		         System.out.println("I am constructed using constructor, hence not same object used");
		 
		if( str1.equals(str3) )
		        System.out.println("Equal 3");
		else
		        System.out.println("Not Equal 3");
		
		// equals ignore case
		
		/* http://java-samples.com/showtutorial.php?tutorialid=660
		 * 
		 * public class Book {
    ...
                  public boolean equals(Object obj) {
                       if (obj instanceof Book)
                               return ISBN.equals((Book)obj.getISBN()); 
                       else
                               return false;
                  }
           }
           
           Book firstBook  = new Book("0201914670"); //Swing Tutorial, 2nd edition
           Book secondBook = new Book("0201914670");
           if (firstBook.equals(secondBook)) {
                     System.out.println("objects are equal");
            } else {
                 System.out.println("objects are not equal");
            }
		*/
		
		str3.contains(" ");
		
		System.out.println("comparison:" + "yellowname".compareTo("two")); // ascending comparison
		
		String[] words = s.split(" ");
		
		for (String word:words)
		{
			System.out.println(word);
		}
		
		double d = 4.6;
		String sconvert = String.valueOf(d); // converting primitive into String
		
		double d2 = new Double(sconvert).doubleValue(); // converting string into primitive
		 
		int h = new Integer("12").intValue();
		
		  char[] charArray = new char[]{'J','a','v','a'};
                   
          String strChar = new String(charArray);
          char[] newArr = strChar.toCharArray();
          
          String doubleStr = String.valueOf("34ff67");
          if (doubleStr.indexOf("f") > 0 ) System.out.println("Character is there");
          
          double dgh = new Double(doubleStr).doubleValue();

	}
}
