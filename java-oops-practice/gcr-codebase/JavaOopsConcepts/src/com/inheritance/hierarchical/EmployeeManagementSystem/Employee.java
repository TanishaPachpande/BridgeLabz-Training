package com.inheritance.hierarchical.EmployeeManagementSystem;

public class Employee {
	
	// Attributes
	String name;
	int id;
	int salary;
	
	// Constructor
	public Employee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	// Method
	void dispDetails() {
		System.out.println("name: "+name+", id: "+id+", salary: "+salary);
	}
}
