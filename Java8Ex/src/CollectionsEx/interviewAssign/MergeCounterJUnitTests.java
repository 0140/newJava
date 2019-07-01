package CollectionsEx.interviewAssign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class MergeCounterJUnitTests {

 
	    private int[] arr1;
	    private int[] arr2;
	    private int[][] mergeResult;


	    @Parameters
	    public static Collection data() {
	    	
	    	Collection c = new ArrayList();
	    	//c.add({ { 1,2,3,4,10,20,30 }, 0.00 });
	    	
	    	int[]  arr1 = { 1,2,3,4,10,20,30 };
	    	int[]  arr2 = { 20,30,1,2,1,3,4,4,5 };
	    	int[][] mergeResult = {{1,3}, {2,2}, {10,2}, {30,2}}; // 10,3 is Negative data. Should be 10,1

	      	return Arrays.asList(new Object[][] { {arr1, arr2, mergeResult}, 
	    										{arr2, arr1, mergeResult}
	    	
	    	
	    										
	    										} );
	    	
	    }

	    public MergeCounterJUnitTests(int[] arr1, int[] arr2,  int[][] mergeResult) {
	        super();
	        this.arr1 = arr1;
	        this.arr2 = arr2;
	        this.mergeResult = mergeResult;
	    }

	    @Test
	    public void verifyMergeCounter() {
	    	MergeCounterApp counter = new MergeCounterApp();
	    	Map<Integer, Integer> resultsMap = counter.mergeCounter(arr1, arr2);
	    	int number1 = mergeResult[0][0];
	    	int expectedCount1 = mergeResult[0][1];
	    	
	    	int number2 = mergeResult[1][0];
	    	int expectedCount2 = mergeResult[1][1];
	    	
	    	int number3 = mergeResult[2][0];
	    	int expectedCount3 = mergeResult[2][1];
	    	
	    	int number4 = mergeResult[3][0];
	    	int expectedCount4 = mergeResult[3][1];
	    	
	    	System.out.println("verifyMergeCounter:" + number1 + " " + expectedCount1);
	    	System.out.println("verifyMergeCounter:" + number2 + " " + expectedCount2);
	    	System.out.println("verifyMergeCounter:" + number3 + " " + expectedCount3);
	    	System.out.println("verifyMergeCounter:" + number4 + " " + expectedCount4);

	    	/*if (Arrays.equals(arr1, arr2))
	            System.out.println("Same");	*/    	
	    	//Assert.assertArrayEquals(actual, mergeResult); // Not using because we are verifying just some numbers.
	    	
	    	int actualCount1 = resultsMap.get(number1);
	    	if(actualCount1 != expectedCount1) 
	    		Assert.fail("Expected Count for number1:" + number1 + " expectedCount1:" + expectedCount1 + " Received:" + actualCount1);
	    	
	    	int actualCount2 = resultsMap.get(number2);
	    	if(actualCount2 != expectedCount2) 
	    		Assert.fail("Expected Count for number2:" + number2 + " expectedCount2:" + expectedCount2 + " Received:" + actualCount2);
	    	
	    	int actualCount3 = resultsMap.get(number3);
	    	if(actualCount3 != expectedCount3) 
	    		Assert.fail("Expected Count for number3:" + number3 + " expectedCount3:" + expectedCount3 + " Received:" + actualCount3);
	    	
	    	
	    	int actualCount4 = resultsMap.get(number4);
	    	if(actualCount4 != expectedCount4) 
	    		Assert.fail("Expected Count for number3:" + number4 + " expectedCount3:" + expectedCount4 + " Received:" + actualCount4);
	    	System.out.println("Test Pass");
	    	
	    }
	}
