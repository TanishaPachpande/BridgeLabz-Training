package com.coderepocleaner;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class CodeRepoCleaner {

    private static final Pattern METHOD_PATTERN =
            Pattern.compile("\\bvoid\\s+([A-Z][a-zA-Z0-9_]*)\\s*\\(");

    private static final Pattern IMPORT_PATTERN =
            Pattern.compile("^import\\s+([\\w\\.]+);", Pattern.MULTILINE);

    public static void main(String[] args) throws IOException {

        Path rootPath = Paths.get("source");

        List<Path> javaFiles = new ArrayList<>();
        Files.walk(rootPath)
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(javaFiles::add);

        Map<FileType, List<File>> categorizedFiles = new HashMap<>();
        categorizedFiles.put(FileType.VALID, new ArrayList<>());
        categorizedFiles.put(FileType.WARNING, new ArrayList<>());
        categorizedFiles.put(FileType.ERROR, new ArrayList<>());

        Set<String> allImports = new HashSet<>();

        for (Path path : javaFiles) {
            analyzeFile(path.toFile(), categorizedFiles, allImports);
        }

        printSummary(categorizedFiles);

        filterFilesBySize(javaFiles, 5_000);
    }

    // -------- File Analysis --------

    private static void analyzeFile(File file,
                                    Map<FileType, List<File>> categorizedFiles,
                                    Set<String> allImports) {

        try {
            String content = readFile(file);

            boolean hasBadMethodName = findBadMethodNames(content);
            boolean hasUnusedImports = findUnusedImports(content, allImports);

            if (hasBadMethodName && hasUnusedImports) {
                categorizedFiles.get(FileType.ERROR).add(file);
            } else if (hasBadMethodName || hasUnusedImports) {
                categorizedFiles.get(FileType.WARNING).add(file);
            } else {
                categorizedFiles.get(FileType.VALID).add(file);
            }

        } catch (Exception e) {
            categorizedFiles.get(FileType.ERROR).add(file);
        }
    }

    // -------- Read File --------

    private static String readFile(File file) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        }
        return sb.toString();
    }

    // -------- Regex Checks --------

    private static boolean findBadMethodNames(String content) {
        Matcher matcher = METHOD_PATTERN.matcher(content);
        return matcher.find();
    }

    private static boolean findUnusedImports(String content, Set<String> allImports) {
        Matcher matcher = IMPORT_PATTERN.matcher(content);
        boolean unusedFound = false;

        while (matcher.find()) {
            String imp = matcher.group(1);
            allImports.add(imp);

            String className = imp.substring(imp.lastIndexOf('.') + 1);
            if (!content.contains(className + ".")) {
                unusedFound = true;
            }
        }
        return unusedFound;
    }

    // -------- Streams Filtering --------

    private static void filterFilesBySize(List<Path> files, long sizeLimit) {
        System.out.println("\nFiles larger than " + sizeLimit + " bytes:");

        files.stream()
             .filter(p -> p.toFile().length() > sizeLimit)
             .forEach(p -> System.out.println(p.getFileName()));
    }

    // -------- Summary --------

    private static void printSummary(Map<FileType, List<File>> categorizedFiles) {
        System.out.println("\n===== Code Repository Summary =====");

        for (Map.Entry<FileType, List<File>> entry : categorizedFiles.entrySet()) {
            System.out.println(entry.getKey() + " Files:");
            for (File file : entry.getValue()) {
                System.out.println("  " + file.getName());
            }
        }
    }
}

