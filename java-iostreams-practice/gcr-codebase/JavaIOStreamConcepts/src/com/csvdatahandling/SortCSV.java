package com.csvdatahandling;

import java.io.*;
import java.util.*;

class Employee {
    String id, name, dept;
    double salary;

    Employee(String id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
}

public class SortCSV {
    public static void main(String[] args) throws Exception {
        List<Employee> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\employees.csv"));
        br.readLine(); 

        String line;
        while ((line = br.readLine()) != null) {
            String[] v = line.split(",");
            list.add(new Employee(v[0], v[1], v[2], Double.parseDouble(v[3])));
        }

        list.sort((a, b) -> Double.compare(b.salary, a.salary)); 

        System.out.println("Top 5 Highest Paid Employees:");
        for (int i = 0; i < Math.min(5, list.size()); i++) {
            Employee e = list.get(i);
            System.out.println(e.name + " - " + e.salary);
        }
    }
}
