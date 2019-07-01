package com.aug09;

public class Provider {
	
	private String registration = "";
	private boolean institutional = false;

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public boolean isInstitutional() {
		return institutional;
	}

	public void setInstitutional(boolean institutional) {
		this.institutional = institutional;
	}
	
	protected boolean isAlaska() {
		return true;
	}
	
	

}
