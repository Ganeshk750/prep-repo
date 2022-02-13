package com.stringcoding;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {
	
	public static void main(String[] args) {
		//Find the repeated word and there occurence
		String str = "Super Man Bat Man Spider Man";
        String[] split = str.split(" ");
        Map<String, Integer> wordMap = new HashMap();
        for(String word: split) {
        	if(wordMap.get(word) == null) {
        		wordMap.put(word, 1);
        	}else {
        		wordMap.put(word, wordMap.get(word) + 1);
        	}
        }
        
        wordMap.entrySet().stream().filter(ele -> ele.getValue() > 1).forEach(System.out::println);
        
        
		
	}

}
