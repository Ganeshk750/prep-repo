package com.stream;

import java.util.Arrays;
import java.util.List;

public class FindAverage {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(intList);
		double asDouble = intList.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println("Average: "+ asDouble);
	}

}
