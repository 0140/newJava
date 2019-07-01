package sample;

public class TestClass  {
	
	public static void main(String[] args)
	{
		TestClass t = new TestClass();
		t.process();
		System.out.println("In Main");

		
		
		City c = new City();
		c.getYear();
	}
	
	void process() {
		System.out.println("process");

	}

}
