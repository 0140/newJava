package exceptionsExamples;

public class CustomExceptionEx {

	public static void main(String[] args) {
		try {
			process();
		} catch (ATTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void process() throws ATTException {
		int n = 23;

		if (n != 23) {
			throw new ATTException("Something wrong.");
		}
	}

}
