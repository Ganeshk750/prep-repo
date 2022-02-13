package com.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateNumber {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,3,40,20,15,1,13,1,2,2,10,30,19,3);
		System.out.println(list);
		Set<Integer> collect = list.stream().filter(e -> Collections.frequency(list, e) >1).collect(Collectors.toSet());
		System.out.println(collect); //[1, 2, 3]
		
		
		//Using set
		Set<Integer> dubNum = new HashSet<Integer>();
		Set<Integer> collect2 = list.stream().filter(e -> !dubNum.add(e)).collect(Collectors.toSet());
		System.out.println(collect2); ////[1, 2, 3]
	}

}
