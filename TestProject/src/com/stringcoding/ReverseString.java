package com.stringcoding;

public class ReverseString {

	public static void main(String[] args) {

		String str = "MyString";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println("IST WAY: "+ sb);
		
		char[] charArray = str.toCharArray();
		
		for(int i = charArray.length - 1; i > 0; i--) {
			
			 System.out.print("SECOND WAYL "+str.charAt(i));
		}
		
		//System.out.println("RECURSIV METHOD: "+ recursiveMethod("MyString"));
		
	}
	
//	static String recursiveMethod(String str) {
//		if((null == str) || (str.length() <= 1)) {
//			return str;
//		}
//		
//		return recursiveMethod(str.substring(1) + str.charAt(0));
//	}

}
