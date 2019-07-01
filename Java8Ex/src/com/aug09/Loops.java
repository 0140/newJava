package com.aug09;

public class Loops {

	public static void main(String[] args) {
		 
		for (int i=0; i < 5; i++) {
			System.out.println("i=" + i);
		}
		
		
		int[] arr = {  12, 34, 56, 6 };
		
		int[] arrex = new int[5];
		arrex[0] = 3;
		arrex[1] = 7;
		arrex[2] = 78;
		arrex[3] = 2;
		arrex[4] = 98;
		
		//arrex[5] = 98;
		// Enhanced for loop
		for(int p: arr) {
			System.out.println("p:" + p);
		}
		
		System.out.println("Done for.");

		int i = 6;
		while(i < 13) {
			System.out.println("while i:" + i);
			i+=3;
		}
		
		System.out.println("Done while.");
		
		i = 7;
		do {
			System.out.println("Do while i:" + i);
			i-= 3;
		} while(i>0);

		System.out.println("Done do while.");
		
		for (int j=0; j < 5; j++) {
			if(j == 3) continue;
			System.out.println("j=" + j);
		}
		
		System.out.println("Done Coninue.");
		
		for (int j=0; j < 5; j++) {
			if(j == 3) break;
			System.out.println("j=" + j);
		}
		System.out.println("Done break.");


	}

}
