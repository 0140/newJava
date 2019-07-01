package sample;

/**
 * http://javascript.crockford.com/javacodeconventions.pdf
 * 
 * @author Bhaskara Sama
 *
 */
public class Practice {
	
	int y;
	int g = 23;
	
   void printtextvoid() {
		
		System.out.println("sd 3");		 
		printtext();
		
		//Operators.i();

	}
	
	String printtext() {
		
		System.out.println("sd printtext");
		return "returned value";

	}
	
	
	double calculate(double t)
	{
		
		double r = Math.sin(t);
		return r;
	}	
	public static void main(String[] args) {
	
		System.out.println("sd");
		
		Practice pr = new Practice();
		pr.printtextvoid();
		
		String s = pr.printtext();
		
		System.out.println(s);
		
		pr.printtext();		
		pr.printtext();
		
		double res = 0;
		
		res = pr.calculate(45.3);
		System.out.println("res=" + res);
		
		Operators.i();
		
		Operators op = new Operators();
		op.calc();

	}

}
