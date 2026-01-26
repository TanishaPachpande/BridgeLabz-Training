package com.coderepocleaner;

import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class FileFilters {

    public static List<Path> filterBySize(List<Path> files, long minBytes) {
        return files.stream()
                .filter(p -> {
                    try {
                        return Files.size(p) > minBytes;
                    } catch (Exception e) {
                        return false;
                    }
                })
                .collect(Collectors.toList());
    }

    public static List<Path> filterRecentlyModified(List<Path> files, long days) {
        long threshold = System.currentTimeMillis() - (days * 24 * 60 * 60 * 1000);

        return files.stream()
                .filter(p -> {
                    try {
                        return Files.getLastModifiedTime(p).toMillis() > threshold;
                    } catch (Exception e) {
                        return false;
                    }
                })
                .collect(Collectors.toList());
    }
}

