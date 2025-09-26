package com.sk.stream.basic;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

//Qs convert given list of string to set
public class ListToSet {
public static void main(String[] args) {
	
	List<String> asList = Arrays.asList("apple","kiwi","orange","apple","banana","strawberry",null);
	
	Set<String> collect = asList.stream()
	.collect(Collectors.toSet());
	
	System.out.println(collect);
	
	LinkedHashSet<Object> collect2 = asList.stream()
	.collect(Collectors.toCollection(()->new LinkedHashSet<Object>()));
	
	System.out.println(collect2);
	
	TreeSet<String> collect3 = asList.stream()
	.collect(Collectors.toCollection(TreeSet::new));
	
	//System.out.println(collect3);  it will give nullPointerexception because treeSet not accepting null value
}
}
