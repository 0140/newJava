package com.sbr.homework;

public class AssignmentsStaticFinalLoops {
	
	/*
	 * 1. Write a static method. call it from main method.
	 * 
	 * 2. Calendar example -- Print all months of previous year
	 * 
	 * 3. Sort input array in ascending order. Use Bubble sort.
	 * 
	 * 4. Find whether a given string is Palindrome.
	 * 	A palindrome is one which reads same from left or right.
	 * 
	 * 5. Print for a given row number: (Print so many rows)
	 	A
	 	AA
	 	AAA
	 	AAAA
	 	AAAAA
	 * 
	 * 6. Count the number of 2s upto 25. Count every number 2 from 0 upto 25 
	 * 	whenever nmber 2 appers.
		Ex: 1..12. Count is 2. (2 and 12 have)  -- code in Count2s.java
	
	 * 7. Pass By Value example:
	 * 
	 * 11. What is printed and why is it printed so?   
   Pass by value or pass by ref in java?
 
  Read: http://www.javaworld.com/article/2077424/learn-java/does-java-pass-by-reference-or-pass-by-value.html
 
     public class PassByValueExample {
	
	
	public int process(int n)
	{
		n = n+2;
		return n;
	}
	
	public void process(City c)
	{
		 c.setName("Atlanta");
		 //process(4);		 
	}	

	public static void main(String args[]) {
		
		 System.out.println("webdriver.chrome.driver");
		 
		 
		 int loc = 10;
		 PassByValueExample p = new PassByValueExample();
		 int x = p.process(loc); // Pass by value
		 
		 System.out.println("loc:" + loc);
		 
		 City c1 = new City();
		 c1.setName("Princeton");
		 p.process(c1);
		 System.out.println(c1.getName()); 
    }
}

What is printed?
	 * 
	 * 12) Print prime numbers upto 100
	 * 			Initialize array -- index is the number, value is prime or not.
	 * 								Initialize value to -.
	 * 						Start from beginning number 2.
	 * 						All multiples of number 2 are not prime.
	 * 						So set the multiples of 2 to N in the Array.
	 * 						
	 * 						Go to next number in array. which is 3.
	 * 						Now, set to N all multiples of 3.
	 * 
	 * 						Continue this.
	 * 						If at any place in the array, if N is there, there is no need to check for multiples.
	 * 
	 * 						End of looping through the array, you already found, which are prime.
	 * 						 
	 * 						. 
	 * 14) Find factorial of a given number using Java
	 * 		More than one solution possible:
	 * 			1) Uses recursion
	 * 			2) Uses simple for loops
	 * 
	 * 
	 * 
	 * 
	 */

}
