package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithPrefix {

	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(14,19,18,22,55,87,111,65,11,55,128,14,75);
		System.out.println(list);
		List<Integer> collect = list.stream().map(e -> String.valueOf(e))
		             .filter(e -> e.startsWith("1"))
		             .map(Integer::valueOf)
		             .collect(Collectors.toList());
		System.out.println(collect);

	}

}
