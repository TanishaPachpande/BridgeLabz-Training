package com.csvdatahandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterCSV {
    public static void main(String[] args) {
        String file = "C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\students.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String header = br.readLine(); // skip header
            System.out.println(header); // Optional: print header
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int marks = Integer.parseInt(values[3]);
                if (marks > 80) {
                    System.out.println(line); // print qualifying record
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

