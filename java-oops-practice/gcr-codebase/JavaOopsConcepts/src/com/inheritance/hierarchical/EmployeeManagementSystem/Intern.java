package com.inheritance.hierarchical.EmployeeManagementSystem;

public class Intern extends Employee{
	
	public Intern(String name, int id, int salary) {
		super(name, id, salary);
	}

	void dispDetails() {
		System.out.println("name: "+name+", id: "+id+", salary: "+salary);
	}

}
