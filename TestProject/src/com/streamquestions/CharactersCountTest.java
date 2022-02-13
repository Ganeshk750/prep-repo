package com.streamquestions;

import java.util.Set;
import java.util.TreeSet;

public class CharactersCountTest {

	public static void main(String[] args) {

        String someString = "JAVA PROGRAMMER";
        char[] strArray = someString.toCharArray();
        
        //getting distinct characters in strArray
        Set<Character> set = new TreeSet<>();
        for (char c : strArray){
          set.add(c);
        }
        //set.forEach(System.out::println);

        for (char c : set) {
           // Using Streams & Lambda Expressions in Java 8
           long count = someString.chars().filter(ch -> ch == c).count();
           System.out.println("Occurances of Character '" +c+ "' : " +count);
        }
	}

}
