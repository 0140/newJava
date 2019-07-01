package practice;

public class AccessTest {
	
	public double d =  45.6;
	boolean result = true;
	
	public void process() {
		d = 78;
		result = false;
	}

	public static void main(String[] args) {
		AccessTest a = new AccessTest();
		a.d = 45;
		 

	}

}
