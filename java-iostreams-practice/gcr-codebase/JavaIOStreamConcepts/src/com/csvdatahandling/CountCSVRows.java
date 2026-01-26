package com.csvdatahandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {
    public static void main(String[] args) {
        String file = "C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\employees.csv";
        int rowCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.readLine(); // Skip header
            while (br.readLine() != null) {
                rowCount++;
            }
            System.out.println("Number of records (excluding header): " + rowCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

