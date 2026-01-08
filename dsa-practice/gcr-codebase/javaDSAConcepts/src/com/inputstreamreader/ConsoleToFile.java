package com.inputstreamreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConsoleToFile {

    public static void main(String[] args) {

        String fileName = "output.txt";

        try (
            // Step 1: Read input from console
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            // Step 2: Write to file
            FileWriter fw = new FileWriter(fileName)
        ) {

            String input;

            System.out.println("Enter text (type 'exit' to stop):");

            // Step 3 & 4: Read input and write to file
            while (true) {
                input = br.readLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                fw.write(input);
                fw.write(System.lineSeparator()); // new line
            }

            System.out.println("Input successfully written to file.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

