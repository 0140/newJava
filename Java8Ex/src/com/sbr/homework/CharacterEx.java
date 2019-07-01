package com.sbr.homework;

public class CharacterEx {
	
	public static void main(String[] args) {
		
	Character c = '!';
	if(Character.isAlphabetic(c) || Character.isDigit(c)) {
		System.out.println("is alpha numeric");
		
	} else {
		System.out.println("Not alpha numeric");
	}
	}

}
