package com.objectmodeling.CompanyAndDepartments;

import java.util.ArrayList;

class Company {
    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public Department addDepartment(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
        return dept;
    }

    // Simulating deletion of company
    public void closeCompany() {
        for (Department dept : departments) {
            dept.clearEmployees();
        }
        departments.clear();
        System.out.println("\nCompany " + companyName + " is closed. All departments and employees removed.");
    }

    public void displayCompany() {
        System.out.println("\nCompany: " + companyName);
        for (Department dept : departments) {
            dept.displayDepartment();
        }
    }
}

