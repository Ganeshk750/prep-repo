package com.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		//List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//System.out.println(list);
		
	   
		
		//System.out.println(test());
	}

	     
	    public static int test() {
	    	int a [] = {1,3,6,4,1,2};
			//int a [] = {1,2,3};
		     //int a [] = {-1,-3};
		List<int[]> list = Arrays.asList(a);
		//System.out.println(list);
		  Integer integer = Arrays.stream(a).boxed().sorted(Collections.reverseOrder()).distinct().findFirst().get();
		 
		
		  if(a.length % 2 == 0 ) {
			 for(int i = 0 ; i < a.length; i++) {
				 if(a[i] < 0) {
					return 1;
				 }
			 }
			 return integer - 1;
		  }else {
			  return integer + 1;
		  }
        
		
	}

}
