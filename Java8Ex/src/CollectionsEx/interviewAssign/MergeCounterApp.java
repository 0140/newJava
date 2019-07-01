package CollectionsEx.interviewAssign;

import java.util.HashMap;
import java.util.Map;

public class MergeCounterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1,2,3,4,10,20,30 };  // random length between 1 to 10,000, random content 1 to 10,000

		int[] b = { 20,30,1,2,1,3,4,4,5 };
		
		
		Map<Integer, Integer> counter= mergeCounter(a, b);
		
		// Printing results
		counter.forEach((k,v) -> System.out.println(k + ":" + v));
		
		
		
	}
	
	public static Map<Integer, Integer> mergeCounter(int[] a, int[] b ) {
		// Can use TreeMap if want the results sorted.
		Map<Integer, Integer> mergeCounter = new HashMap<Integer, Integer>();
		//Element, Number of occurrences
		
		int loopMax = (a.length >= b.length) ? a.length : b.length;
		
		for(int i=0; i<loopMax; i++) {
			if(i < a.length) {
				updateCount( mergeCounter, a[i]);
			} 
			
			if(i < b.length) {
				updateCount( mergeCounter, b[i]);
			} 
			
		}
		 
		return mergeCounter;
	}

	private static void updateCount(  Map<Integer, Integer> mergeCounter, int currentNumber) {
 		Integer count = mergeCounter.get(currentNumber);
		if(count == null) {
			mergeCounter.put(currentNumber, 1);
		} else {
			count = count.intValue() +1;
			mergeCounter.put(currentNumber, count);
		}
	}

}
