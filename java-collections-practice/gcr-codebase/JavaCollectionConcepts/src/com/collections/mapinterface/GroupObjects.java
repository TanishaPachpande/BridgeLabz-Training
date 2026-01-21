package com.collections.mapinterface;

import java.util.*;

public class GroupObjects {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee emp : employees) {
            departmentMap
                .computeIfAbsent(emp.department, k -> new ArrayList<>())
                .add(emp);
        }

        // Print result
        for (Map.Entry<String, List<Employee>> entry : departmentMap.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            entry.getValue().forEach(e -> System.out.print(e.name + " "));
            System.out.println();
        }
    }
}

