package sample;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 10;

		double d = 23.4;
		// Match constant-value expressions in cases.
		switch (value) {
			case 10 :
				System.out.println("A");

			case 10 * 10 :
				System.out.println("B");
				break;
			case 10 * 100 :
				System.out.println("C");
				break;
		}

		System.out.println("After switch");

		char c = 'x';

		switch (c) {
			case 'a' : {
				System.out.println("One: " + c);
				break;
			}
			case 'b' :
			case 'c' : {
				System.out.println("Two or three: " + c);
				break;
			}
			default : {
				System.out.println("Default case: " + c);
			}
		}
		System.out.println("End: ");

		// Please repeat questin
		switch (value) {
			case 1 :
				System.out.println("A");

			case 3 : // matches. Goes to next also if no break
				System.out.println("3"); // 3 4 . 4 has break. stops.
				// nobreak
			case 4 :
				System.out.println("4");
				break;
		}

	}

}
