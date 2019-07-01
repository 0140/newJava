package interfaceEx;

import java.util.Date;

public class AmexImpl implements ICreditCard, ISample {

	@Override
	public void isCardValid(String credNumber, Date date) throws Exception {
		System.out.println("Card Valid Amex");
		
	}

	@Override
	public void chargeTheCard(String credNumber, Date date, double amount) {
		System.out.println("Charged Amex");

		
	}

}
