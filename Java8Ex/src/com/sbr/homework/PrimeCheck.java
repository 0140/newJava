package com.sbr.homework;

public class PrimeCheck {

	public static void main(String[] args) {
 		PrimeCheck.primeCheck(100);
	}
	// Run it.
	public static void primeCheck(int n) {
		// initially assume all integers are prime
		boolean[] isPrime = new boolean[n + 1]; //Array to mark any integer prime or not prime
		for (int i = 2; i <= n; i++) {
			isPrime[i] = true; // initialize
		}

		// mark non-primes <= n using Sieve of Eratosthenes
		for (int factor = 2; factor * factor <= n; factor++) {
			// if factor is prime, then mark multiples of factor as non prime
			// suffices to consider mutiples factor, factor+1, ..., n/factor
 			if (isPrime[factor]) { 
				for (int j = factor; factor * j <= n; j++) {
					// If 2 is prime, 4, 6,8,16... are not prime.. We mark the 
						// Also 6,  12, 18 also not prime
					isPrime[factor * j] = false;
				}
			}
		}
		System.out.print("0 1 ");
		for(int i=0; i <n; i++ ) {
			if(isPrime[i]) System.out.print(i + " ");
		}
		
	 
		
	}

}






