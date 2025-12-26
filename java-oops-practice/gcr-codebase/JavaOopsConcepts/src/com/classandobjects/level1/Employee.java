package com.classandobjects.level1;

public class Employee {

    // non-static variables
    String name;
    int id;
    double salary;

    // Constructor with parameters
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // method to display employee details
    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
    	// Creating object of a class
        Employee emp = new Employee("Rohan", 1, 500000);
        emp.displayEmployee();
    }
}
