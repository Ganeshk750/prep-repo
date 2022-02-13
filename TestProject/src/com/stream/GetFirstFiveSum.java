package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetFirstFiveSum {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5,10,7,15,24,24,84,6,8,12,81,84);
		System.out.println();
		
		//Sum of first five
		Integer integer = list.stream().limit(5).reduce((ele,i) -> ele + i).get();
		//System.out.println(integer);
		
		//Sum of after 5 element
		//use of skip
		List<Integer> collect = list.stream().skip(5).collect(Collectors.toList());
		System.out.println(collect);
		Integer integer2 = list.stream().skip(5).reduce((ele, i) -> ele + i).get();
		System.out.println(integer2);
	}

}
