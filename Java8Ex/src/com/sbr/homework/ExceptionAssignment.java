package com.sbr.homework;

/**
 * Exception assignment
 * 
 * What is the output?
 * 
 * @author bhaskar
 *
 */
public class ExceptionAssignment {

	public static void main(String[] args) {
		ExceptionAssignment partb = new ExceptionAssignment();
		partb.runOutput();
		
	}
	// This outputs some text to the console.Write the text that it outputs.

	public void runOutput() {
		outputStuff("hello");
	}

	public void outputStuff(String text) {
		System.out.print("text" + "\n");
		int tries = 0;
		int max = 2;
		String[] fruits = { "one", "two" };
		try {
			while (tries < max) { //1< 2
				tries++; // becomes 2
				System.out.println(fruits[tries]); // Prints two: 
				// fruites[2] --> ArrayIndexOutOfBounsException
													// ArrayIndexOutOfBounsException
													// for tries = 2 // Exchange
													// the lines. No exception
													// will come.
			}
		} catch (Exception e1) {
			try {
				if (tries == 2) {
					throw new Exception("errorA"); // TODO:  Ex thrown.
													// Because tries = 2
				} else if (tries == 1) {
					System.out.print("errorB");
				}
			} catch (Exception e2) {
				System.out.print("errorC"); // TODO: errorC printed. Because
											// exception thrown.
			}
		}
		System.out.print("done"); // TODO: done printed.

	}

}

/*
output:

text
two
errorCdone

*/