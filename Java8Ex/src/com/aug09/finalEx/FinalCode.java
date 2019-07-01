package com.aug09.finalEx;

public   class FinalCode {
	
	public static final double PI = 22/7; // Constants in Java
	
	public static final int workingDays  ;
	
	static {
		workingDays = 5;
	}
	
	public FinalCode() {
		
	}
	
	public   double getTheInterestRate() {
		return 6;
	}
 
	public static void main(String[] args) {
		FinalCode f = new FinalCode();
		 //f.PI = 34;

	}

}
