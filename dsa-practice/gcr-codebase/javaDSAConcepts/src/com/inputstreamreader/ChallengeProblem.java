package com.inputstreamreader;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ChallengeProblem {

    public static void main(String[] args) {

        // ===============================
        // PART 1: StringBuilder vs StringBuffer
        // ===============================

        int repetitions = 1_000_000;
        String text = "hello";

        // ---- StringBuilder ----
        StringBuilder sb = new StringBuilder();
        long startBuilder = System.nanoTime();

        for (int i = 0; i < repetitions; i++) {
            sb.append(text);
        }

        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;

        // ---- StringBuffer ----
        StringBuffer sbuf = new StringBuffer();
        long startBuffer = System.nanoTime();

        for (int i = 0; i < repetitions; i++) {
            sbuf.append(text);
        }

        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        System.out.println("===== String Concatenation Performance =====");
        System.out.println("StringBuilder Time (ns): " + builderTime);
        System.out.println("StringBuffer  Time (ns): " + bufferTime);

        // ===============================
        // PART 2: FileReader vs InputStreamReader
        // ===============================

        String filePath = "largefile.txt"; // e.g., 100MB file

        // ---- FileReader ----
        long startFileReader = System.nanoTime();
        long wordCountFR = countWordsUsingFileReader(filePath);
        long endFileReader = System.nanoTime();

        // ---- InputStreamReader ----
        long startISR = System.nanoTime();
        long wordCountISR = countWordsUsingInputStreamReader(filePath);
        long endISR = System.nanoTime();

        System.out.println("\n===== File Reading Performance =====");
        System.out.println("FileReader Word Count: " + wordCountFR);
        System.out.println("FileReader Time (ns): " + (endFileReader - startFileReader));

        System.out.println("InputStreamReader Word Count: " + wordCountISR);
        System.out.println("InputStreamReader Time (ns): " + (endISR - startISR));
    }

    // ===============================
    // FileReader Method
    // ===============================
    public static long countWordsUsingFileReader(String filePath) {
        long count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    count += words.length;
                }
            }

        } catch (IOException e) {
            System.out.println("FileReader Error: " + e.getMessage());
        }

        return count;
    }

    // ===============================
    // InputStreamReader Method
    // ===============================
    public static long countWordsUsingInputStreamReader(String filePath) {
        long count = 0;

        try (
            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr)
        ) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    count += words.length;
                }
            }

        } catch (IOException e) {
            System.out.println("InputStreamReader Error: " + e.getMessage());
        }

        return count;
    }
}

