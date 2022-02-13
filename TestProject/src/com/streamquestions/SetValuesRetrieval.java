package com.streamquestions;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class SetValuesRetrieval {

	public static void main(String[] args) {

		// 1. Creating a Set
		Set<String> set = new HashSet<>();
		set.add("California");
		set.add("Chicago");
		set.add("New York");
		
		// Retrieving Values of the set
		Stream<String> stream = set.stream();
		stream.forEach( e -> System.out.println(e));
		
		System.out.println("-------------------");
		
		// 2. Creating a set
		Set<String> set1 = Set.of("California", "Chicago", "New York");
		
		// Retrieving values of the set
		set1.stream().forEach(System.out::println);
	}

}
