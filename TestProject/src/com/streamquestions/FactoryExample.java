package com.streamquestions;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryExample {
	
	public static void main(String[] args) {
		
		List<String> list = List.of("USA", "Canada", "Russia");
		Set<String> set = Set.of("USA", "Canada", "Russia");
		Map<String, String> map = Map.of("USA", "Washington D.C", "Canada",  "Ottawa", "Russia", "Moscow");
		System.out.println(map);
	
	
		List<String> list1 = List.<String>of("USA", "Canada", "Russia"); 
		Set<String> set1 = Set.<String>of("USA", "Canada", "Russia"); 
		Map<String, String> map1 = Map.<String, String>of("USA", "Washington, D.C.", "Canada", "Ottawa", "Russia", "Moscow");
	}

}
