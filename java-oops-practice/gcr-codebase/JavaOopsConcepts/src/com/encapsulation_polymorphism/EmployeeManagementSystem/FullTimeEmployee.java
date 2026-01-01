package com.encapsulation_polymorphism.EmployeeManagementSystem;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    public double calculateSalary() {
        return getBaseSalary(); // fixed salary
    }
}


