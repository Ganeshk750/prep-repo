package com.stringcoding;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FindFirstRepeatedAndNonRepeatedCharacterOfStirng {

	public static void main(String[] args) {

		String str = "JavaConceptOfTheDay";
		//output : nonrepeated: J and FirstRepeated: a
		
		char[] charArray = str.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for(Character c : charArray) {
			if(map.get(c) == null) {
				map.put(c, 1);
			}else {
				map.put(c, map.get(c) + 1);
			}
		}
		
		Entry<Character, Integer> entry2 = map.entrySet().stream().filter(ele -> ele.getValue() == 1).findFirst().get();
		System.out.println("First Non Repeating Character: "+ entry2.getKey());
		
		
		Entry<Character, Integer> entry = map.entrySet().stream().filter(ele -> ele.getValue() > 1)
		.findFirst().get();
		System.out.println("First Repeated Character: "+ entry.getKey());
	}

}
