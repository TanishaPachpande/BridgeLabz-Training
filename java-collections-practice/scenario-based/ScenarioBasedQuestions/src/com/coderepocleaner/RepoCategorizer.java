package com.coderepocleaner;

import java.nio.file.Path;
import java.util.*;

public class RepoCategorizer {

    private Map<FileType, List<Path>> categorizedFiles = new HashMap<>();
    private Set<String> extensions = new HashSet<>();

    public RepoCategorizer() {
        categorizedFiles.put(FileType.VALID, new ArrayList<>());
        categorizedFiles.put(FileType.WARNING, new ArrayList<>());
        categorizedFiles.put(FileType.ERROR, new ArrayList<>());
    }

    public void categorize(Path file, List<String> issues) {

        extensions.add(getExtension(file.toString()));

        if (issues.isEmpty()) {
            categorizedFiles.get(FileType.VALID).add(file);
        } else if (issues.size() <= 2) {
            categorizedFiles.get(FileType.WARNING).add(file);
        } else {
            categorizedFiles.get(FileType.ERROR).add(file);
        }
    }

    private String getExtension(String fileName) {
        return fileName.substring(fileName.lastIndexOf('.') + 1);
    }

    public Map<FileType, List<Path>> getCategorizedFiles() {
        return categorizedFiles;
    }

    public Set<String> getExtensions() {
        return extensions;
    }
}

