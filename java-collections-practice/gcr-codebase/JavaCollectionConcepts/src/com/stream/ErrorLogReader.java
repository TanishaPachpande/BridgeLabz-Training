package com.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ErrorLogReader {

    public static void main(String[] args) {

        String filePath = "large_log_file.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = reader.readLine()) != null) {

                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error while reading the file.");
            e.printStackTrace();
        }
    }
}

