package com.coderepocleaner;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class CodeAnalyzer {

    private static final Pattern BAD_METHOD_PATTERN =
            Pattern.compile("\\b(public|private|protected)\\s+\\w+\\s+([A-Z][a-zA-Z0-9_]*)\\s*\\(");

    private static final Pattern IMPORT_PATTERN =
            Pattern.compile("import\\s+([a-zA-Z0-9_.]+);");

    public static List<String> analyze(Path file) throws IOException {

        List<String> issues = new ArrayList<>();
        String content = Files.readString(file);

        Matcher methodMatcher = BAD_METHOD_PATTERN.matcher(content);
        while (methodMatcher.find()) {
            issues.add("Method naming violation: " + methodMatcher.group(2));
        }

        Matcher importMatcher = IMPORT_PATTERN.matcher(content);
        while (importMatcher.find()) {
            String fullImport = importMatcher.group(1);
            String className = fullImport.substring(fullImport.lastIndexOf('.') + 1);

            if (!content.matches("(?s).*\\b" + className + "\\b.*")) {
                issues.add("Unused import: " + fullImport);
            }
        }

        return issues;
    }
}

