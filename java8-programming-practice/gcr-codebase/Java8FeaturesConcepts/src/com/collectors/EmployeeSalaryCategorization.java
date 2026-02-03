package com.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeSalaryCategorization {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Tanisha", "IT", 50000),
                new Employee("Harsh", "IT", 70000),
                new Employee("Aditya", "HR", 40000),
                new Employee("Vibha", "HR", 60000),
                new Employee("Rohit", "Finance", 80000)
        );

        Map<String, Double> avgSalaryByDept =
                employees.stream()
                         .collect(Collectors.groupingBy(
                                 Employee::getDepartment,
                                 Collectors.averagingDouble(Employee::getSalary)
                         ));

        avgSalaryByDept.forEach(
                (dept, avg) -> System.out.println(dept + " -> " + avg)
        );
    }
}
