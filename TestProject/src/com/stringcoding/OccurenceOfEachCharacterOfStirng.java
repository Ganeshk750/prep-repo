package com.stringcoding;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfEachCharacterOfStirng {

	public static void main(String[] args) {

      String str = "Java J2EE Java JSP J2EE";
      str.replaceAll("\\s+", "");
      char[] charArray = str.toCharArray();
      Map<Character, Integer> charMap = new HashMap<>();
      for(Character c : charArray) {
    	  if(charMap.get(c) == null) {
    		  charMap.put(c, 1);
    	  }else {
    		  charMap.put(c, charMap.get(c) + 1);
    	  }
      }
      
      charMap.entrySet().stream().forEach(System.out::println);
      
	}

}
