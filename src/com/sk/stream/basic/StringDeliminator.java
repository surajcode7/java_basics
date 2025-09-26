package com.sk.stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 List<String> cities = Arrays.asList("Delhi", "Mumbai", "Chennai");
// Output: "Delhi, Mumbai, Chennai"

 */
public class StringDeliminator {

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Delhi", "Mumbai", "Chennai");
		
		String collect = cities.stream()
		.collect(Collectors.joining(", "));
		
		System.out.println(collect);
	}
}
