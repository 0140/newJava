package ExceptionPack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoCloseableEx {
	private final static String FILENAME = "file1.txt";
	public static void main(String[] args) {
		/**
		 * https://technicalmumbojumbo.wordpress.com/2013/02/15/back-to-basics-java-7-autocloseable-tutorial-overview/
		 * https://examples.javacodegeeks.com/core-java/java-autocloseable-interface-example/

		 */
		
		/**
		 * In Java, normally we open a file in a try block, 
		 * and close the file in the finally block, 
		 * 
		 * see following :
		 * 
		 * Since JDK 7, a new “try-with-resources” approach is introduced. 
		 * When a try block is ending, 
		 * it will close or release your opened file automatically.
		 */
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\testing.txt")))
		{

			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		  
		 
	}

}
