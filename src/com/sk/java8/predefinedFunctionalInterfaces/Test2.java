package com.sk.java8.predefinedFunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
 Q1.develop a lambda function to take an array of integers, 
    add all these integers and return sum
    
 Q2.develop a lambda function to take an array of integers
    check weather it contains at-least  one even number,
    if available return true if not return false
     
 Q3.develop a lambda function to return 5 objects of Student  
 
 
 Q4.develop a lambda function to print sum of the fees paid by those 
 returned 5 objects
 */
public class Test2 {

	public static void main(String[] args) {
		
	//Q1
		System.out.println("................Q1..result................");
	
		Function<int[],Integer> f = arr->{
			int sum = arr[0];
			
			for(int i=1;i<arr.length;i++) {
				sum = sum+arr[i];
			}
			
			return sum;
		};
		
		Integer toSum = f.apply(new int[] {10,20,30});
		System.out.println(toSum);
		
		System.out.println("................Q2.result................");
		
		Predicate<int[]> p = arr->{
			
			for(int i:arr) {
				if(i%2==0)return true;
			}
			return false;
		};
		
		boolean test = p.test(new int[] {1,3,5,7,9});
		boolean test2 = p.test(new int[] {1,4,6,4});
		System.out.println("test1:"+test);
		System.out.println("test2:"+test2);
		
		System.out.println("..............Q3.result........................");
		
		Supplier<List<Student>> s = ()->{
			List<Student> al =new ArrayList<Student>();
			al.add(new Student("pravin", "latur", 10000));
			al.add(new Student("rudra", "pune", 15000));
			al.add(new Student("amar", "dharashiv", 20000));
			al.add(new Student("mahesh", "mumbai", 5000));
			return al;
		};
		
		List<Student> StuList = s.get();
		StuList.forEach(System.out::println);
		
		System.out.println("...............Q4........................");
		
		Consumer<List<Student>> c = slist->{
			int sum=0;
			for(int i=0;i<slist.size();i++) {
				sum=sum+slist.get(i).getFee();
			}
		System.out.println("total fees paid by whole students:"+sum);
		};
		
		c.accept(StuList);
	}
	
}
