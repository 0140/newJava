package sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SingletonEx {
	
	//private final  static SingletonEx instance_var = new SingletonEx(); // Instance of class
	 //can not change value. So final. ONly one object is needed. So do not change.
	// If you want to change, remove final.
	// Yes. My idea was that. Do not want to create more objects. Make final.
	// WebDriver not final.
	    // declare without final.//Depends on your aim
					// No singleton. In singleton they do not create more objects.
					// That is why, I made it final.
					
	
	static { // initiable static variables if needed.
	 
	}
	
	private SingletonEx() // private constructor //other objects can not instances
	{
		
	}
	
	// write getProperty(String property) method
	
	/*public static WebDriver getInstance()
	{
		// load a property file
		return driver; // Instance is coming from instance var. 
		                     //Static variable is initialized.
		      
		    
	}*/
	
	
	

}
