package com.aug09;

import java.io.File;
import java.io.FileInputStream;
 
public class FirstBasic {
	double d= 3; //data attributes
	long f = 1; // Each instance has its own values

	public static void main(String[] args) {
		// This is a practice class. 

		System.out.println("From main");
		
		int i = 67;
		i = 45;
		
		FirstBasic first = new FirstBasic(); // reference variables
		// Prinitive nd reference variables
		first.d = 4;
		first.d++;
		first.x2();
		
		// Learn how to use eclipse when writning code --  call a method, importing..
		//first.x();
		first = new FirstBasic();
		first.x2();
		
		File f = null;
		
	 
		
		first = new FirstBasic();
		
	}
	
	public void x() { //Methods // Behaviour
		int g = 8;
		g++;
		System.out.println("g:" + g);

	} 
	
	public void x2() { //Methods // Behaviour
		int g = 8;
		g++;
		System.out.println("g:" + g);
		System.out.println("d:" + d);


	} 

}

