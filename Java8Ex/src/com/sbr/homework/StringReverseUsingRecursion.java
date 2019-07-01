package com.sbr.homework;

public class StringReverseUsingRecursion {
	public static void main(String[] args) {
		 
		  String str = "Geeks for Geeks"; 
		  StringReverseUsingRecursion obj = new StringReverseUsingRecursion(); 
	        obj.reverse(str); 
	}
	
    void reverse(String str) 
    { 
        if ((str==null)||(str.length() <= 1)) 
           System.out.println(str); //If one character, return it.
        else
        { 
            System.out.print(str.charAt(str.length()-1));// Printing last character from right.
            reverse(str.substring(0,str.length()-1)); //Recursive call.
            // Passing rest of string without last character
        } 
    } 
       
	
	
	

}
