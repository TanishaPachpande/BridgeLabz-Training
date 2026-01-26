package com.csvdatahandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {
    public static void main(String[] args) {
        String file = "C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\employees.csv";

        String[] header = {"ID", "Name", "Department", "Salary"};
        String[][] employees = {
            {"1", "John", "HR", "50000"},
            {"2", "Alice", "Finance", "60000"},
            {"3", "Bob", "IT", "70000"},
            {"4", "Eve", "Marketing", "55000"},
            {"5", "Charlie", "Sales", "52000"}
        };

        try (FileWriter fw = new FileWriter(file)) {
            
            fw.append(String.join(",", header));
            fw.append("\n");

            
            for (String[] emp : employees) {
                fw.append(String.join(",", emp));
                fw.append("\n");
            }

            System.out.println("CSV file 'employees.csv' created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

