package ExceptionPack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public final class CheckedEx {

	final static int j = 23;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//int g = 34 / 0; // Unchecked exceptions

		try {
			int n = 34 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero happened.");
		}
		System.out.println("After try catch block");

		// j = 34;
		

		//String s3 = openFile();

		try {
			String s4 = openFile();
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			System.out.println("e2");

			e2.printStackTrace();
		} catch (IOException e3) {
			System.out.println("e3");

			// TODO Auto-generated catch block
			e3.printStackTrace();
		} 

		// File file = new File("/t/22222.txt");

		BufferedReader buf = null;
		FileReader fr = null;
		try {
			
			fr = new FileReader("c://t/22222.txt");

			//String ln = buf.readLine();
			System.out.println("Done fr 22222.txt.");
			
			//System.exit(0);
			return;
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			System.out.println("In finally.");

			if (fr != null)
				fr.close();
			fr = null;
			if(buf != null) 
				buf.close();
			buf = null;
		}

		// what is difference between final, finally, finalize
		// what is difference between throw, throws, Throwable
		// garbage collector
		// Is there a wau to force garbage collection in java?  System.gc();
		

		System.out.println("--------------------------------------------------");

		/*
		 * fr = new FileReader(file); try { fr.read(); } catch (IOException e) {
		 * // TODO Auto-generated catch block e.printStackTrace(); }
		 */

		
		
		System.out.println("11");
	}

	public static String openFile() throws FileNotFoundException {
		FileReader f = new FileReader("h.txt");
		int i = 0;
		;
		try {
			i = f.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // checked exceptions
		return String.valueOf(i);
	}

	@Override
	protected void finalize() {

	}
}
