package com.centillion.iterfacePkg;

public interface InsurancePolicy {
	public static final double PENALTY = 100.00;
	
	public String getType();
	
	public boolean isValid();
	
	default public void newDefaultMethod() {
        System.out.println("New default method" );
    }

}
