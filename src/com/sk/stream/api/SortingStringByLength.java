package com.sk.stream.api;

import java.util.List;

//Q2: given a list of strings ->
//sort by length in desending order and print them in upperCase
public class SortingStringByLength {

	public static void main(String[] args) {
		List<String> fruits = List.of("Apple", "Orange", "Banana", "Strawberry", "Kiwii", "Plums");
		
		fruits.stream()
		.sorted((s1,s2)->Integer.compare(s2.length(), s1.length()))
		.map(str->str.toUpperCase())
		.forEach(System.out::println);
	}
}
