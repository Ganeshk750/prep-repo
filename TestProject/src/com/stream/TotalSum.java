package com.stream;

import java.util.Arrays;
import java.util.List;

public class TotalSum {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(intList);
		int sum = intList.stream().mapToInt(e -> e).sum();
		System.out.println("TOTAL: "+ sum);
	}

}
