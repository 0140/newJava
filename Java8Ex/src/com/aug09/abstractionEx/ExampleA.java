package com.aug09.abstractionEx;

import sample.Car;

public abstract class ExampleA {

	int x;
	Car car;
	
	public ExampleA() {
		x = 34;
	}
	
	public void sum(int i, int m) { // concrete method
		int z = i + m;
	}
	
	 public  abstract void sum123(int i, int m)  ; // abstract method
	
	
	
	 public static void main(String[] args) {
		 //ExampleA ex = new ExampleA();
		 SubOne sub1 = new SubOne();

	} 

}
