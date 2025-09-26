package com.sk.stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
 Output: [2, 4, 6]

 */
public class EvenNumber {
 
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
	     List<Integer> collect = numbers.stream()
	     .filter(n->n%2==0)
	     .collect(Collectors.toList());
		
	     collect.forEach(System.out::println);
	}
}
