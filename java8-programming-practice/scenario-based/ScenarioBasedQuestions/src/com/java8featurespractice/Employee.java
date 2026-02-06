package com.java8featurespractice;

public class Employee {
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	int salary;
	
	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, int salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "ID: "+id+" |Name: "+name+" |Age: "+age+" |Gender: "+gender+" |department: "+department+" |yearOfJoining: "+yearOfJoining+" |Salary: "+salary;
	}
}
