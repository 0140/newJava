package practice;

public class Client {

	public static void main(String[] args) {
		AccessTest a = new AccessTest();
		a.d = 45;
		a.result = false;
		
		Vehicle v = new  Vehicle();
		v.getEngineType(); //protected
		 v.setManufacturer(""); // default
	}

}
