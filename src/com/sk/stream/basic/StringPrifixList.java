package com.sk.stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Q given a list of strings find the strings stated with "s" and convert it into to list and print them
public class StringPrifixList {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("sanket","pratik","soumya","rahul","mukund","sai","rohan");
		
		List<String> collect = names.stream()
		.filter(n->n.startsWith("s"))
		.collect(Collectors.toList());
		
		System.out.println(collect);
	}
	
}
