package com.java8featurespractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OperationsOverEmployee {
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee(101, "tanisha", 22, "female", "cse", 2022, 72000));
		emps.add(new Employee(121, "harsh", 18, "male", "aiml", 2026, 60000));
		emps.add(new Employee(108, "aditya", 24, "male", "cse", 2020, 50000));
		emps.add(new Employee(201, "vibha", 27, "female", "ex", 2026, 55000));
		emps.add(new Employee(206, "khushi", 23, "female", "ex", 2024, 42000));
		emps.add(new Employee(111, "gunjan", 30, "female", "aiml", 2019, 50000));
		emps.add(new Employee(501, "dainik", 21, "male", "cse", 2022, 90000));
		emps.add(new Employee(601, "subhash", 22, "male", "cse", 2027, 52450));
		emps.add(new Employee(236, "ruchika", 25, "female", "aids", 2025, 84000));
		emps.add(new Employee(455, "vanshika", 27, "female", "aiml", 2026, 20000));
		
		// How many male and female employees are there in the organization?
		long femaleCount = emps.stream().filter((e) -> e.gender.equals("female")).count();
		long maleCount = emps.stream().filter((e) -> e.gender.equals("male")).count();
		System.out.println("Male Count: "+ maleCount);
		System.out.println("Female Count: "+ femaleCount);
		System.out.println("------------------------------------------------------");
		
		// Print the name of all departments in the organization ?
		System.out.println("Name of all departments: ");
		emps.stream().forEach(e -> System.out.println(e.department));
		System.out.println("-------------------------------------------------------");
		
		// What is the average age of male and female employees ?
		Double avgAgeMale = emps.stream().filter(e-> e.gender.equals("male")).collect(Collectors.averagingDouble(e -> e.age));
		Double avgAgeFemale = emps.stream().filter(e-> e.gender.equals("female")).collect(Collectors.averagingDouble(e -> e.age));
		System.out.printf("Male Avg Age: %.2f\n", avgAgeMale);
		System.out.printf("Female Avg Age: %.2f\n", avgAgeFemale);
		System.out.println("-------------------------------------------------------");
		
		// Get the details of highest paid employee in the organization ?
		System.out.println("The highest paid employee Details: ");
		emps.stream().max(Comparator.comparingInt(e-> e.salary)).ifPresent(System.out::println);
		System.out.println("-------------------------------------------------------");
		
		// Get the names of all employees who have joined after 2015 ?
		System.out.println("Names of employees joined after year 2015: ");
		List<String> names =
		        emps.stream()
		            .filter(e -> e.yearOfJoining > 2015)
		            .map(e -> e.name)
		            .collect(Collectors.toList());
        System.out.println(names);
		System.out.println("-------------------------------------------------------");
		
		// Count the number of employees in each department ?
		Map<String, Long> deptMap = emps.stream().collect(Collectors.groupingBy(e->e.department, Collectors.counting()));
		deptMap.forEach((k,v)->System.out.println(k+"->"+v));
		System.out.println("-------------------------------------------------------");
		
		// What is the average salary of each department ?
		Map<String, Double> avgDeptMap = emps.stream().collect(Collectors.groupingBy(e-> e.department, Collectors.averagingDouble(e->e.salary)));
		avgDeptMap.forEach((k,v)->System.out.printf("%s : %.2f\n",k,v));
		System.out.println("-------------------------------------------------------");
		
		// Get the details of youngest male employee in the product development department ?
		emps.stream()
		.filter(e-> (e.gender.equals("male")&&e.department.equals("cse")))
		.min(Comparator.comparingInt(e-> e.age))
		.ifPresent(System.out::println);
		System.out.println("--------------------------------------------------------");
		
		// Who has the most working experience in the organization?
		String name = emps.stream().min(Comparator.comparingInt(e-> e.yearOfJoining)).map(e->e.name).orElse("No Employee");
		System.out.println("most working experienced employee: "+name);
		System.out.println("---------------------------------------------------------");
		
		// How many male and female employees are there in the Sales team?
		long malesInCSE= emps.stream()
				.filter(e-> (e.gender.equals("male")&&e.department.equals("cse")))
			    .count();
		
		long femalesInCSE= emps.stream()
				.filter(e-> (e.gender.equals("female")&&e.department.equals("cse")))
			    .count();
		
		System.out.println("Males in cse: "+malesInCSE);
		System.out.println("Females in cse: "+femalesInCSE);
		System.out.println("---------------------------------------------------------");
		
		// What is the average salary of male and female employees ?
		double malesAvgSal= emps.stream()
				.filter(e-> (e.gender.equals("male")))
				.collect(Collectors.averagingDouble(e->e.salary));
		
		double femalesAvgSal= emps.stream()
				.filter(e-> (e.gender.equals("female")))
				.collect(Collectors.averagingDouble(e->e.salary));
		
		System.out.printf("Males Avg Salary: %.2f\n",malesAvgSal);
		System.out.printf("Females Avg Salary: %.2f\n",femalesAvgSal);
		System.out.println("---------------------------------------------------------");
		
		// List down the names of all employees in each department ?
		Map<String, List<String>> empsInDept = emps.stream()
				.collect(Collectors.groupingBy(
						e-> e.department, 
				        Collectors.mapping(e->e.name, Collectors.toList())));
		empsInDept.forEach((k,v)-> System.out.println(k+": "+v));
		System.out.println("---------------------------------------------------------");
		
		// 
	}
}
