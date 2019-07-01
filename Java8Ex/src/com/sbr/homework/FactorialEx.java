package com.sbr.homework;

/**
 * 5! = 5*4*3*2*1
 * @author bhaskar
 *
 */
public class FactorialEx {

	/**
	 * Recursion usage to calculate factorial 
	 * @param n
	 * @return
	 */
	static int factorial(int n) {
		if (n == 1)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public static void main(String[] args) {
		System.out.println("Factorial of 5 is: " + factorial(5));
	}
}