package com.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ShortingNumber {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,0,2,10,30,19,3);
		System.out.println(list);
		
		//Ascending
		List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);
		
		//Descending 
		List<Integer> collect2 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect2);
	}

}
