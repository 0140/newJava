package interfaceEx;

import java.util.Date;

public interface ICreditCard {
	
	public  static final double LIMIT = 23;
	
	public void isCardValid(String credNumber, Date date) throws Exception;
	
	public void chargeTheCard(String credNumber, Date date, double amount);

}
