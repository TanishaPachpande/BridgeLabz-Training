package com.constructors.level1;

public class Person {
	
	// Attributes
	String name;
	int age;
	
	// Default constructor (sets default name and age)
	Person(){
		this.name="Unknown";
		this.age=0;
	}
	
	// Copy constructor
	Person(Person p){
		this.name=p.name;
		this.age=p.age;
	}
	
	// Method to display details of a person
	void displayDetails(){
		System.out.println("Name of person is "+name);
		System.out.println("Age of person is "+age);;
	}
	
	public static void main(String[] args) {
		// Using default constructor
		Person p = new Person();
		p.name="Ashish";
		p.age=28;
		p.displayDetails();
		
		// Using copy constructor
        Person p2 = new Person(p);
        p2.displayDetails();
	}
}
