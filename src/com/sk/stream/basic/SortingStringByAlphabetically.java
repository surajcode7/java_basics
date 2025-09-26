package com.sk.stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 List<String> fruits = Arrays.asList("banana", "apple", "mango", "grapes");
// Output: [apple, banana, grapes, mango]

 */
public class SortingStringByAlphabetically {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("banana", "apple", "mango", "grapes");
		
		//by alphabetically order
		List<String> collect = fruits.stream()
		.sorted()
		.collect(Collectors.toList());
		
		System.out.println(collect);
		
		
		//by length
		List<String> collect2 = fruits.stream()
		.sorted((l1,l2)->Integer.compare(l1.length(), l2.length()))
		.collect(Collectors.toList());
		
		System.out.println(collect2);
	}
	
	
}
