package com.sbr.homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

public class NotUseHistogramWordCountInFile {

	public static void main(String[] args) {
		/*
		 * Agile 
		 * Jenkins
		 * OES
		 * Maven
		 * Java Selenium 
		 * BD
		 * SoapUI Web services --
		 * SQL -- DB Testing
		 * 
		 * OES related work??
		 * 
		 * Wrote test cases, user stories
		 * In Jeera, we documented user stories
		 * 
		 * Time estimates
		 * Agile methodology
		 * Exceuted test cases
		 * Test results-- reports
		 * 
		 * ------------
		 * 
		 * DB setup
		 * data validation
		 * data inetgrity checking
		 * 
		 * ..
		 * 
		 * oracle
		 * 
		 * patient insurance
		 * select 
		 * from 
		 *   (select id, max(count(amount) from insurance)
		 * 
		 * ---------------------
		 * 
		 * configured some security policies -- deployment of policies
		 * verify whether security policy 
		 * 	applied to resources or not
		 * 
		 * Agile
		 * 
		 * sprints 2 weeks
		 * 10 
		 * 
		 * Jeera
		 * 
		 * offsore?
		 * remote-- standup meeting
		 * cts
		 * 
		 * 
		 * my role
		 * 
		 * I am ineterested in manual and OES
		 * In fututre, when automation needed, I would do
		 */
		 process();
	}
	
	public static void process()
	{
		File f  = new File("c:/tmp/sample.txt ");
		HashMap<String, Integer> wordCounts = null;
		// || word.endsWith(","
		try {
			FileReader fr = new FileReader(f);
			BufferedReader bf = new BufferedReader(fr);
			  
				wordCounts = new HashMap<String, Integer>();
				
				String line = "";
				while ( ( line = bf.readLine()) != null)
				{
					System.out.println(line);
					String[] wordsArr = line.split(" ");
					
					for( String word: wordsArr)
					{
						if (word.endsWith(".") )
						{
							word = word.substring(0, word.indexOf("."));
						}
						
						Integer countInteger =  wordCounts.get(word);
						
						if (countInteger != null )
						{
							countInteger = countInteger.intValue() +  1;
							wordCounts.put(word, countInteger);
						} else
						{
							wordCounts.put(word, 1);
						}						
					}								
				}		
				
				
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Set<String> keys = wordCounts.keySet();
		for (String key: keys)
		{
			System.out.println("key:" + key + ":" + wordCounts.get(key));
		}
		
		 
		
		 
	}

}