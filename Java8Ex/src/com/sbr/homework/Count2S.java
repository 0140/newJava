package com.sbr.homework;

/** Count the number of 2s in a given word.
 * Ex: 2hrt32jqp. 2 occurs two times in the word.
 * 
 * @author bhaskar
 *
 */
public class Count2S {

	public static int count2s(int n) {
		int count2 = 0;

		for (int i = 0; i <= n; i++) {
			String stringrep = String.valueOf(i);

			for (int k = 0; k < stringrep.length(); k++) {
				char kthchar = stringrep.charAt(k);
				;
				if (kthchar == '2')
					count2++;
			}
		}

		return count2;
	}

	public static void main(String[] args) {
		//Count2S c = new Count2S();
		int result = Count2S.count2s(29);
		System.out.println("Number of 2s in:" + 25 + ":" + result);

	}
}
