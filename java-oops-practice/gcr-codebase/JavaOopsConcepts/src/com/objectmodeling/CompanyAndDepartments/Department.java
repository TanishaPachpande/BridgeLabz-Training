package com.objectmodeling.CompanyAndDepartments;

import java.util.ArrayList;

class Department {
    private String deptName;
    private ArrayList<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(int empId, String empName) {
        employees.add(new Employee(empId, empName));
    }

    public void displayDepartment() {
        System.out.println("\nDepartment: " + deptName);
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }

    public void clearEmployees() {
        employees.clear();
    }
}

