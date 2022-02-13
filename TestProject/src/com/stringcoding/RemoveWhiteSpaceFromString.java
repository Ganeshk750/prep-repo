package com.stringcoding;

public class RemoveWhiteSpaceFromString {

	public static void main(String[] args) {

		 String str = "Java J2EE Java JSP J2EE";
	      str = str.replaceAll("\\s+", "");
	      System.out.println("IST METHOD "+str);

	      
	      char[] charArray = str.toCharArray();
	         
	        String stringWithoutSpaces = "";
	         
	        for (int i = 0; i < charArray.length; i++) 
	        {
	            if ( (charArray[i] != ' ') && (charArray[i] != '\t') )
	            {
	                stringWithoutSpaces += charArray[i];
	            }
	        }
	        System.out.println("SECOND METHOD: "+ stringWithoutSpaces);
	}

}
