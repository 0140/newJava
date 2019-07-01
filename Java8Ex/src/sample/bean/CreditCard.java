package sample.bean;

import java.util.Date;

public class CreditCard {

	// Data members
	private String ccNum;
	private Date expDate;
	private int cvvNum;

	// Functional methods
	public String getCcNum() {
		return ccNum;
	}

	public void setCcNum(String ccNum) {
		this.ccNum = ccNum;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public int getCvvNum() {
		return cvvNum;
	}

	public void setCvvNum(int cvvNum) {
		this.cvvNum = cvvNum;
	}

	public void setAddress(Address a) {

	}

	public void setAddress(String addressLine1, String addressLine2,
			String city, String zip) {

	}

	public void setAddress(StringBuffer addressLine1, String addressLine2,
			String city, String zip) {

	}

	public InsuranceCoverage getInsuranceCoverage() {
		 
		return new InsuranceCoverage();
	}
	

	/*
	 * Overriding
	 * 
	 * CreditCard class --> public InsuranceCoverage getInsuranceCoverage(Date
	 * today)
	 * 
	 * Amex extends CreditCard public InsuranceCoverage
	 * getInsuranceCoverage(Date today)
	 * 
	 * CreditCard cc = new AMex(); cc.getInsuranceCoverage(new Date());
	 * 
	 * cc = new CreditCard(); cc.getInsuranceCoverage(new Date());
	 */

}
