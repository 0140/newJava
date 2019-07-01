package com.sbr.homework;

/*
 * Create a method that takes array as paraeter and returns the array 
 * after incrementing all elements by 10;
 * THe method prints all the elements  also. Do not print if element is more than 100.
 * 
 * Call the method.
 * 
 */
public class ArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArr = {34, 67, 87, 9,12,95,7,8};
		
		ArrayMethod methodCl = new ArrayMethod();
		int[] processedArr =  methodCl.processArray(iArr);

	}
	
	public int[]  processArray(int[] arrArgs) {
		
		for (int i =0; i < arrArgs.length; i++) {
			arrArgs[i] = arrArgs[i] + 10;
			
			if(arrArgs[i] > 100) continue;
			System.out.println(arrArgs[i]);
		} 		
		
		return arrArgs;		
	}

}
