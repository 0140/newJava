package ExceptionPack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NotSwimExample {
	
	public static boolean checkAge(int age) throws NotAllowedToSwimException
	{
		if (age < 1)
		{
			
			throw new NotAllowedToSwimException("Less than one year age."
					+ " Not allowed to swim");
		} else
		{
			return true;
		}
		
	}

	public static void main(String args[]) throws FileNotFoundException  {
		int p;
		// try{

		// int i = 10/0;
		//  
		
		

		File file = new File("C:\\Bhaskar\\1ds.txt");

		/*
		 * try { try { int i = 10/0; } catch (ArithmeticException w) {
		 * w.printStackTrace(); }
		 * 
		 * FileReader fr = new FileReader(file);
		 * System.out.println("After FileReader "); } catch
		 * (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		FileReader fr = null;
		 try {

			int i = 10 / 0;

		    fr = new FileReader(file);
			System.out.println("After FileReader ");
		 } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			System.out.println("After try block ");
		} finally
		{
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fr = null;
			
		}
		
		System.out.println("After try block");
		
		 
			readAFile();
		 
		try {
			checkAge(0);
		} catch (NotAllowedToSwimException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace(); // show user error message
		}

	}
	
	public static void readAFile() throws FileNotFoundException {
		BufferedReader buf = new BufferedReader(
				new FileReader("c:\\t\\d1.txt"));
 
		System.out.println("The file is not there.");

	}

}
