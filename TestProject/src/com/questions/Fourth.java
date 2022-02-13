package com.questions;

import java.util.Arrays;
import java.util.List;

public class Fourth {

	public static void main(String[] args) {

		//4. Given the list of integers, find the first element of the list
		// using Stream function?
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		myList.stream()
		      .findFirst()
		      .ifPresent(System.out::println);
		
	}

}
