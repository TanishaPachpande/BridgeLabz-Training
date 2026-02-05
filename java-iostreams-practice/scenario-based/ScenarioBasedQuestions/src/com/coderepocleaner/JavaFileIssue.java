package com.coderepocleaner;


import java.io.File;

public class JavaFileIssue {

    private File file;
    private FileType type;
    private String message;

    public JavaFileIssue(File file, FileType type, String message) {
        this.file = file;
        this.type = type;
        this.message = message;
    }

    public File getFile() {
        return file;
    }

    public FileType getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return file.getName() + " -> " + type + " : " + message;
    }
}

