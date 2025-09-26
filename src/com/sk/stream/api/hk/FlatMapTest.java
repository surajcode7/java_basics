package com.sk.stream.api.hk;

import java.util.Arrays;
import java.util.List;

public class FlatMapTest {
/*
 making level or smooth 
 making a multi-dimensional array as one dimensional 
 means it merges all child arrays into only one list 
 [[a,b],[c,d],e,f]==>>[a,b,c,d,e,f]
 */
	public static void main(String[] args) {
		
		List<String[]> stringarraylist = List.of(new String[] {"a","b"},
				new String[] {"c","d"},
		        new String[] {"e","f"}
				);
		
		List<String> list = stringarraylist.stream()
		.flatMap(stringArray->Arrays.stream(stringArray))
		.toList();
		
		list.stream()
		.forEach(System.out::println);
		
		
				
	}
}
