package sample;

public abstract class AbstractEx {
	
	int d;
	boolean b;
	
	AbstractEx() {
		d = 45;
		b = false;
		System.out.println("abstract constructor");

	}
	
	AbstractEx(int d, boolean b) {
		this.d = 45;
		this.b = b;
		System.out.println("abstract constructor parameters");

	}
 	
	public abstract void process();
	
	public int square(int n) {
		return n*n;
	}
	
	public static void main(String[] args)
	{
		System.out.println("From Abstract"  );
		//AbstractEx ex= new AbstractEx();
		
		//AbstractEx c = new AbstractEx();
		AbstractEx x = new ConcreteImple();
		x.process();
	}

}
