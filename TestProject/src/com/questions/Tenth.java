package com.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tenth {

	public static void main(String[] args) {

		//10. Given a list of integers, sort all the values present in it descending order using Stream functions?
		
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		               myList.stream()
		                     .sorted(Collections.reverseOrder())
		                     .forEach(System.out::println);
		 
	}

}
