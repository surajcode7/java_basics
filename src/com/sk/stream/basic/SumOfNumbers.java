package com.sk.stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
// Output: 15

 */
public class SumOfNumbers {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		/*
		 Optional<Integer> reduce = numbers.stream()
		.reduce((n1,n2)->n1+n2);
		
		reduce.ifPresent(System.out::println);
		 */
		
		/*
		 int reduce = numbers.stream()
		.reduce(0, Integer::sum);
		
		System.out.println(reduce);
		 */
		
		int sum = numbers.stream()
		.mapToInt(Integer::intValue)
		.sum();
		
		System.out.println(sum);
		
		
	}
}
