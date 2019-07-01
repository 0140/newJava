package com.aug09;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Give next line:");
		String s1 = s.nextLine();
		System.out.println("Give second line:");

		String s2 = s.nextLine();
		System.out.println(s1 + s2);
		
		System.out.println("Give Integer:");
		int k = s.nextInt();
		
		System.out.println("Give double:");
		double md = s.nextDouble();
		
		System.out.println(k + " " + md);
		
		long factorial = 1;
		
		for(int i=1; i <= k; i++ ) {
			factorial = factorial * i;
		}
		System.out.println( "Factorial:" + factorial);

		
		

	}

}
