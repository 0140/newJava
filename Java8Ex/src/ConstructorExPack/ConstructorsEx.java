package ConstructorExPack;

/**
 * http://www.javatpoint.com/constructor
 * 
 * @author Bhaskara Sama
 *
 */
public class ConstructorsEx {
	
	int m;
	
	public ConstructorsEx()
	{
		super();
		System.out.println("ConstructorsEx()");
	}
	
	public ConstructorsEx(int m)
	{	  
		this();
		this.m = m;
		System.out.println("ConstructorsEx(int m)");
	}
	
	public int calculate(int m, int n)
	{
		
		return m+n;
	}
	
	
	
	public static void main(String[] args)
	{
		ConstructorsEx cf = new ConstructorsEx();
		
		ConstructorsEx c = new ConstructorsEx(5);
		c.calculate(5, 6);
	}

}
