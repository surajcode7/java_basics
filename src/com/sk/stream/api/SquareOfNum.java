package com.sk.stream.api;

import java.util.Arrays;
import java.util.List;

//Q4- given a list of nums ->
// find the square and print then
public class SquareOfNum {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6);
		
		asList.stream()
		.map(num->num*num)
		.forEach(System.out::println);
	}
}
