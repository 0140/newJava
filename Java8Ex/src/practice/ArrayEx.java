package practice;

import demo.Car;

/**
 * Array of ten elements.
 * Find the maximum number from the array.
 * 
 * @author bhaskar
 *
 */
public class ArrayEx {

	public static void main(String[] args) {

		int arr[] = new int[4]; // array is a group of elements.
		// The elements can be primitive types or reference types.

		arr[0] = 4;
		arr[1] = 5;
		arr[2] = 9;
		arr[3] = 8;
		// arr[4] = 12;

		int[] arr2 = {234, 67, 89};

		Car carobjects[] = new Car[3];

		Car c1 = new Car();
		Car c2 = new Car();

		carobjects[0] = c1;
		carobjects[1] = c2;
		carobjects[2] = new Car();

		System.out.println(arr2[1]);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("---------------------");

		// For each loop
		for (int elem : arr) {
			System.out.println(elem);

		}

		// For each loop
		for (Car c : carobjects) {
			System.out.println(c.getEngineType());

		}

		System.out.println(arr[arr.length]);

	}

}
