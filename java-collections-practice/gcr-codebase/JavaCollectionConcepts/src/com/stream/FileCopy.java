package com.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) {

        String sourcePath = "source.txt";
        String destinationPath = "destination.txt";

        File sourceFile = new File(sourcePath);

        // Check if source file exists
        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        try (
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destinationPath)
        ) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred while handling the file.");
            e.printStackTrace();
        }
    }
}

