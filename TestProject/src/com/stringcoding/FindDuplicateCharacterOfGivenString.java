package com.stringcoding;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacterOfGivenString {

	public static void main(String[] args) {

		String str = "Better Butter";
		str = str.replaceAll("\\s+", "");
		char[] charArray = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<>();
		for(Character c : charArray) {
			
			if(charMap.get(c) == null) {
				charMap.put(c, 1);
			}else {
				charMap.put(c, charMap.get(c) + 1);
			}
		}
		
		System.out.println(charMap);
		
		charMap.entrySet().stream().forEach(System.out::println);
	}

}
