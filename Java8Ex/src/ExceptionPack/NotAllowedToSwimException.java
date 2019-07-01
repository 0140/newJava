package ExceptionPack;

/**
 * This is an excption class. Thrown when a member is too young to swim. * 
 * 
 * @author bhaskar
 *
 */
public class NotAllowedToSwimException extends Exception {
	String err ;
	Exception e;

	/**
	 * 
	 */
	public NotAllowedToSwimException() {
		err = "Your age doesn't permit to Swim, age must be above 10 or below 50";
	}

	public NotAllowedToSwimException(String err) {
		this.err = err;
	}
	
	public NotAllowedToSwimException(Exception e) {
		this.e = e;
	}

	public String toString() {
		return err;
	}
}
