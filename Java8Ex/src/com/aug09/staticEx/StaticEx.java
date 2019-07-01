package com.aug09.staticEx;

public class StaticEx {
	public static String builder = "ABC";
	public static String country = "USA";
	private int i = 2 ;
	
	public static double PENALTY  ; // I will save penalties timewise in database table
	
	static {
		System.out.println("??");
		// Database read
		PENALTY = 34;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticEx e = new StaticEx();
		e.process();
		
		StaticEx e2 = new StaticEx();
		e2.i = 4;
		e2.process();
		
		StaticEx.getCountry();
		StaticEx.builder = "";

	}
	
	public void process() {
		System.out.println(i);
		System.out.println(builder);

	}
	
	public static void getCountry() {
		System.out.println(country);
		//System.out.println(i);

 
	}
	
	 

}
