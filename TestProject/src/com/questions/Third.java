package com.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Third {

	public static void main(String[] args) {

		//3. How to find duplicate elements in a given integers list in java using
		// Stream function?
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Set<Integer> set = new HashSet<>();
		myList.stream()
		      .filter(n -> !set.add(n))
		      .forEach(System.out::println);
		
		List<String> list = Arrays.asList("Java", "J2EE", "Hibernate", "Spring", "Spring", "Java");
		Set<String> str = new HashSet<>();
		list.stream().filter(n -> !str.add(n)).forEach(System.out::println);
		
	}

}
