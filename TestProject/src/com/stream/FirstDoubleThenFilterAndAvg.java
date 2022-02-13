package com.stream;

import java.util.Arrays;
import java.util.List;

public class FirstDoubleThenFilterAndAvg {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(intList);
		double asDouble = intList.stream().map(e -> e * e)
		                .filter(e -> e < 100)
		                .mapToInt(e -> e)
		                .average()
		                .getAsDouble();
		double result = Math.ceil(asDouble);
		System.out.println(asDouble);
		System.out.println(result);
	}

}
