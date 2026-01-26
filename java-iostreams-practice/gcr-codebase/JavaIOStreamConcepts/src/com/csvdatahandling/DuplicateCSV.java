package com.csvdatahandling;

import java.io.*;
import java.util.*;

public class DuplicateCSV {
    public static void main(String[] args) throws Exception {
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        br.readLine();
        String line;

        while ((line = br.readLine()) != null) {
            String id = line.split(",")[0];
            if (!seen.add(id)) {
                duplicates.add(line);
            }
        }

        duplicates.forEach(System.out::println);
    }
}

