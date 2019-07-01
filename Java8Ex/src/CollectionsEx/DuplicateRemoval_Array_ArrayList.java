package CollectionsEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DuplicateRemoval_Array_ArrayList {
	
	public static void removeDuplicatesFromArray() {
	    Integer[] myArray = { 1, 5, 890, 34, 523, 5, -3, 34       };

		for(int i=0; i<myArray.length-1; i++) { // Take one element
	         for (int j=i+1; j<myArray.length; j++) {
	            if(myArray[i] == myArray[j]) {
 	            	myArray[j] = null;
	            }
	         }
	      }
		
		for(int i=0; i <myArray.length; i++ ) {
			System.out.println(myArray[i]);
		}
	}
	
	
	public static void main(String[] args) {
		
		removeDuplicatesFromArray();
	}
	static void removeDuplicatesFromArrayList(int[] arrIn) {
		ArrayList<String> al = new ArrayList<String>();  
	 	al.add("One");
		al.add("One"); // Added a duplicate
		al.add("One");
		
		ArrayList<String> target = new ArrayList<String>(); // Target

		Iterator<String> itr = al.iterator(); // Iterate on input

		while (itr.hasNext()) { // take next element from input
			String elem = itr.next();

			if (!target.contains(elem)) // Is it in target?
				target.add(elem);
		}
		// By now target has unique elements only			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 
	 static int removeDuplicatesAfterSorted(int arr[], int n) 
	    {  
		 // To store index of next unique element 
	        int j = 0; 
	           //   maintaining another updated index i.e. j 
	        for (int i = 0; i < arr.length-1; i++) 
	            if (arr[i] != arr[i+1]) 
	                arr[j++] = arr[i]; 
	       
	        arr[j++] = arr[n-1]; 
	       
	        return j; 
	    } 

	 
	// Manipulate original array
	public static int removeDuplicatesFromSorted(int[] A) {
		int j = 0;
		int i = 1;
	 
		while (i < A.length) {
			if (A[i] == A[j]) {
				i++; // if two numbers equal , skip the second. Already first available.
			} else {
				j++; //   Already jth place used. Incrementing.
				A[j] = A[i]; // if we have different next number, 
				             //we copy next to current location
				i++; // Goto next element
			}
		}
	 
		return j + 1; // Size of array. Upto this we have array numbers.
	}
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {

		// Eliminate duplicates
		ArrayList<String> baseList = new ArrayList<String>();
		HashSet<String> baseSet = new HashSet<String>();
		
		baseSet.addAll(baseList); // List contents transferred to set
		// You can tranfer any collection content into any collection
		
		baseList.clear();
		baseList.addAll(baseSet); // when we added to set duplicates removed
		
		//------------------------------------------------------------------
		// Don't use set to remove duplicates. How?
		ArrayList<String> al = new ArrayList<String>(); // Using Generics class
		// now // Import

		al.add("One");
		al.add("One"); // Added a duplicate
		al.add("One");
		
		ArrayList<String> target = new ArrayList<String>(); // Target

		Iterator<String> itr = al.iterator();

		while (itr.hasNext()) {
			String elem = itr.next();

			if (!target.contains(elem))
				target.add(elem);
		}

		// Now target array list has only unique elements

		System.out.println("----------------------");
		for (int i = 0; i < target.size(); i++) {
			System.out.println(target.get(i)); // Printing only unique // See
												// console
		}
		//------------------------------------------------------
							
		
		 * How many years in Java? Where did you start Java? et
		 

		String[] arr = { "One", "Two", "Three" };
		// String[] arr = new String[4]; arr[3] = "dfd';

		// use variable --
		arr[0] = "four"; // Yellow gone

		int[] arrint = { 1, 56, 78 }; // Integer array

		// We can not add more than size directly. We need to create new array
		// and copy values

		

		// No. Only String elements. We gave parameterized type.

		// Eliminate duplicates from array arr
		// List<String> newAl = ;
		List<String> alnew = Arrays.asList(arr);
		al.addAll(alnew); // I already added all elements of arr

		// Using a set to eliminate duplicates
		Set<String> set = new HashSet<String>(al); // This removed duplicates
		set.addAll(al); // This removed duplicates
		al.clear();
		al.addAll(set); // elements are copied back. Only unique values
 
		// Print array list
		System.out.println("A-----------------------");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i)); // Print is showing duplicates
		}
		
		String[] n = al.toArray(arr);
		//String[] n2 = (String[]) al.toArray();
		

	

		// BDD
		// HashSet HashMap TreeMap
		HashMap<Integer, String> map = new HashMap<Integer, String>();// Import
		map.put(100, "Lakshmi");

		// Where HashMap used?
		// I can process group of value pairs
		// Year and Sports results // We want to process sports results
		// Year integer
		// Sports objects
		
		
		 * Practical example for map:
		 * 
		 * Insurance compant -- Insurance object
		 * 	The customer has many insurance policies.
		 * 	Key is insuranceType. PolicyType. 
		 * 			Value is the corresponding insurance object. 
		 * 			ex: car policy, home policy, boat policy, 
		 * 				healthcare policy...
		 * 
		 * Read data from DB using JDBC, we can hold data
		 * 			in HashMap.
		 * 		Compare the data to expected records.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 

		// Http status codes
		// 200 404
		// 500 Internal Server Error
		// 302
		// 406
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("One");
		al3.add("Hello");
		al3.add("One");
		
		//removeDuplicatesIn_ArrayList(al3);
		findDuplicatesInArray();
	}
	
	public static void findDuplicatesInArray() {
		int[] arr= { 4, 18, -1, 34, 4 , -1     };
		
		ArrayList<Integer> aList= new ArrayList<Integer>();
		
		for (int i: arr) {
			boolean present = aList.contains(new Integer(i));
			if (present) {
				System.out.println(i + " duplicate.");
			}
			else {
				aList.add(i);
			}
		}		
	}
	
public static List<String>  removeDuplicatesIn_ArrayList(List<String> inL) {
		
		List<String> target = new ArrayList<String>();
		
		for(int i=0; i< inL.size(); i++) {
			String current = inL.get(i);
			
			if(!target.contains(current)) {
				target.add(current);
			}		
			
			boolean present = false;
			for(String element: target) {
				if(element.equals(current)) {
					present = true;
				}
			}
			
			if(!present) target.add(current);
		}
		System.out.println("---------------------");

		// Java 8
		target.forEach(System.out::println); // Method referencing
		System.out.println("*******************************");
		//findDuplicates();

		target.forEach(a -> System.out.println(a));

		return target;
		
	}
	
	
	// We used TestNG test method sto call API
   // We also used BDD 
	
	
	
	*/
	
	
	
	
	
 

	 

}
