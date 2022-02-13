package com.streamquestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetExample {

	public static void main(String[] args) {

		// 1. Using Anonymous Class
		Set<String> set = new HashSet<String>() {
			{
				add("California");
				add("Chicago");
				add("New York");
			}
		};
		
		// 2. Using instance of another Collection
		
		Set<String> sets = new HashSet<>(Arrays.asList("California", "Chicago", "New York"));
		
		// 3. Using Stream of java 8
		
		Set<String> sets1 = Stream.of("California", "Chicago", "New York")
				         .collect(Collectors.toCollection(HashSet::new));
		
		// 4. Using Factory Method of Java 9
		Set<String> set1 = Set.of("California", "Chicago", "New York");
	}

}
