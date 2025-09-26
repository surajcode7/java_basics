package com.sk.stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 List<String> words = Arrays.asList("apple", "banana", "cherry");
// Output: ["APPLE", "BANANA", "CHERRY"]

 */
public class StringUpper {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		
		List<String> list = words.stream()
		.map(fruit->fruit.toUpperCase())
		.collect(Collectors.toList());
		
		list.forEach(System.out::println);
		/*
		 List<String> list = words.stream()
		.map(String::toUpperCase).collect(Collectors.toList());
		
		list.forEach(System.out::println);
		 */
		
	}
}
