package com.runtimeanalysis.largefilereading;

import java.io.*;

public class FileReadTime {

    public static void main(String[] args) throws Exception {

        String filePath = "D:/example.txt";  

        // ---------- FileReader ----------
        long startTime = System.nanoTime();

        FileReader fr = new FileReader(filePath);
        while (fr.read() != -1) {
            // reading character by character
        }
        fr.close();

        long endTime = System.nanoTime();
        double fileReaderTime = (endTime - startTime) / 1_000_000.0;
        System.out.println("FileReader Time: " + fileReaderTime + " ms");

        // ---------- InputStreamReader ----------
        startTime = System.nanoTime();

        InputStreamReader isr =
                new InputStreamReader(new FileInputStream(filePath));
        while (isr.read() != -1) {
            // reading bytes and converting to characters
        }
        isr.close();

        endTime = System.nanoTime();
        double inputStreamReaderTime = (endTime - startTime) / 1_000_000.0;
        System.out.println("InputStreamReader Time: " + inputStreamReaderTime + " ms");
    }
}

