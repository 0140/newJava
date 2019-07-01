package com.aug09;

public class OperatorsEx {

	public static void main(String[] args) {

		int i = 8, j = 9, k = 3;

		i = j + k;
		// j-k j* k j/k
		j++;

		System.out.println("j:" + j);
		++j;
		System.out.println("j:" + j);

		System.out.println("---------------------");

		j = 20;
		System.out.println("j:" + j++);
		System.out.println("j:" + ++j);

		i = 10;

		k = i++ + ++i; // 10 + 12
		System.out.println("k:" + k);

		j--;

		j += 5; // j = j +5;
		j -= 6; // j= j - 6;

		j *= i; // j = j * i;
		j /= k; // j = j/k;

		int a = 3, b = 7;
		// Exchange the values between a and b. Do not use third variable.

		b = a + b; // 10
		a = b - a; // 7
		b = b - a; // 3

		i = 10 / 2; // 5

		i = 9 / 2;

		i = 9 % 2; // 1

		boolean result = 3 > 6;

		if (7 > 5) {
			System.out.println("7>5");

		}
		
		if (10 < 34)  System.out.println(" 10 < 34");
 

		if (3 > 5) {
			System.out.println("7>5");

		} else {
			System.out.println("3 > 5 ???");
		}
		
		i = 11;
		if(i > 44) {
			System.out.println("11 > 44 ???");
		} else if (i > 22) {
			System.out.println("i > 22 ???");

		} else {
			System.out.println("In else");
		}
		
		if( i == 11 | i == 22) 	System.out.println("Pipe");
		if( i == 11 & i == 22) {
			System.out.println("& true");
		} else {
			System.out.println("& false");
		}
		
		FirstBasic first = null;
		
		if(first == null || first.d == 7 ) {
			System.out.println("null ref");

		}
		
		if(first != null && first.d == 3 ) {
			System.out.println("not null");

		}
		
		/**
		 * if a number variable a is divisible by 3, print fizz.
		 * If a is divisible by 5, print buzz.
		 * if a is divisible by 3 and 5, print fizz buzz.
		 * 
		 * 
		 */
		
		i = 22;		
	   double f = (i > 34) ?  101.5  : 123.6;
	   
	   
	   

	}

}
