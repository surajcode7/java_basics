package com.sk.stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


/*
 List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
// Find first name starting with 'C'
// Output: Optional[Charlie]

 */
public class CheckFirstChar {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
		
		Optional<String> first = names.stream()
		.filter(str->str.startsWith("C"))
		.findFirst();
		
		
		System.out.println(first);
		
	}
}
