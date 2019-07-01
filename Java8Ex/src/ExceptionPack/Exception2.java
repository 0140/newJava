package ExceptionPack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception2 {
	
	int m;
	
	static int p;
	
	public static void process() throws FileNotFoundException, IOException
	{
		FileReader fr2 = new FileReader("c:\\sdsd.txt");
		
	}

	public static void main(String[] args)    {
		
		int n = 8/0;
		
		System.out.println("After 8/0");
		
		File file = new File("C:\\t\\24568.txt");
		
		
		 
			try {
				FileReader fr = new FileReader(file);
				///....
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			file = null;
			
			System.out.println("After try catch");
			
			 
			FileReader fr2 = null;
				try {
					//process();
					
					fr2 = new FileReader("c:\\sdsd.txt");
					
					System.out.println("In try loop");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					
					try {
						fr2.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					fr2 = null;
				}
			 
				System.out.println("After try loop");
			 
				// final, finally, finalize

	}
	
	protected void finalize()
	{
		
	}

}
