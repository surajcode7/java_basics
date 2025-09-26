package com.sk.stream.api;

import java.util.Arrays;
import java.util.OptionalDouble;

//Q8 given an array of nums->
// find the sum and average
public class SumAndAvgArr {

 public static void main(String[] args) {
	
	 int arr[] = new int[] {10,20,30};
	 
	 int sum = Arrays.stream(arr).sum();
	 
	 System.out.println(sum);
	 
	 OptionalDouble average = Arrays.stream(arr).average();
	 
	 average.ifPresent(System.out::println);
	 
	 
}
}
