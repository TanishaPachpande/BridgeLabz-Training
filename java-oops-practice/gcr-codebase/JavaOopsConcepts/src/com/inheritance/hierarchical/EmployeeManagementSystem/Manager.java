package com.inheritance.hierarchical.EmployeeManagementSystem;

public class Manager extends Employee{
	
	public Manager(String name, int id, int salary) {
		super(name, id, salary);
	}
	int teamSize;
	void dispDetails() {
		System.out.println("name: "+name+", id: "+id+", salary: "+salary);
	}
}
