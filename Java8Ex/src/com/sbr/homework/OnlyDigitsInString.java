package com.sbr.homework;

public class OnlyDigitsInString {

	public static void main(String[] args) {

		String s = "345788";
		boolean onlyDigits = true;

		for (int i = 0; i < s.length(); i++) {
			char p = s.charAt(i);// converts each letter/number in the string to
									// a character

			if (!Character.isDigit(p)) {
				onlyDigits = false;
				break;
			}
		}
		
		if (onlyDigits)
		{
			System.out.println("Only digits.");
		} else
		{
			System.out.println("Not Only digits.");

		}

	}

}
