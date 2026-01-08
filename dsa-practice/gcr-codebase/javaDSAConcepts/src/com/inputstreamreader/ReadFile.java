package com.inputstreamreader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ReadFile {

    public static void main(String[] args) {

        String fileName = "example.txt";

        try (
            // Step 1: Read binary data
            FileInputStream fis = new FileInputStream(fileName);

            // Step 2: Convert byte stream to character stream (UTF-8)
            InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));

            // Step 3: Buffer the reader
            BufferedReader br = new BufferedReader(isr)
        ) {

            String line;

            // Step 4: Read and print line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

