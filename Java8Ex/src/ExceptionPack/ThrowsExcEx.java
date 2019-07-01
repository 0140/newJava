package ExceptionPack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExcEx {

	public static void main(String args[]) 
	{	
		 
			  try {
				readFile();
			 } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 			
			  
	}

	private static void readFile() throws FileNotFoundException {
		File file = new File("C:\\Bhaskar\\1ds.txt");
		
		FileReader fr = new FileReader(file);
		System.out.println("After FileReader ");
				 
			 
				 
	}
}
