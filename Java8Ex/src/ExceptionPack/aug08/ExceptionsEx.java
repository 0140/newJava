package ExceptionPack.aug08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsEx {

	public static void main(String[] args)    {
		int i = 3;
	    i = 12/0;
		System.out.println("i=" + i);
		// Filezilla
		// Checked, unchecked exceptions -- types of exceptions
		
	/*	 try {
			FileReader f = new FileReader("c:\tyg.txt");
			i = 34;
			System.out.println("Done with first part");

			 
				f.read();
			 
			System.out.println("Done with try");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		 */
		
		 
		    try {
				process(0);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				process(45);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		System.out.println("Done with class");

		//throw, throws, throwable
		
	}
	
	public static void process(int i)  throws FileNotFoundException, IOException   
	{
		if( i==0) throw new IllegalArgumentException();
		
		/*if(i ==0) {
			
			IllegalArgumentException e = new IllegalArgumentException();
			throw e;
		}*/
		//FileReader f2 = new FileReader("c:\\tyg.txt"); 
		
		FileReader f;
		try {
			f = new FileReader("c:\\tyg.txt"); // Checked Exception
			f.read();
		} catch (FileNotFoundException e) {
 			e.printStackTrace();
 			// log stack trace and message into Log4J log.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		 
		System.out.println("Done with first part");

		
		 
			
		 
		System.out.println("Done with try");

	}

}
