package com.streamquestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

public class MapUpdateTest {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("Effective Java", "Kathy Sierra");
		map.put("Spring in Action", "Craig Walls");
		map.put("Hibrnate in Action", "Gavin King");
		map.put("Pro Angular", "Freeman");
		map.put("Pro Spring Boot", "Felip Gutierrez");
		
		
		//Only modify if key already exists in the map
		map.computeIfPresent("Effective Java", (key, value) -> "Joshua Bloch");
		
		//Only modify if key dosen't exist in the map
		map.computeIfAbsent("Core Java", (value) -> "Kathy Sierra");
		
		
		//iterate and print the values
		map.entrySet().iterator().forEachRemaining(System.out::println);
		
		System.out.println("-------------KEYS------------");
		//How to print key in map
		map.keySet().iterator().forEachRemaining(System.out::println);
		
		System.out.println("------------VALUES------------");
		//How to print values in map
		map.values().iterator().forEachRemaining(System.out::println);
		
		System.out.println("----------------------------");
		// Using Collection.stream() and Stream.forEach()
		map.values().stream().forEach(System.out::println);
		
		System.out.println("------------------------------");
		// Using Stream.of() and Collection.toString() and Stream.forEach()
		Stream.of(map.keySet().toArray())
		        .forEach(System.out::println);
		
		System.out.println("------------------------------");
		Stream.of(map.values().toArray()).forEach(System.out::println);
		
		
	
	
		
		
	}
	

}
