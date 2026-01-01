package com.inheritance.hierarchical.EmployeeManagementSystem;

public class Developer extends Employee{
	
	public Developer(String name, int id, int salary) {
		super(name, id, salary);
	}


	String programmingLanguage;
	
	
	void dispDetails() {
		System.out.println("name: "+name+", id: "+id+", salary: "+salary);
	}
}
