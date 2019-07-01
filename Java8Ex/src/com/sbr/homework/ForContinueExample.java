package com.sbr.homework;

import java.util.Scanner;

/**
 * 
Read a value from command line. 
Suppose we have array of numbers. Print the numbers of the array.
 If the array number is equal to command line value you read , 
 do not print that
b

 * @author bhaskar
 *
 */
public class ForContinueExample {
	int[] arr = new int[5];
	
	 

	public static void main(String[] args) {
		 
		/*int[] n = { 1, 5, 7, 8, 89                 };
		System.out.print(n[2]);*/
		
		/*int[] x = new int[5];
		x[0] = 3;
		x[4] =  7;
		x[5] = 7;*/
		
		//4, 6, 123, 47, 78, 47, 9, 234, 0, 34
	   int arr[] = new int[5];
	  arr[0] = 4;
	  arr[1] = 7;
	  arr[2] = 98;
	  arr[3] = -4;
	  arr[4] = 67;
		
		
		int[] n =  { 5, 78, 3, 99, 45    };
		
		System.out.print(n[3]);
		
		System.out.println("Continue");
		
		for (int i=0; i < n.length; i++) {
			
			if (n[i] == 99) continue;
			
			System.out.println("continue:" + n[i]);
		}
		
		System.out.println("Break");
		
		for (int i=0; i < n.length; i++) {
			
			if (n[i] == 99) break;
			
			System.out.println(n[i]);
		}
		
		// For each loop
		for(int f: n) {
			System.out.println("f:" + f);
		}
		
		
		Scanner scanner = new Scanner(System.in);
		 
		System.out.println("Type a Integer:");
		int m = scanner.nextInt();
		
		System.out.println("Type a double:");
		double d = scanner.nextDouble();
		
		System.out.print("Type a line:");
		String s = scanner.next();
		System.out.println("Done." + s);

	}
	
	 public static void main3(String[] args) {
	        int a[]={1,2,3,4,5,6,7,7};
	       
	       
	      for(int x : a ) {
	         if( x >99 )  continue;	           
	         System.out.println( x );
	        
	      }
	   }
	

}
