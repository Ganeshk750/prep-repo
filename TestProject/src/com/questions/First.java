package com.questions;

import java.util.Arrays;
import java.util.List;

public class First {

	public static void main(String[] args) {

		//1. Given a list of integers,find out all the even numbers exist in the list
		// using Stream function.
		
		List<Integer> myList = Arrays.asList(10,15,8,49, 25,98, 32);
		        myList.stream()
		              .filter(num -> num % 2 == 0)
		              .forEach(System.out::println);
		             
		
	}

}
