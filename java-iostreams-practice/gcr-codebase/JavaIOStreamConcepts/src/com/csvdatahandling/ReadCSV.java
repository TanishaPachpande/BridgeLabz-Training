package com.csvdatahandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    public static void main(String[] args) {
        String file = "C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStreamConcepts\\src\\com\\csvdatahandling\\student.csv";
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.readLine(); 
            while ((line = br.readLine()) != null) {
                String[] values = line.split(","); 
                System.out.println("ID: " + values[0] + 
                                   ", Name: " + values[1] + 
                                   ", Age: " + values[2] + 
                                   ", Marks: " + values[3]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

