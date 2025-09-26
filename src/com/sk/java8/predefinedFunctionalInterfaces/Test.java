package com.sk.java8.predefinedFunctionalInterfaces;

import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {
		
		Consumer<Integer> c1 = i->System.out.println(i);
		Consumer<Long> l1 = l->System.out.println(l);
		Consumer<Double> d1 = d->System.out.println(d);
		
		c1.accept(10);
		l1.accept(90l);
		d1.accept(2.4);
		
		System.out.println("..................................");
		
		Consumer<Integer> c2 = System.out::println;
		Consumer<Long> l2 = System.out::println;
		Consumer<Double> d2 = System.out::println;
		
		c2.accept(11);
		l2.accept(91l);
		d2.accept(2.5);
		
		System.out.println("...................................");
		
	}
}
