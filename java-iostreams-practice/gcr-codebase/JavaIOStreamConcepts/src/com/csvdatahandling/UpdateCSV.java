package com.csvdatahandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateCSV {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\employees.csv";
        String outputFile = "C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\employees_updated.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             FileWriter fw = new FileWriter(outputFile)) {

            String header = br.readLine();
            fw.append(header).append("\n");

            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values[2].equalsIgnoreCase("IT")) {
                    double salary = Double.parseDouble(values[3]);
                    salary = salary * 1.10; 
                    values[3] = String.format("%.0f", salary); 
                }
                fw.append(String.join(",", values)).append("\n");
            }

            System.out.println("Updated CSV file saved as 'employees_updated.csv'");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

