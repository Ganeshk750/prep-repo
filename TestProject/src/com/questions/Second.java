package com.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Second {

	public static void main(String[] args) {

		//2. Given a list of integers, find out all the numbers starting with 1 using 
		// Stream function?
		
		List<Integer> myList = Arrays.asList(10,15,8, 49, 25,98, 32);
		myList.stream()
		      .map(s -> s + "") // Convert integer to string
		      .filter(s -> s.startsWith("1"))
		      .forEach(System.out::println);
	
		
		List<Integer> asList = Arrays.asList(1,2,3,55,66,52,65,15,58);
		asList.stream().map(s -> s + "").filter(s -> s.startsWith("5")).forEach(System.out::println);
		
	  
		
	}

}
