package com.sk.stream.basic;

import java.util.Arrays;
import java.util.List;

//given a list of string count the list of string having length greater than 5
public class StringLengthCheck {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("suraj","sudarshan","swapnil","mukesh","rahul","pravin","sanket");
		
		long count = names.stream()
		.filter(n->n.length()>5)
		.count();
		
		System.out.println(count);
	}
}
