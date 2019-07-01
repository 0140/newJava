package exceptionsExamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * // try catch system.exit(1)  // exit exits system -- No
		
 */
public class MathExamples {

	public static void main(String[] args) {
		// try catch system.exit(1)  // exit exits system -- No
		
		 
			try {
				readTheFile();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 
		

	}

	/**
	 * throw, throws, Throwable
	 */
	private static void readTheFile() throws Exception {
		File f = new File("c:/t/1.txt");
		
		FileReader reader = null;
		try {
			reader = new FileReader("c:/t/11.txt");
		} catch (FileNotFoundException e) {   // Compile time // checked exception
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally
		{
			try {
				if (reader != null) reader.close(); // database connections
			} catch (IOException e) {
				System.out.println("Ignore it.");
			}
			reader = null;
		}  // what is the difference between final, finally, finalize
		
		System.out.println("File read");

		System.out.println("After try block");

		int n = 10 / 0; // RuntimeException // unchecked
	}

}
