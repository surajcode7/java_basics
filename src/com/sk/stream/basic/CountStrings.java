package com.sk.stream.basic;

import java.util.Arrays;
import java.util.List;

/*
 List<String> words = Arrays.asList("table", "computer", "pen", "notebook", "mouse");
// Output: 2

 */
public class CountStrings {

public static void main(String[] args) {
	
	List<String> words = Arrays.asList("table", "computer", "pen", "notebook", "mouse");
	
	long count = words.stream()
	.filter(str->str.length()>5)
	.count();
	
	System.out.println(count);
}
}
