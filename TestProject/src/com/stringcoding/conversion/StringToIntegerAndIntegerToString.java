package com.stringcoding.conversion;

public class StringToIntegerAndIntegerToString {

	public static void main(String[] args) {

		String str = "2016";
		System.out.println("String Value: "+ str);
		int parseInt = Integer.parseInt(str);
		int i = Integer.valueOf(str);
		System.out.println(parseInt);
		
		// Now Back To Initial
		String string = Integer.toString(parseInt);
		
		System.out.println("Back To Initial: "+ string);
	}

}
