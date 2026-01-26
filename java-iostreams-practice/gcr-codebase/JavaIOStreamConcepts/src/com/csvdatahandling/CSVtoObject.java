package com.csvdatahandling;

import java.io.*;
import java.util.*;

class Student {
    int id;
    String name;
    int age;
    int marks;

    Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String toString() {
        return id + " " + name + " " + age + " " + marks;
    }
}

public class CSVtoObject {
    public static void main(String[] args) throws Exception {
        List<Student> students = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            String[] v = line.split(",");
            students.add(new Student(
                    Integer.parseInt(v[0]),
                    v[1],
                    Integer.parseInt(v[2]),
                    Integer.parseInt(v[3])
            ));
        }

        students.forEach(System.out::println);
    }
}

