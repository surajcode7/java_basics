package com.sk.stream.api.hk;

import java.util.List;

public class CustomeTest {
	public static void main(String[] args) {
		List<Student> stdList = List.of(new Student(101, "arun", "java", 5000), 
				new Student(101, "vishal", "c++", 2000),
				new Student(101, "arjit", "python", 4000), 
				new Student(101, "rohan", "react", 3500),
				new Student(101, "govind", "devops", 2500), 
				new Student(101, "nitin", "angular", 3000),
				new Student(101, "aman", "java", 3000),
				new Student(101, "tejas", "react", 4000), 
				new Student(101, "aniket", "react", 3500),
				new Student(101, "rudra", "java", 2500), 
				new Student(101, "pradip", "angular", 3000));
		
		//retrieving and printing all the student list
		stdList.stream()
		.forEach(System.out::println);
        System.out.println(".............................................................");
		
        //retrieving and printing only java students
        stdList.stream()
        //.filter(stu->stu.getCourseName()=="java")
        .filter(stu->stu.getCourseName().equalsIgnoreCase("java"))
        .forEach(System.out::println);
        System.out.println(".............................................................");
        
        //retrieving and printing java students having fees 3000 or more than 3000 
        stdList.stream()
        .filter(stu->stu.getCourseName().equalsIgnoreCase("java"))
        .filter(stu->stu.getFees()>=3000)
        .forEach(System.out::println);
        
        
	}
	
}

