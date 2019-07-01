package StringEx;

import java.text.SimpleDateFormat;

import com.centillion.Car;

import sample.Vehicle;

/**
 * 
 * http://www.java-examples.com/java-string-examples
 * http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html
 * http://javahungry.blogspot.com/2013/06/difference-between-string-stringbuilder.html
 * 
 * http://www.programcreek.com/2013/04/why-string-is-immutable-in-java/
 * 
 * https://docs.oracle.com/javase/tutorial/essential/concurrency/imstrat.html
 * http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html
 * http://javarevisited.blogspot.in/2015/01/top-20-string-coding-interview-question-programming-interview.html
 * 
 * @author Bhaskara Sama
 *
 */
public class StringEx {

	int n;
	String s = "m";

	public static void practice() {
		String stc = "Where are \t \" \\ you from?"; // Immutable
		System.out.println("stc=" + stc);

		// stc = stc + "H";
		String stc2 = stc;

		System.out.println("substr=" + " ");
		String result = stc.replace("ere", "mpn");
		System.out.println("stc=" + result);
		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 * sdf.isLenient(false);
		 */
	}

	public static void main(String[] args) {

		String st = "Describes The String.";

		practice();
		int i = 6;
		int g = 6;

		if (i == g)
			System.out.println("i and g are same.");

		String s = "Sachin"; // Immutable
		String m = "Sachin";

		// s = s + " P"; // i ==6
		if (s == m) {
			{
				System.out.println("s and m are same string");
			}
		} else {
			{
				System.out.println("::s and m are different string");
			}
		}
		// k = "AM"
		// k = "AM" + " P";

		String sdiff = new String("Sachin");
		String sr = sdiff;
 
		if (s == sdiff) {
			System.out.println("s and sdiff are same string");
		} else {
			System.out.println("s and sdiff are different strings");
		}

		Car c1 = new Car();
		Car c2 = new Car();

		if (c1.equals(c2)) { // true
			System.out.println("c1 and c2 are   equal.");

		} else {
			System.out.println("c1 and c2 are not equal.");

		}

		if (s.equals(sdiff))
			System.out.println("Content same. But may be different objects");
		String p = s.concat("New").concat(" ");
		System.out.println("p " + p);
		System.out.println("s " + s);

		String s2 = s.concat(" Ramesh").concat(" Sippy");
		System.out.println("s2:" + s2);
		System.out.println("s:" + s);

		if (s == m) {
			System.out.println("s is same as m");
		} else {
			System.out.println("s nad m not same");

		}
		System.out.println("== == == == ==  == == == = ==  == = ==  === ==  === ==  === ==  ==");

		String concatStr = "1" + "2" + "3";

		System.out.println(concatStr);
		System.out.println("?????????????????????");

		System.out.println("1" + 2 + 3); // 123
		System.out.println(1 + 2 + "3"); // 33
		System.out.println(1 + 2 +  "3" +  4 ); // 334
		 


		String result = s.concat(" Tendulkar").concat(" from");// concat()
																// method
																// appends the
																// string at the
																// end
		System.out.println("s:" + s);// will print Sachin because strings are
										// immutable objects
		System.out.println("result:" + result);

		String numbers = "First,";

		String resultnumbers = numbers.concat("Second,").concat("Third,")
				.concat("Fourth,").concat("Fifth");
		System.out.println("resultnumbers:" + resultnumbers);

		String concatE = "One," + "Two," + "Three";

		StringBuffer sbuffer = new StringBuffer(); // Mutable // Synchronized //
													// slower
		sbuffer.append("a").append("b").append("c").append("d").append("gh");
		System.out.println("sbuffer:" + sbuffer);

		StringBuilder sbuilder = new StringBuilder(); // Mutable -- Not
														// Synchronized
														// //Performs better --
														// faster
		sbuilder.append("p").append("q").append("r").append("s");
		System.out.println("sbuilder:" + sbuilder);

		practice();

		System.out.println(1 + 2);
		System.out.println(1 + "2");
		System.out.println(1 + 2 + "3");
		System.out.println("1" + 2 + 3);

		String s4 = "AB";
		String n = s4.concat("D").concat("H");
		System.out.println(n);
		System.out.println(s4);
		
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o2;

	}

}
