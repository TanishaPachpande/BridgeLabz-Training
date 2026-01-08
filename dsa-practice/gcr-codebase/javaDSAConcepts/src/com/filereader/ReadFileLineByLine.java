package com.filereader;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadFileLineByLine {

    public static void main(String[] args) {

        BufferedReader br = null;

        try {
            // Step 1: Create FileReader
            FileReader fr = new FileReader("example.txt");

            // Step 2: Wrap FileReader with BufferedReader
            br = new BufferedReader(fr);

            String line;

            // Step 3: Read and print each line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            // Step 4: Close the file
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}

