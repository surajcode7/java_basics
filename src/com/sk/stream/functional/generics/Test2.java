package com.sk.stream.functional.generics;

class Person{
	
	@Override
	public String toString() {
		return "Person []";
	}
	
}

class Student extends Person{
	
	@Override
	public String toString() {
		return "Student []";
	}
	
}

class Employee extends Person{

	@Override
	public String toString() {
		return "Employee []";
	}
	
	
}

class Teacher extends Person{
	
	@Override
	public String toString() {
		return "Teacher []";
	}
	
}

interface Life<T extends Person>{
	
	void live(T t);
}

public class Test2 {

	public static void main(String[] args) {
		
		Life<Student> i1=t->{
			System.out.println(t);
		};
		
		Student st = new Student();
		i1.live(st);
		
		Life<Teacher> i2 = t->{
			System.out.println(t);
		};
		
		Teacher te = new Teacher();
		i2.live(te);
	}
}
