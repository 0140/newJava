package com.centillion;

public class MethodsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsEx m = new MethodsEx();
		m.process();
		
		int a = m.calculate();
		double h = m.mathTangent(23);
		System.out.println(h);

		h = m.sum(12,  13);
		System.out.println("h:" + h);
		
		First f = new First();
		System.out.println(f.subtract(10, 3));
		
		Car c= new Car();
		c.setName("John");
		c.setWeight(1000);
		c.setVinNumber("JHDJHDBJH");
		c.setSpecialEdition(true);
	}
	
	public void process() {
		System.out.println("process");
	}
	
	public int calculate() {
		int x= 8;
		return x;		
	}
	
	public double mathTangent(double x) {
		double d = 0;
		d = Math.tan(x);
		return d;
	}
	
	public double sum(double d1, double d2) {
		
		return (d1+d2);
		
	}

}
