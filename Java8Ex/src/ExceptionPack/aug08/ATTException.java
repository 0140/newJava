package ExceptionPack.aug08;

public class ATTException extends Exception {
	
	String message = "ATTException";
	Exception e = null;
	
	public ATTException(String message) {
		this.message = message;
	}
	
	public ATTException(String message, Exception e) {
		this.message = message;
		this.e = e;
	} 
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Exception getE() {
		return e;
	}
	public void setE(Exception e) {
		this.e = e;
	}
	
	

}
