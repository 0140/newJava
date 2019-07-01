package CollectionsEx;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ArraysSquaresOfIntegersSorting {

	public static void main(String[] args) {

		Integer[] parameter = { 1, 2, 3, 4 };

		int[] paramArr = new int[5];
		paramArr[0] = 34;
		paramArr[1] = 43;

		int[] outArr = getSquares(parameter);

		for (int g : outArr) {
			System.out.println(g);
		}
		
		// How do I convert Array into List?
		List<Integer> interim = Arrays.asList(parameter);

		//
		Object[] arrBack = interim.toArray();

		// Sort Array
		Arrays.sort(parameter);

		// Sort collections
		Collections.sort(interim);
		// Only for list. Other collections should be converted to list

		HashSet<Integer> hashset = new HashSet<Integer>(interim);

		// Arrays.sort(parameter, new Comparator());

		// interim.toArray(arg0);

		// hashset.addAll(interim);
		Integer[] tharget = (Integer[]) hashset.toArray();

	}

	public static int[] getSquares(Integer[] inData) {
		int[] outData = new int[inData.length];

		for (int n = 0; n < inData.length; n++) {

			outData[n] = inData[n] * inData[n];
		}

		return outData;
	}

}