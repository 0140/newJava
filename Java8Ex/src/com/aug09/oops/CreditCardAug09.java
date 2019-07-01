package com.aug09.oops;

import java.util.Date;

public interface CreditCardAug09 {
	public static final int LIMIT = 10000;
	
 	public boolean validate(String credCrdNumber, Date expiryDate);
	public String validate(String credCrdNumber, Date expiryDate, String addtlNumber);
	public boolean validate(long credCrdNumber, Date expiryDate, String addtlNumber);
	// Readability, Easy to understand

	public String getType(); // Enum

}
