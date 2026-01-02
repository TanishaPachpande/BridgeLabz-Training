package com.objectmodeling.CompanyAndDepartments;

public class Main {
    public static void main(String[] args) {

        Company company = new Company("Tech Solutions");

        Department it = company.addDepartment("IT");
        Department hr = company.addDepartment("HR");

        it.addEmployee(101, "Amit");
        it.addEmployee(102, "Neha");

        hr.addEmployee(201, "Ravi");

        company.displayCompany();

        // Deleting company
        company.closeCompany();
    }
}
