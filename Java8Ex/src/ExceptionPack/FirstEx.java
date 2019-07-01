package ExceptionPack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Exceptions are abnormal conditions.
 * 	ex: Input file not present. 
 * 		Data missing.
 * 		Supposed to get SSN. Obviously, data format wrong.
 * 
 * Why should we handle eceptions?
 * 
 * If we do not handle exceptions, normal or required flow of the
 * 		application will braks when the exception occurs.
 * 		Even when exception occurs, business logic defines how the 
 * 		system needs to behave. Ex: If input file is not there,
 * 		production support team should get an email 		
 *      with the necessary information.
 *      We need to handle exceptions like this,
 *       to maintain application logic or the business logic.
 * 
 * http://www.geeksforgeeks.org/checked-vs-unchecked-exceptions-in-java/
 * 	
 * 
 * 
 * @author bhaskar
 *
 */
public class FirstEx {

	public static void main(String[] args) {
		 
		//int n = 10/0;
		System.out.println("FirstEx 10/0");
		
		File file = new File("C:\\Bhaskar\\1ds.txt");
		
		try {
			FileReader fr = new FileReader(file);
			System.out.println("Try  successful..");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
 		}
	 
		System.out.println("Main complete.");
		
		 try {
			process();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
	
	/**
	 * Exception propagation
	 * 
	 * @throws FileNotFoundException
	 */
	public static void process( ) throws FileNotFoundException {
		File file = new File("C:\\Bhaskar\\1ds.txt");
		
		FileReader fr = new FileReader(file);
		
		System.out.println("FileReader Opened.");
	 
		 
		
	}

	 
		

}
