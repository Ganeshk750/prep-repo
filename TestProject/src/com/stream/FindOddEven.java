package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOddEven {
	
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(intList);
		List<Integer> collect = intList.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		System.out.println(collect);
		List<Integer> collect1 = intList.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());
		System.out.println(collect1);
		
	}

}
