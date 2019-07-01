package sample2;

import java.util.Arrays;

public class ForExamples {

	public static void main(String args[]) {
		
		int n =7;
		
		for (int i=0; i<7;  i++ )
		{
			System.out.println("i=" + i);
		}
		
		System.out.print("\n");
		
		int g = 7;
		int[] x = new int[g];
		x[0] = 4;
		
		 System.out.print( x[7] );
		
	      String[] names ={"James", "Larry", "Tom", "Lacy"};
	      
	      String[] members = new String[4];
	      members[0]= "WER";
	      members[1]= "RGH";
	      members[2]= "MEM";
	      members[3]= "FAT";
	      System.out.println("Third Member:" + members[2] );
	      
	      //Enhanced for loop
	      for( String name : names ) { // where names is a collection or array
	         System.out.print( name );
	         System.out.print(",");
	      }
	      
	      System.out.print("\n");
	      for (int i=0; i< 5; i++)   System.out.print("One Line");
	      
	      int p=0;
	      for ( ; p< n; p++)   System.out.print("One Line p");
	      
	      
	      
	      Arrays.asList(names).forEach(System.out::println); // Java 8
		
	}
}
