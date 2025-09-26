package com.sk.stream.basic;

import java.util.stream.IntStream;

//Q find the odd numbers in the given range and find the sum
public class EvenNumbersIntheRange {

	public static void main(String[] args) {
		
		int sum = IntStream.range(1, 11)  //it will not take 11
		.filter(n->n%2!=0)
		.sum();
		
		System.out.println(sum);
		
		int sum2 = IntStream.rangeClosed(1,11)  //it will take 11
		.filter(n->n%2!=0)
		.sum();
		
		System.out.println(sum2);
	}
}
