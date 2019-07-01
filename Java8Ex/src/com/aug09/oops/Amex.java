package com.aug09.oops;

import java.util.Date;

import com.centillion.Vehicle;
import com.centillion.iterfacePkg.InsurancePolicy;

import sample.Animal;

public class Amex   implements CreditCardAug09  {

	@Override
	public boolean validate(String credCrdNumber, Date expiryDate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String validate(String credCrdNumber, Date expiryDate, String addtlNumber) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public boolean validate(long credCrdNumber, Date expiryDate, String addtlNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

}
