package com.sbr.homework;

import java.util.Arrays;

public class Array_Qtns_Bubble_Sort {

	public static void main(String[] args) {
		 
		
		int[] arr = new int[8];
		int[] arr2 = {51, 89, 23, 4, 45   };
		
		
		
		// Can not insert in middle of array
		// type of elements fixed -- int here
		String[] arr3 = new String[5]; // new will create array. Default values
		double[] arrd = new double[4];
		arrd[0] = 3.4;
		arrd[1] = 5.3;
		
		double[] arrd2 = {3.4, 5.3, 0, 0    };
		
		for (int i =0; i < arrd.length; i++)
		{
			System.out.println(arrd[i]); // by default, zero
		}
		
		// In java or testing?
				 
		/*
		 * waits..
		 * 
		 * Reproducing , debugging intermittent errors	 
		 * 
		 * //form/div/input[@id='name']
				 
		 Finds element in middle of DOM structure
		 *
		 *
		 *0 to 5 is six elements
		 *
		 */
		
		int[] h = new int[6];
		
		for (int i =0; i < h.length; i++)
		{
			System.out.println(h[i]); // 0..5
		}
		
 		//when index is more than size  ArrayIndexOutOfBoundsException
		// Adjust index that we are referring
		
		Arrays.sort(h);
		
		// Bubble sort or some algorithm
		// compare two consecutive elements.
		// ......
		
		/**
		 * 
		 * 
		 * 
		 * 
		 */
		
		int[] h5 = { 34, 5, 78, 90, 3, 5, 2   };
		bubbleSortInAscendingOrder(h5);

	}
	
	public static void bubbleSortInAscendingOrder( int numbers[])
    {
        int temp; 
        for(int i = 0; i < numbers.length; i++)
        {
        	// we iterate as many rows times
        	// Each time, we do bubble sort. That pushes largest number to right.
        	// Iterate so many times
            for(int j = 1; j < (numbers.length -i); j++)
            {
                //if numbers[j-1] > numbers[j], swap the elements
                if(numbers[j-1] > numbers[j])
                {   temp = numbers[j-1];
                    numbers[j-1]=numbers[j];
                    numbers[j]=temp;
                }
            }
            print(numbers);
        }
    }    
    public static void print(int contents[])
    {
    	 for(int i = 0; i < contents.length; i++)
         {
             System.out.print(contents[i]+" ");
         }
    	 System.out.println(" ");
    }

}
