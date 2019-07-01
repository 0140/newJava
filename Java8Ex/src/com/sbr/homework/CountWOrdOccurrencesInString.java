package com.sbr.homework;

public class CountWOrdOccurrencesInString {
	
	public static void main(String[] args) {
		CountWOrdOccurrencesInString c = new CountWOrdOccurrencesInString();
		int res = c.count("I like the weather today. Today's weather prediction is broadcasted.", "weather");
		System.out.println(res);
	}
	
	public int count(String sentence, String input) {
		int n =0;
		
		String[] arr = sentence.split(" ");
		
		for(int i =0; i< arr.length; i++) {
			if (arr[i].equals(input)) n++;
		}
		
		return n;
	}

}
