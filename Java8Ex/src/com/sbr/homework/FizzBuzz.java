package com.sbr.homework;


/**
 * Amex
 * 
 * If a given number is divisible by three only, print fizz
 * If it is divisible by 5 only, print buzz
 * If it is divisible by both, print FizzBuzz
 * 
 * @author Bhaskara Sama
 *
 */
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            // Set this to true when one of the special conditions is met.
            boolean printed = false; 
            
            
            if (   (i % 3 == 0)  &&    (i % 5 == 0)    )
            {
            	printed = true;
                System.out.print("FizzBuzz");
                continue;
            	
            }

            if (i % 3 == 0 && !(i % 5 == 0)) {
                // When i is divisible by 3, then print "Fizz"
                printed = true;
                System.out.print("Fizz");
            } else if (i % 5 == 0 && !(i % 3 == 0)) {
                // When i is not divisible by 3 but is divisible by 5, then print "Buzz"
                printed = true;
                System.out.print("Buzz");
            }
        }
        
    }
}