package com.stringcoding;

public class CountTheNumberOfWords {
	
	public static void main(String[] args) {
		
		// find the number of words i.e = 6
		String str = "Super Man Bat Man Spider Man";
		String [] word = str.split(" ");
		int count = 0;
		for(int i = 0; i < word.length; i++) {
			count ++;
		}
	
		System.out.println("Number Of Words: "+ count);
		
		//second Method
		int length = str.trim().split(" ").length;
		System.out.println("Number Of Words:- "+ length);
	}

}
