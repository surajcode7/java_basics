package com.sk.stream.api;

import java.util.List;

//Q1 given a list of strings ->
//print them in upperCase in alphabetical order
public class SortingStringByAlphabethical {

	public static void main(String[] args) {
		List<String> fruits = List.of("Apple", "Orange", "Banana", "Strawberry", "Kiwii", "Plums");
		
		fruits.stream()
		.sorted()
		//.map(str->str.toUpperCase())
		.map(String::toUpperCase)
		.forEach(System.out::println);
	}
}
