package com.stringcoding;

public class ReverseTheStringWithPreservingThePosition {
	
	public static void main(String[] args) {
		
		// I/P=“I Am Not String” 
		// O/P=g ni rtS toNmAI   
		
		String str = "I Am Not String";
		
		char[] charArray = str.toCharArray();
		char[] resultArray = new char[charArray.length];
		
		for(int i = 0; i < charArray.length; i++) {
			if(charArray[i] == ' ') {
				resultArray[i] = ' ';
			}
		}
		
		int j = resultArray.length - 1;
		
		for(int i = 0; i < charArray.length; i++) {
			if(charArray[i] != ' ') {
				if(resultArray[j] == ' ') {
					j--;
				}
				resultArray[j] = charArray[i];
				j--;
			}
		}
		
		System.out.println(str+"----> "+ String.valueOf(resultArray));
	}

}
