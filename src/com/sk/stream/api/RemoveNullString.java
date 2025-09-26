package com.sk.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

//Q3: given a list of strings, remove null, empty string
public class RemoveNullString {
public static void main(String[] args) {
	
	
	List<String> fruits = Arrays.asList("Apple", "", "Banana", null, " ", "Plums");

	
	fruits.stream()
	//.filter(str->str!=null && !str.trim().isEmpty())
	.filter(str->Objects.nonNull(str) && !str.trim().isEmpty())
	.forEach(System.out::println);
	
}
}
