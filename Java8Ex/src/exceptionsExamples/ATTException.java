package exceptionsExamples;

public class ATTException extends Exception { 
	// yes we can 
	//this is an example of custom exception
	
	String msg = "FriendlyException";
	Exception e = null;
	
	public ATTException(String msg)
	{
		this.msg = msg;
	}
	
	public ATTException(Exception e)
	{
		this.e = e;
	}
	
	@Override
	public String toString() {
		return "Message:" + msg;
	}

}
