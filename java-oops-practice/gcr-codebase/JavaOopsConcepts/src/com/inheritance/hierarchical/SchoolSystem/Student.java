package com.inheritance.hierarchical.SchoolSystem;

public class Student extends Person{
	private String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role: Student");
        displayBasicInfo();
        System.out.println("Grade: " + grade);
        System.out.println("--------------------------");
    }
}
