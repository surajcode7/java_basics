package com.sk.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Q5 given a list of num->
//find the largest number in the list
public class LargestNumbers {
public static void main(String[] args) {
	
	List<Integer> nums = Arrays.asList(5,6,2,7,8);

	/*
	Optional<Integer> maxNumOpt = nums.stream()
	                            .max((o1,o2)->o1.compareTo(o2));
	
	if(maxNumOpt.isPresent()) {
		Integer largest = maxNumOpt.get();
		System.out.println(largest);
	}
	*/
	
	Optional<Integer> largeNum = nums.stream()
	    .max(Integer::compareTo);
	
	if(largeNum.isPresent()) {
		
		Integer larnum = largeNum.get();
		System.out.println(larnum);
	}
}
}
