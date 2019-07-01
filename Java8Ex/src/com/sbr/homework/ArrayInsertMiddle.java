package com.sbr.homework;

public class ArrayInsertMiddle {
	
	static int N = 11;	
	double d = 56;
	
	 static {
		 //50 lines of code
			N = 11;
		}
	
	
	
	public static void main(String args[])
	{
		int[] a = {1, 2, 3, 4, 5, 6};
		
		// We need -- int []finalarray = {1, 2, 3, 4, 87, 5};
		
		int[] finalarray = addPos(a, 4, 87);
		
		for(int n:finalarray)
		{
			System.out.println(n);
		}
		
		//int p = ArrayInsertMiddle.N;
		
		//d = 34;
		
		 

	}
	
	public  static int[] addPos(int[] a, int pos, int num) {
	    int[] result = new int[a.length];
	    for(int i = 0; i < pos; i++)
	        result[i] = a[i];
	    result[pos] = num;
	    for(int i = pos + 1; i < a.length; i++)
	        result[i] = a[i - 1];
	    
	   
	    
	    
	    return result;
	}
	
	public int testMethod()
	{
		int j = ArrayInsertMiddle.N;
		return j;
		
	}


}
