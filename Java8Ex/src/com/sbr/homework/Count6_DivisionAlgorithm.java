package com.sbr.homework;

//import com.sbr.homework.Count2S;

public class Count6_DivisionAlgorithm {

	public static void main(String[] args) {
		/*
		 * 
		 * features
		 * runner directory
		 * step definition folders
		 * we have these directories, one set for each module - functional area
		 * 
		 * You can write TestNG suites
		 * You will have list of test cases in TestNG suite
		 * When we run suite,
		 * one by one all test cases will run, in the sequence given in TestNG.xml
		 * 
		 * Different testNG suites can be configured. These suites can be configured and
		 * 		invoked whenever you want
		 * Call Resgression.xml today. Call UAT.xml tomorrow.
		 * Configure different build jobs from Jenkins. Run whicheber you want.
		 * 
		 * 
		 * ???
		 * How many 6s are there? 
		 * 
		 */
		
		//Count2S c = new Count2S();
				int result = Count6_DivisionAlgorithm.count6(1, 61); // uptp 100
				System.out.println("Number of 6s in (div):" + 61 + ":" + result);

	}
	
	/**
	 * No of 6s upto a number
	 * If number has 6 and divisible by 3, then print
	 * @param from
	 * @param to
	 * @return
	 */
	public static int count6(int from, int to) {
	    int count = 0;
	    for (int i = from; i <= to; i++) {
	    	boolean present6 = false;
	        int j = i;
	          /*In a given number, ex: 126. First check 6. Then check 2.
	          Then check 1. THis happens iteration wise.
	          Check one digit in each iteration of while loop*/
	        
	        while (j > 0) {
	            if (j % 10 == 6) // Begins with 6. 
	                {
	            	count++; present6 = true;
	                }
	            j /= 10; // 12 1
	        }
	        if (present6  ) System.out.println("Number:" + i);	        
	    }
	    return count;
	}
	
	
	public static int countAbc(String s)
	{
		String requiredString = "abc";
		int index = s.indexOf(requiredString);
		int countAbc = 0;
		
		if(index != -1)
		{
			
		}
		
		return countAbc;
	}
	/*
	public static int count6s(int n) {
		int count6 = 0; // you have to use divisions if you do not want to convert

		for (int i = 0; i <= n; i++) {
			String stringrep = String.valueOf(i);

			for (int k = 0; k < stringrep.length(); k++) {
				char kthchar = stringrep.charAt(k);
				;
				if (kthchar == '6')
					count6++;
			}
		}
		return count6;
	}
*/
	 
	
	 

}
