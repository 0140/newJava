package com.sbr.homework;

import java.util.Scanner;

public class PrintAsInRows {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 System.out.println("no.of rows req?");
		 int norows = sc.nextInt();
		 int count = 1;
		 System.out.println("row print");
		 for (int i = norows; i > 0; i--)
		 { 
		  for (int j = 1; j <= count; j++)
		  { 
		   System.out.print("A");
		  }
		  System.out.println();
		  count++;
		 }


	}
}
