package com.sk.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

//Q7: Given a list of integer objects->
//find the sum and average
public class SumAndAvg {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(2,5,3);
		
		Optional<Integer> sum = numList.stream()
		                               .reduce((n1,n2)->n1+n2);
		
		if(sum.isPresent()) {
			System.out.println(sum.get());
		}
		
		int sum2 = numList.stream()
		.mapToInt(number->number.intValue())
		.sum();
		
		System.out.println(sum2);
		
		OptionalDouble average = numList.stream()
		.mapToInt(Integer::intValue)
		.average();
		
		average.ifPresent(System.out::println);
		
		
	}
}
