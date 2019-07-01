package com.sbr.homework;

/*
 * Recursion is a technique where a method calls itself continuously.
 * 
 *  0, 1, 1, 2, 3, 5, 8, 13,.. 
 */
public class Fibonacci {

	static int n1 = 0, n2 = 1, n3 = 0;

	static void printFibo(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			
			n1 = n2;
			n2 = n3;			
			printFibo(count - 1); // recusrion
		}
	}

	public static void main(String[] args) {
		int count = 20;
		System.out.print(n1 + " " + n2);// printing 0 and 1
		printFibo(count - 2);// n-2 because 2 numbers are already printed
	}
}
