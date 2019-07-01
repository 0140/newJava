package ExceptionPack.aug08;

public final class UseCustomeException {

	public static void main(String[] args) throws ATTException {
		// TODO Auto-generated method stub
		int bundle = 1;
		
		if (bundle == 1) {
			throw new ATTException("No Phone plans in Internet Bundle");
		}

	}

}
