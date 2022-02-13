package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxAndMinNumber {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3);
		System.out.println(list);
		
		//Max Number
		Integer integer = list.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(integer);
		
		//Min Number
		Integer integer2 = list.stream().sorted(Comparator.naturalOrder()).findFirst().get();
		System.out.println(integer2);
		
		Integer integer3 = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("MAX: "+ integer3);
		
		Integer integer4 = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("MIN: "+ integer4);
	}

}
