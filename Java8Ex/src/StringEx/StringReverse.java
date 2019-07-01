package StringEx;

public class StringReverse {
	
	public static String reverseWordsOfASentence(String s)
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

	public static void main(String[] args) {
		String s = "New Year Celebrations";
		    //snoi..
				
		StringBuffer sb = new StringBuffer("First");
		 System.out.println(sb.reverse());   // tsriF
		 
		 
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

	}
	
	public static String reverseGivenStrUseChar(String s)
	{
		char[] charArr = new char[s.length()];
		
		for(int i=0; i < s.length(); i++)
		{
			charArr[i] = s.charAt(s.length()-i-1);
		}
		return new String(charArr);
	}
	
	public static String reverseGivenStr(String s)
	{
		StringBuilder sb =new StringBuilder();
		
		for(int i=0; i < s.length(); i++)
		{
			 sb.append(s.charAt(s.length() -i-1));
		}
		
		 
		return  sb.toString();
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

}
