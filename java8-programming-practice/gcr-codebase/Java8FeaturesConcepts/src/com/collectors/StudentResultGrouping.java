package com.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
	String name;
	String grade;
	
	public Student(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public String toString() {
		return "Name: "+name+" | Grade:"+grade;
	}
}

public class StudentResultGrouping {
	public static void main(String[] args) {
		List<Student> students = List.of(new Student("tanisha", "A"),new Student("harsh", "E"),new Student("aditya", "A"),new Student("vibha", "C"));
		
		Map<String, List<String>> result =
                students.stream()
                        .collect(Collectors.groupingBy(
                                s -> s.grade,
                                Collectors.mapping(s -> s.name, Collectors.toList())
                        ));

        result.forEach((grade, names) ->
                System.out.println(grade + " -> " + names));
	}
}
