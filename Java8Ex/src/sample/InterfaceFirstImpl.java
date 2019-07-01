package sample;

/**
 * Example: Vehicle.java
 *          GMCar.java
 *          FordCar.java
 *          
 * @author Bhaskara Sama
 *
 */
public   class InterfaceFirstImpl
			implements InterfaceExample, InterfaceSecond {

	
	

	@Override
	public boolean amIEligible(int age) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	public static void main(String[] args)
	{
		InterfaceFirstImpl ex = new InterfaceFirstImpl();
		
		InterfaceExample exInterface = new InterfaceFirstImpl(); // any class that implements interface
		
		exInterface.process();
		
		if (exInterface instanceof InterfaceExample)
		{
			
			System.out.println("true");
		}
		
		//cd = Visa();
	}

	@Override
	public String whatDayToday() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void process() {
		// TODO Auto-generated method stub
		/*cd = Amex();
        .getClass().getName()
        cd = MasterCars();*/
	}

	
	

}
