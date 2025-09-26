package com.sk.stream.api;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

//Q6: given an array of nums->
// find the largest number in array
public class LargeNumInArray {

	public static void main(String[] args) {
		//in last example we find the largest number in list 
		//last example element is type of Integer
		//in this example element type is int
		
		int arr[] = new int[] {23,45,12,34,9,56,42};
		
		/*
		IntStream stream = Arrays.stream(arr);
		OptionalInt maxNum = stream.max();
		if(maxNum.isPresent()) {
			System.out.println(maxNum.getAsInt());
		}
		*/
		
		OptionalInt maxDigit = Arrays.stream(arr).max();
		if(maxDigit.isPresent()) {
			System.out.println(maxDigit.getAsInt());
		}
	}
}
