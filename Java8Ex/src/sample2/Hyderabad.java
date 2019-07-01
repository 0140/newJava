package sample2;

import sample.City;

public class Hyderabad extends City {
	
	public Hyderabad() {
		super();
		
		
	}
	
	
	public int calculateSal() 
	{
		
		return getStaffCount() * 10000;
	}
	
	int getCount(String district)
	{
		return 23;
	}
	
	int getCount(int stateCode){
		return 200;
	}
	
	int getCount(int stateCode, int typeOfCity){
		return 26;
	} // similar functionality
	
	public String getState()
	{
		getStaffCount();
		return "TS";
	}
	
	public static void main(String[] args)
	{
		Hyderabad h = new Hyderabad();
		h.getCount(9);
		String s = h.getState(); // runtime
	}

}
