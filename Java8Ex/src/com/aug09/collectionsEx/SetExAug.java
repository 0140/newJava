package com.aug09.collectionsEx;

import java.util.HashSet;

import sample.Car;

public class SetExAug {
	public static void main(String[] args) {

		HashSet hm = new HashSet(); // Non Generic Version

		hm.add("One");
		hm.add(new Car());

		/*for (Object o : hm) {
			String s = (String) o; // Downcast . TypeCast
		}*/
		
		HashSet<String> hashEx = new HashSet<String>();
		hashEx.add("One");
		hashEx.add("Two");

		for(String s: hashEx) {
			String s3 = s;
			System.out.println(s3);
		}
		
		
		

	}

}
