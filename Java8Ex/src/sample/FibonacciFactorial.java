package sample;

/**
 * http://www.java-examples.com/loop
 * 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181
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
