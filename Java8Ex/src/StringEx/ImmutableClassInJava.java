package StringEx;

import java.util.ArrayList;
import java.util.List;

/*
 * Immutable means unmodifiable or unchangeable.
String is immutable and final in Java.
Every modification in String creates a new String object.
 For example, when we get the substring, we get a new String, 
 when we convert uppercase String to lowercase, a new String is created. 

 
Once string object is created 
its data or state or content can't be changed 
but a new string object is created if we try to change string..
String objects are shared from a String pool. Reusable String objects. 
So string made immutable. 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Immutable means not changing
 * A class can not change its state once created.
 * 
 * String is example
 * String if created we can not change value
 * 
 * In Java, all the wrapper classes (like String, Boolean, Byte, Short)
 *  and String class are immutable
 * 
 * http://howtodoinjava.com/core-java/related-concepts/how-to-make-a-java-class-immutable/
 */
public final class ImmutableClassInJava {
	private final String name = "Ram"; // No setters
	private List addresses = new ArrayList(); // No get, noset for this
					// if you give getter, they can modify list
	
	private ImmutableClassInJava()
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String getName()
	{
		return name; 
	}

}
