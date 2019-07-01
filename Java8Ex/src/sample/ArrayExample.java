package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

 
/**
 * http://www.java-examples.com/java-string-array-example
 * 
 * 
 * 
 * @author Bhaskara Sama
 *
 */
public class ArrayExample {
	
	public void test()
	{
		int[] a = new int[5];
		
		a[0] = 2;
		a[1] =4;
		a[2] = 56;
		a[3] = 45;
		a[4] = 8;
		
		System.out.println("a[2] =" + a[2]);
		
		String[] b = {"April", "May"};
		System.out.println("b[1] =" + b[1]);
		
		for(int i=0;i<b.length;i++)
			//length is the property of array  
			System.out.println("b[" + i + "] =" + b[i]); 
		
		int[][] arr=new int[3][2];//3 row and 2 column  
		arr[0][0]=1;  
		arr[0][1]=2;  
		 
		arr[1][0]=4;  
		arr[1][1]=5;  
		
		arr[2][0]=7;   
		arr[2][1]=8;   
		
		// Object array. Array of dogs
		Dog dogarr[] = new Dog[3];
		
		Dog  d1 = new Dog();
		Dog  d2 = new Dog();
		Dog  d3 = new Dog();
		
		dogarr[0] = d1;
		dogarr[1] = d2;
		dogarr[2] = d3;
		
		 Arrays.sort(a);
		 
		 ArrayList al =new ArrayList();
		 Collections.sort(al);
		
	}
	
	
	public static void main(String[] args)
	{
		ArrayExample aex = new ArrayExample();
		aex.test();
	}
}
