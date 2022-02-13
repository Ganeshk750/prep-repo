package com.stringcoding;

public class ToCharacterCountOfGivenString {

	public static void main(String[] args) {

		String s = "Java is java again java again";
		 String string = s.split(" ").toString();
		 char[] charArray = string.toCharArray();
		 System.out.println("Total Number Of Character are: "+ charArray.length);
		 
		 // find the given character occurances 
		 char c = 'a';
		 int count = s.length() - s.replace("a", "").length();
		 
		 
		 System.out.println("Number of occurences of 'a' "+ count);
		
		 
		
	}

}
