package com.sk.stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

/*
 List<Integer> numbers = Arrays.asList(4, 9, 1, 6, 7);
// Output: 9

 */
public class MaximumNumber {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(4, 9, 1, 6, 7);
		
		/*
		 OptionalInt max = numbers.stream()
		.mapToInt(Integer::intValue)
		.max();
		
		max.ifPresent(System.out::println);
		 */
		
		Optional<Integer> max = numbers.stream()
		.max(Integer::compareTo);
		
		max.ifPresent(System.out::println);
	}
}
