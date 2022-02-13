package com.stringcoding;

import java.util.Arrays;

public class AnagramStirngTest {

	public static void main(String[] args) {

		//Two strings are called anagrams if they contain same set of characters 
		//but in different order.
		
		// “Dormitory – Dirty Room”, “keep – peek”,  “School Master – The Classroom”
		String s1 = "School MASTER" ;
		String s2 = "The ClassROOM";
		
		//1. Using Sort and equal Method
		String copy1 = s1.replaceAll("\\s+", "");
		String copy2 = s2.replaceAll("\\s+", "");
		
		boolean status = true;
		if(copy1.length() != copy2.length()) {
			status = false;
		}else {
			//converting  string to array
			char[] charArray = copy1.toLowerCase().toCharArray();
			char[] charArray2 = copy2.toLowerCase().toCharArray();
			
			//Sorting both array
			
			Arrays.sort(charArray);
			Arrays.sort(charArray2);
			
			status = Arrays.equals(charArray,charArray2);
		}
		
		if(status) {
			System.out.println("Anagrams");
		}else {
			System.out.println("Not Angrams");
		}
		
		
		//2. Using Iterative Method
		boolean result = true;
		if(copy1.length() != copy2.length()) {
			result = false;
		}else {
			char[] charArray1 = copy1.toCharArray();
			for(char c: charArray1) {
				int index = copy2.indexOf(c);
				if(index != -1) {
					copy2 = copy2.substring(0, index) + copy2.substring(index + 1, copy2.length());
				}else {
					result = false;
					break;
				}
			}
		}
		if(status) {
			System.out.println("Anagrams");
		}else {
			System.out.println("No Anagrams");
		}
		
		//Using String builder
		
		boolean res = true;
		if(copy1.length() != copy2.length()) {
			res = false;
		}else {
			char[] charArrays = copy1.toCharArray();
			//Constructing StringBuilder from copy2
			StringBuilder sb = new StringBuilder(copy2);
			for(char cc: charArrays) {
				int index = sb.indexOf(""+cc);
				if(index != -1) {
					//If present, removing that character from sb
					sb = sb.deleteCharAt(index);
				}else {
					//If not present, setting status as false and breaking the loop
					res = false;
					break;
				}
			}
			
		}
		if(res) {
			System.out.println("anagrams");
		}else {
			System.out.println("Not Anagrams");
		}
		
		
	}

}
