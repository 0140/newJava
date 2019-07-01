package sample;

import java.util.regex.Pattern;

public class RegExExample {
	
	public static void main(String[] args) {
		
		
		boolean b3 = Pattern.matches("[a-z]{2}", "as");  
		System.out.println(b3);

		
	}

}
