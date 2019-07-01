package com.sbr.homework;

public class EliminatesDuplicatesInArr {

	public static void main(String[] args) {
 		
		int[] inArr = { 2, 6, 99, 6, 34, 99, 23, 0, 2 };
		
		int[] unique = elimDup(inArr);
		
		for(int m=0; m < unique.length; m++)
		{
			System.out.print(unique[m] + " ");
		}

	}
	
	public static int[] elimDup(int[] arr) {
		
		int[] target = new int[arr.length];
		int targetPtn =0;
		
		for(int j=0; j < arr.length; j++) // looping on source
		{
			int currentElem = arr[j];
			
			boolean alreadyPresent = false;
			/// Alrady in target 
			for (int k=0; k < target.length; k++){
				
				//-- Yes?
				if(currentElem == target[k])
				{
					// Don't copy again
					alreadyPresent = true;
					break;
				}  					
			}
			
			if(!alreadyPresent)
			{
				target[targetPtn] = currentElem;
				targetPtn++;
			}			
		}
		
		
		return target;
		
	}

}
