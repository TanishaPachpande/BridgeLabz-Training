package com.coderepocleaner;

import java.nio.file.*;
import java.util.*;

public class CodeRepoCleaner {

    public static void main(String[] args) throws Exception {

        List<Path> javaFiles = FileScanner.scanJavaFiles("src");

        RepoCategorizer categorizer = new RepoCategorizer();

        for (Path file : javaFiles) {
            try {
                List<String> issues = CodeAnalyzer.analyze(file);
                categorizer.categorize(file, issues);
            } catch (Exception e) {
                categorizer.categorize(file, List.of("File read error"));
            }
        }

        System.out.println("---- SUMMARY ----");
        categorizer.getCategorizedFiles().forEach((type, files) ->
                System.out.println(type + " → " + files.size() + " files"));

        System.out.println("\nExtensions found: " + categorizer.getExtensions());

        System.out.println("\nLarge files (>5KB):");
        FileFilters.filterBySize(javaFiles, 5 * 1024)
                .forEach(System.out::println);
    }
}

