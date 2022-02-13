package com.stringcoding.conversion;

public class ProveStringClassAreImmutable {
	
	public static void main(String[] args) {
		
		String s1 = "JAVA";
		String s2 = "JAVA";
		System.out.println(s1 == s2); // Output:- true
		
		s1 = s1 + "J2EE";
		System.out.println(s1 == s2); // Output:- false
		
		// Are String objects created using new operator also
		// Immutable ?  Yes
		
		String s3 = new String("Ganesh");
		System.out.println(s3); // Ganesh
		s3.concat("Kumar"); // here conternt is Ganeshkumar but these content will not have reference
		System.out.println(s3); //Ganesh
		
		/*
		 * Immutability is the fundamental property of string objects.
		 * In whatever way you create the string objects, either using
		 * String literals or using new operator, they are immutable.
		 * 
		 * 
		 * */
		
	}

}
