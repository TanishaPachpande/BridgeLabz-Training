package com.inheritance.hierarchical.SchoolSystem;

public class Teacher extends Person{
	private String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role: Teacher");
        displayBasicInfo();
        System.out.println("Subject: " + subject);
        System.out.println("--------------------------");
    }
}
