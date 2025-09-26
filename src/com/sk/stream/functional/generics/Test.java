package com.sk.stream.functional.generics;

@FunctionalInterface
interface Addition<T>{
	T add(T a, T b);
}


public class Test {

	public static void main(String[] args) {
		
		Addition<Integer> intadd = (a,b)->a+b;
		int a = intadd.add(12, 12);
		System.out.println(a);
	}
}
