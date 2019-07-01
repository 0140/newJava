package sample2;

import sample.City;

/**
 * https://blog.udemy.com/for-each-loop-java/
 * 
 * @author Bhaskara Sama
 *
 */
public class Loops {
	int g;
	boolean b;
	char c = '\u0000';

	public void test() {
		g = 45;
		// getStaffCount();

	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {

		int[] arr3 = new int[5];
		arr3[0] = 34;
		/*
		 * arr3[1] = 6; arr3[2] = 8; arr3[3] = 7;
		 */
		arr3[4] = 4;
		// arr3[6] = 78;
		int g = 7;
		System.out.println(arr3[1]);

		System.out.println(g);

		{
			double d; // Local var
		}
		//d= 78;

		int[] numericals = { 100, 200, 300, 400, 500 };

		System.out.println(numericals[2]);

		int[] arr = new int[4];
		arr[0] = 345;
		arr[1] = 234;
		arr[2] = 12;
		arr[3] = 89;
		// numericals[4] = 56;
		// System.out.println("Value:" + numericals[5]);
		System.out.println("----------------------------------");

		// int[] numericals = new int[6];
		// numericals[0] = 34;

		// for each loop
		for (int u : numericals) {
			System.out.println(u);
			System.out.print(",");
		}
		System.out.print("\n\" Hello from Line 66");

		for (int i = 0; i < 5; i++) {
			System.out.println("i=" + i);
		}

		System.out.println("------------------- 71");

		for (int i = 0; i < 5; i++) {
			if(i == 3 ) continue; // Stop current iteration immediately,
								  // Start next iteration immediately
			System.out.println("i=" + i);

		}

		System.out.println("&&&&&&&&&&&&&&&&&");

		for (int i = 0; i < 5; i++) {
			if (i == 3)
				break;
			System.out.println("i=" + i);

		}

		String[] titles = { "William", "Beatrice", "Lucy", "Sam" };
		for (String name : titles) { // for each loop
			System.out.print(titles);
			System.out.print(",");
		}

		int i = 10;

		System.out.println("line98");

		while (i < 15) {
			System.out.print("value of i : " + i);
			//i++;
			System.out.print("\n");
		}

		i = 50;
		do {
			i--;
			System.out.print("Do while:" + i);
		} while (i > 40);

		City c = new City();
		// return c.getStaffCount() * 10000;
	}

	void pr() {
		g = 45;
		
		Loops l = new Loops();
		Loops m = new Loops();
	}

}

