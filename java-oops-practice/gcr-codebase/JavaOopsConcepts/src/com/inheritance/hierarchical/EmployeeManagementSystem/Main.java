package com.inheritance.hierarchical.EmployeeManagementSystem;

public class Main {

	public static void main(String[] args) {
		Employee e = new Employee("xyz", 20, 10000);
		e.dispDetails();
		
		Developer d = new Developer("abc", 22, 20000);
		d.dispDetails();
		
		Employee f = new Manager("jkl", 19, 30000);
		f.dispDetails();
	}
}
