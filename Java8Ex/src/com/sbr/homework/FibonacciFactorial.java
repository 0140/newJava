package com.sbr.homework;

/**
 * http://www.java-examples.com/loop
 * 
 * @author Bhaskara Sama
 *
 */
public class FibonacciFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 4; i++) {

		}

		int result = factorial(6);

		System.out.println(result);

		int fibonacciTotal = fibonacci(10);
		System.out.println(fibonacciTotal);

		/*
		 * *
		 * *
		 * **
		 * ***
		 * 
		 * 
		 * *
		 * **
		 * ***
		 * 
		 * palindrome or not
		 * 
		 * prime numbers
		 */

	}

	public static int factorial(int n) {
		if (n == 0)
			return 1;

		return n * factorial(n - 1); // recursion
	}

	public static int fibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		int fibTotal = (fibonacci(n - 2) + fibonacci(n - 1));

		System.out.println("fibonacci of n=" + n + " is" + fibTotal);
		return fibTotal;
	}

}
