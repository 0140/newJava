package interfaceEx;

import java.util.Date;

public class InterfaceClient {

	public static void main(String[] args) {
		//ICreditCard credCard = new ICreditCard();
		
		ICreditCard credCard = new AmexImpl();
		//ICreditCard credCard2222 = new VisaImpl();
		 credCard = new VisaImpl();

		try {
			credCard.isCardValid("57854", new Date());
			credCard.chargeTheCard("544554", new Date(), 234);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
