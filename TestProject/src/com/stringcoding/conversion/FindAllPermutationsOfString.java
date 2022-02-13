package com.stringcoding.conversion;

public class FindAllPermutationsOfString {

	public static void main(String[] args) {
      
		// ip: jsp 3 * 2 = 6
		// op: JSP JPS SJP SPJ PJS PSJ
		String str = "JSP";
		
		stringPermitutation(str);
		
		
	}
	
	static void stringPermitutation(String input) {
		stringPermitutation("", input);
	}
	
	static void stringPermitutation(String string, String input) {
		if(input.length() == 0) {
			System.out.println(string);
		}else {
			for(int i = 0; i < input.length(); i++) {
				stringPermitutation(string+input.charAt(i), input.substring(0,i)+input.substring(i+1, input.length()));
			}
		}
	}

}
