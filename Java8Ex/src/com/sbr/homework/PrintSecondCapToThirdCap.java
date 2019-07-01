package com.sbr.homework;

public class PrintSecondCapToThirdCap {
	public static void main(String[] args) {

		String s = "AbcdeFghijKlmno";

		boolean firstBoolean = false;
		boolean secondBoolean = false;
		boolean thirdBoolean = false;

		int firstPtn = 0;
		int secondPtn = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			//Character cobj = new Character(c);

			if (Character.isUpperCase(c)) {

				System.out.println(c);
				
				if (secondBoolean) {
					thirdBoolean = true;
					secondPtn = i;

				}

				if (firstBoolean && !secondBoolean) {
					secondBoolean = true;
					
					firstPtn = i +1;
					System.out.println(c + " " + i);
					
				}

				if (!firstBoolean) {
					firstBoolean = true;
					
				}

			}

		}
		
		System.out.println(firstPtn + "    " + secondPtn);
		System.out.println("FirstCapToSecondCap =" + s.substring(firstPtn, secondPtn)); //ghij

	}

}
