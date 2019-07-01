package com.sbr.homework;

public class StringFirstCapitalToSecondCapital {

	public static void main(String[] args) {
		String s = "this Is from Sparta";

		boolean firstCap = false;
		boolean secondCap = false;

		int firstPtn = 0;
		int secondPtn = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			//System.out.println("Input:" + c);
			if (Character.isUpperCase(c)) {
				if (firstCap )
					secondCap = true;
				else
					firstCap = true;				
			}
			
			if (firstCap && !secondCap) {
				System.out.println("output:" + c);
			}

			if (secondCap) {
				System.out.println(c);
				break;
			}

		}

	}
}
