package com.sbr.homework;

import java.util.Scanner;

//import java.util.Scanner;

public class ScannerEx {
	
	  int i ; // instance variable
	  
	  boolean b ; // false
	  
	  double d2;
	  
 
	public static void main(String[] args) {
		
		//System.out.println("argumrnts:" + args[0] + " " + args[1] + args[2]);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an  interger:");

		int k = scanner.nextInt();

		System.out.println("k=" + k);

		
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your rollno");
		int rollno = sc.nextInt();
		/*System.out.println("Enter your name");
		String name = sc.next(); // string
		System.out.println("Enter your fee");
		double fee = sc.nextDouble();
		System.out
				.println("Rollno:" + rollno + " name:" + name + " fee:" + fee);
	*/	sc.close();
		
		//Arrays.cop
		
		/*ScannerEx ex = new ScannerEx( ); //local var
		//ex.i
		ex.process();
		
		ScannerEx ex2 = new ScannerEx( );
		 
		ex2.i = 5;
		
		int j = 8;
		
		j++;*/
		
		int[] data = {34, 56, 6, 90, 47     };
		printArray(data, rollno);
			}
	
	void process() {
		System.out.println("Process");
	}
	
	public static void printArray(int[] arr, int n) {
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i] ==n) continue; 
			 System.out.println(arr[i]);
		 }
	}

}
