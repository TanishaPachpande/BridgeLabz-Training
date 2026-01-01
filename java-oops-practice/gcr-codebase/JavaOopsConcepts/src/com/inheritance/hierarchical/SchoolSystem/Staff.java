package com.inheritance.hierarchical.SchoolSystem;

public class Staff extends Person{
	private String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Role: Staff");
        displayBasicInfo();
        System.out.println("Department: " + department);
        System.out.println("--------------------------");
    }
}
