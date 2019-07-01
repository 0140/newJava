package jan22;

public    class Vehicle { //IsA
	
	final String vinid;   // HasA
	
	Vehicle() {
		 vinid = "sds";
		 //vinid = "h";
	}
	
	public boolean applyBrakes() {
		System.out.println("applyBrakes");
		
		return true;
	}
	
	protected  double getPrice() {
		System.out.println("getPrice");
		return 100;
	}

	
	
	public static void main(String[] args) {



	}

}
