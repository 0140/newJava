package com.aug09;

public class MethodsExample {

	private int n = 4;
	
	public void process() {
		int i =8;
		System.out.println("i:" + i);

	}
	
	private double processReturn() {
		double d= 78.2;
		
		return d;		
	}
	
	public String processString() {
		String s= "Multiple";
 		return "Sam";		
	}
	
	double printTan(int n) {
		double result = Math.tan(n);
		return result;		
	}
	
	public double printSum(int m, int n) {
 		return (m+n);		
	}
	
	public static void main(String[] args) {
		MethodsExample m = new MethodsExample();
		double d = m.printSum(2, 3);
		
	}
	
	protected boolean getLocal() {
		return true;
	}
	
}
	



