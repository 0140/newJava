package interfaceEx;

import java.util.Date;

public class VisaImpl implements ICreditCard{

	@Override
	public void isCardValid(String credNumber, Date date) throws Exception {
		System.out.println("Card Valid Via");
		
	}

	@Override
	public void chargeTheCard(String credNumber, Date date, double amount) {
		System.out.println("Card Valid Visa");
		
	}

}
