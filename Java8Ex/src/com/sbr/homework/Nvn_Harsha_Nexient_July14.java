package com.sbr.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Nvn_Harsha_Nexient_July14 {

	public static void main(String[] args) {
		/**
		 * Nvn Harsha Nexient July14
		 * 
		 * Automation Testing of Web Apps
		 * 	using Java Selenium
		 * BDD Cucumber
		 * We wroter user stories in agile env
		 * 		Jira for agile and test mgmt
		 * 
		 * SoapUI for api testing soap and restful API
		 * 
		 * Maven Jenkins
		 * 
		 * first agile
		 * 
		 * after kick off meeting, we write manual test cases
		 * dev team writes code.
		 * After dev team is done, e execute test cases
		 * parallel, we also write automation test cases
		 * 
		 * defect management using Jira..
		 * 
		 * Defect priority 
		 * 				and making sure defect fixeing is on time basis
		 * 				manage time consytraints 
		 * 				for multiple projects
		 * 
		 *  Jenkins modules...
		 *  
		 *  Write features, scenarion, scenario outline
		 *  			gather data
		 *  
		 * 30 70 almost
		 * 8 -- 5 dev 3 tet engineers
		 * 
		 * 2 do manual 2 do automation
		 * sr test automation engineer
		 *  
		 *  designed and implemented framework
		 *  I led the effort..
		 *  
		 *  reusability
		 *  simplify maintenance..
		 *  easy to debug
		 *  standard features like logging, reports,		
		 *  			extensibility, ...
		 *  
		 *  test data is maintained in excel sheets
		 *  	we do data driven testing 
		 *  		one sheet in excel for each test case
		 *  		apache POI reads data from sheets
		 *  
		 *  we use TestNG data provider to read data
		 *  	data read using excel is formatted into matrix of data
		 *  	matrix is mapped to test method
		 *  	test method fires as many times as rows in matrix
		 *  
		 *  Configured data
		 *  		.. APache POI code to read data
		 *  
		 *  In built TestNG reports
		 *  Some customization is d
		 *  
		 *  Hit hub.. version control...
		 *  
		 *  daily and nightly builds are there
		 *  after build, we smoke
		 *  	after smoke test passes, we do regression or retest..
		 *  
		 *  	automatic setup..
		 *  	we can trigger manually also
		 *  
		 *  unix servers. Jenkins installed is there.
		 *  job is sceheduled to run automatic...
		 *  
		 *  JUnit is for unit test.
		 *  Done dev team..
		 *  
		 *  Test team uses TestNg...
		 *  	functional, integration, system test...using TestNg..
		 *  
		 *  No...
		 *  we create defects in Jira..Manage defects using Jira...
		 *  
		 *  Excel on sharepoint server
		 *  
		 *  Automation testing using SoapUI
		 *  
		 *  Also I did Java JSON to test restful web services..
		 *  
		 *  In soapUI we create soap project using WSDL
		 *  we create test suite
		 *  create test case
		 *  add stpes
		 *  steps can be call to soap or restful projects..
		 *  
		 *  Pro version JDBC ... looping
		 *  
		 *  Looping no..
		 *  we can implement looping  using Groovy..
		 *  we put jar in soap install directory/ext/bin
		 *  
		 *  Yes..
		 *  We transfer data using property..
		 *  
		 *  can read from property files, from db,
					from custome properties...
					--------------------------
		 *  testRunner is implicit object
		 *  
		 *  testRunner.testCase.testSuite.setPropertyValue("a",valueObject);
		 *  
		 *  both..
		 *  some soap services are there in company...
		 *  		some are restful...
		 *  we had all..
		 *  
		 *  Somec criteria
		 *  
		 *  rest is faster...
		 *  	IF crud operations, use Rest ( add, update..)
		 *  	If speed needded, use Rest // Rest faster
		 *  
		 *  	If security needed, use soap security..
		 *  
		 *  a little..
		 *  
		 *  Not so mcuh..
		 *  I was not involved..Performance testing...
		 *  
		 *  Role in project..
		 *  	Implementation partner..
		 *  
		 *  
		 *  		 
		 * 
		 * 
		 * 
		 */

	}
	
	/**
	 * array of numbers
	 * Write a method to return odd numbers as list from 1 to 100
	 * @return
	 */
	public static List<Integer> process() {
		List<Integer> lt = new ArrayList<Integer>(); // declared list
									//of integers
		
		for (int i=1; i <=100; i++) { // loops 1 to 100
			if(i %2 != 0)  lt.add(i);	// if odd add to list	
		}
		return lt; // return list
		
		// can use java 8 to simplify code
		// 100 timesloop .. pretty fast
		// If not division, I can alternate between adding to list or
		// not adding to list
	}
	
	/**
	 * For given array int[] a = {1, 3, 5, 8, 1, 5, 9, 2, 5,8, 9, 10 }
	 * 
	 * @param arr
	 * @return
	 */
	public static Map<Integer, Integer> processOccurrences(int[] arr) {
		Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
						// Initializing counts map -- number and occurrences
		for (int i=0; i< arr.length; i++) { // looping on arr
			Integer countVal = counts.get(arr[i]); // Is the number key 
									//already -- present?
			if (countVal != null) { // If key present
				Integer val = new Integer(countVal.intValue() +1); // increment
				counts.put(arr[i], val); // put in counts//incremented occurrences				
			} else { // Not present already
				counts.put(arr[i], 1);	// Put one for count			
			}			
		}
		
		return counts;		
		
	}
		 
	
	
	

}
