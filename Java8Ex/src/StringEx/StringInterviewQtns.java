package StringEx;

public class StringInterviewQtns {

	public static void main(String[] args) {
		String s1 = "abc";   
		String s2 = s1;
		String s3 = new String("abc");
		String s4 = new String("abc");
		String s5 = "abc";
		
		System.out.println("s1 == s5:" + (s1 == s5) );
		System.out.println("s1 == s2:" + (s1 == s2) );
		System.out.println("s3 == s4 :" + (s3 == s4 ) );
		System.out.println("s3.equlas(s4) :" + (s3.equals(s4) ) );
		System.out.println("s4.equlas(s5) :" + (s4.equals(s5) ) );
		
		System.out.println("concat: 1" + 2 +3);
		System.out.println(1+2+"3");
		
		//Two variables a,b. check if a equals b. Don't use >.
		
		int a = 7, b = 4;
		
		boolean compare_a_b = ((a-b) == 0) ? true : false;
		System.out.println(compare_a_b);
		//-----------------------------------------------
		String aStr = String.valueOf(a); // Convert number to String?
		String bStr = String.valueOf(b);
		
		if (aStr.equals(bStr))
		{
			System.out.println("a b same");
		} else
		{
			System.out.println("a b different");
		}
		
		/*
		 *  what is the difference between ==, equals (for objects)
		 *  == checks the references. 
		 *  if same, they are pointing to same object
		 *  
		 *  equals calls the equals metod on the objects.
		 *  we override equals method in java class.
		 *  That method uses the values in the java claa.
		 *  Therefore, it is a comparison of 
		 *  the contents between two objects.
		 */
		
		// reverse a string
		
		String sr = "12345";
		
		/*
		 *  for loop print from last index
		 */
		for (int i=0; i < sr.length(); i++)
		{
			// Assignment: Remember all string API
			System.out.println(sr.charAt(sr.length() -1 -i));
		}
		
		StringBuffer sb = new StringBuffer(sr);
		
	    
		System.out.println("Buffer reverse:" + sb.reverse());
		
		StringBuffer sbresult = new StringBuffer();
		sbresult.append(sb.reverse());
		System.out.println("sbresult.reverse():" + sbresult.reverse());
		 
		// Print the words of a sentence in reverse
		//  Ex: Jones Smith.  Print: Smith Jones
		
		String s ="Jones Smith";
        String[] res = s.split(" ");

		System.out.println("res:" + res[1] + " " + res[0]);
		// In interview, print from last index. Don't copy code.
		//res.length
		
		String result = reverseWords("I am from Atlanta");
		System.out.println("Reverse:" + result);
	}
	
	public static String reverseWords(String s)
	{  
        String[] res = s.split(" ");
        
        StringBuilder sb = new StringBuilder("");
        
        for(int i = res.length -1; i >= 0; i--)
        {
        	sb.append(res[i])
        	.append(" ");
        }
        
        return sb.toString();
	
	
	}

}
