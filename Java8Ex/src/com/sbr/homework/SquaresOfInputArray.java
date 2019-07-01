package com.sbr.homework;

public class SquaresOfInputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayIn = { 4, 6, 8, 3, 9 };
		
		int[] arrOut = calcSquares(arrayIn);
		
		for(int j=0; j < arrOut.length; j++)
		{
			System.out.print(arrayIn[j] + " ");
		}

	}
	
	public static int[] calcSquares(int[] arr)
	{
		for(int i=0; i< arr.length; i++)
		{
			arr[i] = arr[i] * arr[i];
		}
		
		return arr;
		
	}

}
