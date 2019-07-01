package com.sbr.homework;

public class StringReverse {

	public static void main(String[] args) {
		String s = "New Year Celebrations";
		
		 for (int i=0; i< 5; i++ )
		 {
			 for(int k=0; k< 5; k++)
			 {
				 if (k < (5 - i))
					 System.out.print("*");
				 			 
				 
			 }
			 System.out.println("");				 
			 
		 }
				
		StringBuffer sb = new StringBuffer("First");
		 System.out.println(sb.reverse()); // tsriF
		 
		 
		 // Reverse
		 for (int p=0; p<s.length(); p++)
		 {
			 System.out.print(s.charAt(s.length() - p-1));
		 }
		 
		 //-----------------------------------------
		    System.out.println("");
		 	String reverseusingChar =  reverseGivenStrUseChar("Hello");
		 	System.out.println("Reversed:" + reverseusingChar);
		 //-----------------------------------
		 
		 // Print words of a array in reverse
		 System.out.println("");
		 String[] namearr = s.split(" ");
		 for (int p=0; p<namearr.length; p++)
		 {
			 System.out.println(namearr[namearr.length-p-1]);
		 }
		 
		 String s2 = s.toUpperCase();
		 
		 System.out.println("------------------");
		 
		 for (int i=0; i< 5; i++ )
		 {
			 for(int k=0; k< 5; k++)
			 {
				 if (k < (5 - i))
					 System.out.print("A");
				 else
					 System.out.print(" ");				 
				 
			 }
			 System.out.println("");	
			 
			 
		 }
		 
		 /*StringReverse r = new StringReverse();
		 r.reverseGivenStrUseChar(":");*/
		 
		 
		 String ret = StringReverse.reverseSentenceWords("This is calss example");
		 
		 System.out.println(ret);
		 
		 System.out.println(reverse("paypal"));

	}
	
	public static String reverseGivenStrUseChar(String s)
	{
 		char[] charArr = new char[s.length()];
		
		for(int i=0; i < s.length(); i++)
		{
			charArr[i] = s.charAt(s.length()-i-1); 
			// basicaly we assign char array values in the reverse
		}
		return new String(charArr);
	}
	
	public static String reverseGivenStrUsingStringBuffer(String s)
	{
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i < s.length(); i++)
		{
			sb.append(s.charAt(s.length() -i -1));
			// basicaly we assign char array values in the reverse
		}
		return sb.toString();
	}
	
	public static  String reverseSentenceWords(String s) {
		String[] arr = s.split(" ");
		
		StringBuilder sb = new StringBuilder();
		for (int i=0; i < arr.length; i++)
		{
			sb.append(arr[arr.length - i -1])
				.append(" ");
		}
		
		return sb.toString();
	}
	
	/**
	 * Using recursion
	 * 
	 * @param s
	 * @return
	 */
	public static String reverse(String s) {
		if (s.length() == 0)
			return "";
		return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
	}

}
