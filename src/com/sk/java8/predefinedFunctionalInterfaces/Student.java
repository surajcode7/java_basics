package com.sk.java8.predefinedFunctionalInterfaces;

public class Student {

	private String name;
	private String city;
	private int fee;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public Student(String name, String city, int fee) {
		super();
		this.name = name;
		this.city = city;
		this.fee = fee;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", fee=" + fee + "]";
	}
	
	 
}
