package CollectionsEx;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import demo.Car;
import sample.Address;
import sample.City;
import sample.Dog;

/**
 * http://data-structure-learning.blogspot.in/2015/06/difference-between-set-list-and-map.html
 * http://javahungry.blogspot.com/2015/03/difference-between-array-and-arraylist-in-java-example.html
 * http://www.javatpoint.com/difference-between-arraylist-and-vector
 * http://data-structure-learning.blogspot.com/2015/05/difference-between-hashtableand-hashmap.html
 * 
 * http://www.javacodegeeks.com/2013/02/40-java-collections-interview-questions-and-answers.html#java-collections-framework
 * https://beginnersbook.com/2014/06/difference-between-iterator-and-listiterator-in-java/
 * 
 * 
 * @author Bhaskara Sama
 *
 */
public class ListEx {

	public static void main(String[] args) {

		/**
		 * The ArrayList in Java is a sequence, a list of objects. It cannot be
		 * sparse, there can be no gaps. You can't have an element 3 if elements
		 * 2, 1 and 0 don't exist.
		 * 
		 * ArrayList is backed by an array but that doesn't affect the semantics
		 * of the ArrayList as a continuous sequence. It has a constructor that
		 * sets the initial capacity of the backing array but that's for
		 * performance reasons. When new elements are added to the ArrayList it
		 * uses the existing storage until that storage is exceeded, then it has
		 * to reallocate a new array. If you know you are going to be adding
		 * 10000 elements to an ArrayList, you set the initial capacity to 10000
		 * so that the reallocation doesn't have to happen repeatedly.
		 * 
		 * If you later want to optimise storage because you believe the backing
		 * array is excessively large, you can save memory by using
		 * trimToSize(). This reduces the backing array so that it is the same
		 * size as the list.
		 * 
		 * The size() of an ArrayList is the number of elements that have been
		 * added, not the capacity of the array in which it is stored. You can't
		 * access unused elements of the backing array. You can only work with
		 * elements through the List API.
		 * 
		 */
		List   al = new ArrayList(); // Non generics version

		// ArrayList l = new ArrayList();

		/*
		 * adding elements
		 */
		al.add("s");
		//al.add(new Car());
		al.add("p");
		al.add("h");
		al.add( 3 ); // Autoboxing
		
		Set set = new HashSet();
		set.add("Z");
		set.add("X");
		//set.add(new Car());
		
		
		al.addAll(set);
		
		al.add(new Car());

		
		System.out.println("Size of the List:" + al.size());

		// al.add( 1); // al.add(new Integer(1))

		// Print first element
		System.out.println("zeroth elem:" + al.get(0));
 		
		/*String str = "";
		Object o = str; //upcasting permitted
		str = (String) o; // downcasting needs typecasting
*/		
		String s3 = (String) al.get(2);
		
		String s = (String) al.get(1); // downcast // typecast // ClassCastException
		 
		
		Object o = s; // Upcasting
	    s = (String) al.get(5); // downcast // typecast

		

		System.out.print("Original contents of al: ");
		Iterator<String> itr = al.iterator();
		// Ordered
		while (itr.hasNext()) {

			String element = itr.next();
			// String element = (String) itr.next(); // ClassCastException
			// itr.remove();
			// list.remove(elemt); Does it work here??
			System.out.println(element);
		}

		// Generics
		List<String> strList = new ArrayList<String>(); // List is interface
					// can point to any implementation like ArrayList or LinkedList
		
		 
		
		ArrayList<String> arrrayList = new ArrayList<String>();

		strList.add("Seven");
		//strList.add(new Car());
		strList.add("two");
		strList.add("Three");
		//strList.add(1);

		String elem = strList.get(2); // clean code // No Type Cssting

		// Integer itg = (Integer) al.get(2); // ClassCastException

		// For each loop to loop over the contents of collection 
		for (String obj : strList) { // Enhanced for loop //  First way

			System.out.println(obj);

		}

		// Second way to loop
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}

		// Third way to loop
		Iterator<String> itrList = strList.iterator();

		while (itrList.hasNext()) {
			System.out.println(itrList.next());
		}

		ArrayList nn = new ArrayList(); // Non generics
		ArrayList<City> cityList = new ArrayList<City>(); // Generics

		City c = new City();
		c.setName("Rendevou");

		City c2 = new City("Hyd", null);

		cityList.add(c);
		cityList.add(c2);
		
 		//cityList.add(new Object());

		City ct = cityList.get(0);

		for (City ct8 : cityList) {
			System.out.println(ct8.getName());
		}

		Iterator<City> itrcity = cityList.iterator();

		while (itrcity.hasNext()) {

			City citi = itrcity.next();
			System.out.println(citi.getName());
		}

		// Unique list -- Remove duplicates
		System.out.println("---------------------");
		Set<String> sunique = new HashSet<String>(strList);

		for (String c9 : sunique) {
			System.out.println(c9);
		}

		String s5 = "d";
		Object o2 = s5; // Upcast Rare

		/*
		 * List interim = java.util.Arrays.asList(parameter); HashSet hashset =
		 * new HashSet(interim);
		 * 
		 * //Arrays.sort(parameter, new Comparator());
		 * 
		 * //interim.toArray(arg0);
		 * 
		 * //hashset.addAll(interim); String[] arr = new String[5];
		 * hashset.addAll(Arrays.asList(arr));
		 */

		// Java 8:
		strList.forEach(System.out::print); // Method referencing
		strList.forEach(a -> System.out.println(a));

		Stream.of(strList).forEach(System.out::print);

		Stream.of(strList).forEach(element -> System.out.println(element));

		Collections.sort(strList);

		String[] arr = new String[7];
		arr[0] = "Y";

		Arrays.sort(arr);
		Collections.sort(strList);
		
		 List<Address> listAddress =   new ArrayList<Address>();
		 AddressComparator addrComparator = new AddressComparator();
		 
		 Collections.sort(listAddress, addrComparator );

		String[] toarr = (String[]) strList.toArray();

		List list = Arrays.asList(arr);
		
		/**
		 * The ArrayList in Java is a sequence, a list of objects. It cannot be
		 * sparse, there can be no gaps. You can't have an element 3 if elements
		 * 2, 1 and 0 don't exist.
		 * 
		 * ArrayList is backed by an array but that doesn't affect the semantics
		 * of the ArrayList as a continuous sequence. It has a constructor that
		 * sets the initial capacity of the backing array but that's for
		 * performance reasons. When new elements are added to the ArrayList itamod
		 * uses the existing storage until that storage is exceeded, then it has
		 * to reallocate a new array. If you know you are going to be adding
		 * 10000 elements to an ArrayList, you set the initial capacity to 10000
		 * so that the reallocation doesn't have to happen repeatedly.
		 * 
		 * If you later want to optimise storage because you believe the backing
		 * array is excessively large, you can save memory by using
		 * trimToSize(). This reduces the backing array so that it is the same
		 * size as the list.
		 * 
		 * The size() of an ArrayList is the number of elements that have been
		 * added, not the capacity of the array in which it is stored. You can't
		 * access unused elements of the backing array. You can only work with
		 * elements through the List API.
		 * 
		 */
		
		/*List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		
		String s = (String) list.get(0);*/
		
		/* Linked list , ArrayList difference
 		1) ArrayList internally uses dynamic array to store the elements.
			LinkedList internally uses doubly linked list to store the elements.
		2) Manipulation with ArrayList is slow because it internally uses array. 
		If any element is removed from the array, all the bits are shifted in memory.
			Manipulation with LinkedList is faster than ArrayList because it uses doubly 
			linked list so no bit shifting is required in memory.
		3) ArrayList class can act as a list only because it implements List only.	
		LinkedList class can act as a list and queue both because it implements List 
		and Deque interfaces.
		4) ArrayList is better for storing and accessing data.	
		LinkedList is better for manipulating data.
*/
		int n3 = 67;
		
		Collection<String> cSyn = Collections.synchronizedCollection(list);
		
		int[] arr3 = new int[4];

		
	}

}
