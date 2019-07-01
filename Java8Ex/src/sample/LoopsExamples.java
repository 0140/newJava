package sample;

/**
 * Loop examples: http://www.dotnetperls.com/for-java
 * 
 * Find student with maximum marks 
 * Find sum of array elements
 * 
 * @author Bhaskara Sama
 *
 */
public class LoopsExamples {

	int i = 99;
	
	public static void main(String args[]) {

		int i = 31;
		while (i < 30) {
			i++;
			System.out.println("i=" + i);
		}

		int p = 34;

		do {
			p--;
			System.out.println("p=" + p);
		} while (p > 35);

		for (int n = 0; n < 6; n++) {
			System.out.println("n=" + n);
		}

		int[] numbers = { 10, 20, 30, 40, 50 };
		
		//Object[] o = {c1, c2   };
		//Object   []o = {c1, c2   };
		//Object   o[] = {c1, c2   };
		
		// for each loop
		for (int x : numbers) {
			System.out.print(x);
			System.out.print(",");
		}
		
		System.out.print("      ");
		
		for (int n = 0; n < 6; n++) {
			System.out.println("n=" + n);
			if (n==3) break;
		}
		
		System.out.print(" End.  ");
		
		System.out.println("  Continue    ");
		
		for (int n = 0; n < 6; n++) {
			System.out.println("n=" + n);
			if (n==3) continue;
			System.out.println("Loop iteration end");
		}

		int[] ss = {  1, 56, 67, 34, 60, 79, 8 };
		
		int[] ss2 = new int[5];
		ss2[3] = 4;
		ss2[0] =  4;
		System.out.println(ss2[5]);

		
		
	}

}
