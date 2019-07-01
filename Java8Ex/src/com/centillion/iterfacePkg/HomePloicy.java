package com.centillion.iterfacePkg;

public  class HomePloicy implements InsurancePolicy{

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void main(String[] args) {
		
		HomePloicy pol = new HomePloicy();
		
		InsurancePolicy ins = new HomePloicy();
		InsurancePolicy insw = new CarPloicy(); // Loose coupling
		
		insw.getType();

		
	}

	 
 

}
