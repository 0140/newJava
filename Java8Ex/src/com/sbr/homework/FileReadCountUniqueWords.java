package com.sbr.homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadCountUniqueWords  {

	public static void main(String[] args) throws Exception {
		
	 	String wordToVerify = "Bhaskar"; // Name
		
		try {
			BufferedReader buf = new BufferedReader(
							new FileReader("c:\\t\\d1.txt"));
			
			String line = "";
			int count =0;
			
			while(( line =buf.readLine()) != null ) {
				
				System.out.println("line:" + line);
				
				// Count occurrences in each line
				
				String[] words = line.split(" "); // gives array
				
				for(String s: words) {
					
					if(s.equalsIgnoreCase(wordToVerify)) {
						count++;
					}
				}
				
				
			}
			
			//Print the count
			System.out.println("Count:" + count);
		} catch (FileNotFoundException   e  ) {
			// TODO Auto-generated catch block
			System.out.println("The file is not there.");
			e.printStackTrace();
			// send email
		} catch(IOException ie) {
			System.out.println("Generic Exception:" + ie);
		} finally {
			//buf = null;
		}
		
		 
			
		 
	}
	

}
