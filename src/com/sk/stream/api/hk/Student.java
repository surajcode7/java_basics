package com.sk.stream.api.hk;

public class Student {

	private int id;
	private String name;
	private String courseName;
	private double fees;
	public Student(int id, String name, String courseName, double fees) {
		super();
		this.id = id;
		this.name = name;
		this.courseName = courseName;
		this.fees = fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courseName=" + courseName + ", fees=" + fees + "]";
	}
	
	
}
