package com.questions;

import java.util.Arrays;
import java.util.List;

public class Nineth {

	public static void main(String[] args) {

		//9. Given a list of integers, sort all the values present in it using Strema functions?
		
		  List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		                myList.stream()
		                      .sorted()
		                      .forEach(System.out::println);
	}

}
