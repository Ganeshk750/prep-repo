package com.stringcoding;

public class FindThePercentageOfUpperCaseLowerCaseAndSpecialCharacter {

	public static void main(String[] args) {
      
		String str = "Tiger Runs @ The Speed Of 100 km/hour.";
		
		int totalChars = str.length();
		
		int uppderCase = 0;
		int lowerCase = 0;
		int digits = 0;
		int others = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				uppderCase++;
			}else if(Character.isLowerCase(ch)) {
				lowerCase++;
			}else if(Character.isDigit(ch)) {
				digits++;
			}else {
				others++;
			}
		}
		
		double upperCaseLetterPercentage = (uppderCase * 100) / totalChars;
		double loweCaseLetterPercentage = (lowerCase * 100) / totalChars;
		double digitsPercentage = (digits * 100) / totalChars;
		double otherPercentage = (others * 100) / totalChars;
		
		System.out.println("UpperCase%: "+ upperCaseLetterPercentage);
		System.out.println("LowerCase%: "+ loweCaseLetterPercentage);
		System.out.println("Digits%: "+ digitsPercentage);
		System.out.println("Other%: "+ otherPercentage);
		
	}

}
