package com.sk.stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
// Output: [1, 2, 3, 4, 5]

 */
public class RemoveDuplicate {
 
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
		
		List<Integer> collect = numbers.stream()
		.distinct()
		.collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
