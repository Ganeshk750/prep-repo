package com.questions;

import java.util.Arrays;
import java.util.List;

public class Fifth {

	public static void main(String[] args) {
      
		//5. Given a list of integers, find the total number of elements present in the
		// list using Stream functions?
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		long count = myList.stream().count();
		System.out.println(count);
		
	}

}
