package com.sk.stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareElements {
/*
 List<Integer> numbers = Arrays.asList(2, 3, 4);
// Output: [4, 9, 16]

 */
	public static void main(String[] args) {
		
		 List<Integer> numbers = Arrays.asList(2, 3, 4);
		 
		 List<Integer> list = numbers.stream()
		 .map(num->num*num)
		 .collect(Collectors.toList());
		
		 list.forEach(System.out::println);
	}
}
