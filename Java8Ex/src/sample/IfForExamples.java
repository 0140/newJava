package sample;

public class IfForExamples {

	 

	public static void main(String... args) {
		// TODO Auto-generated method stub

		double d = 243.4; // local variable

		if (d >= 200) {
			System.out.println("d greater than 200");

			System.out.println("Second line from if");
		}

		if (d < 300) {
			System.out.println("d less than 300");
		}

		if (d > 250)
			System.out.println("d greater than 250");

		if (d >= 400) {
			System.out.println("d greater than 400");
		} else {
			System.out.println("d not greater than 400");
		}

		d = 43;
		if (d > 200) {

			System.out.println("d  greater than 200");
		} else if (d > 100) {
			System.out.println("d  between 100 and  200");
		} else if (d > 50) {
			System.out.println("d  between 50 and  100");
		} else if (d == 30) {
			System.out.println("d  equals 30.");
		} else {
			System.out.println("d  less than 50");
		}

		if (d != 10) {
			System.out.println("d  not equal to 10.");
		}

		if (d > 45) {
			System.out.println("d more than 45.");

		} else {
			System.out.println("d  less than 45.");

		}
		
		String s1= "R";
				String s2 = "s";
				
				//s1.equals(s2)
				
				//==
		

	}

}
