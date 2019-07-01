package ExceptionPack.aug08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFile {

	public static void main(String[] args)  {

		// int i =10/0;
		System.out.println("After /10");

		// File f = new File("c:\\t\\d1.txt");
		String stringToCount = "Magic";
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("c:\\t\\d6.txt")); //concat 
			System.out.println("File Buffer Opened.");
 
			String line = "";
			int count = 0;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println("line:" + line);
				
				String[] words = line.split(" ");
				for(String word: words) {
					if(word.equalsIgnoreCase(stringToCount)) {
						count++;
					}
				}
				
			}
						
			System.out.println("Number Of occurences in file:" + count);
			//System.exit(-1);
			bufferedReader.close();
		} catch (FileNotFoundException e) { // specific exceptions first
			 e.printStackTrace();
			 
		} catch (IOException ie) {
			System.out.println("Generic Exception:" + ie);
		} finally {
			try {
				if(bufferedReader != null) {
					bufferedReader.close();
				}				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bufferedReader = null;
                
		}
		
		/*// Final finally finalize
		
		* *
		ReadAFile readTheFile = new ReadAFile(); // 
		 
		readTheFile.process(); // main is static method. Main can not call instance variable.

		System.out.println("Main complete.");*/
         
	}

	// Call it without creating instance of class..
	public   void process()  {
		System.out.println("process.");
		
		//BufferedReader buf = new BufferedReader(new FileReader("c:\\t\\d6.txt"));
		

	}

}
