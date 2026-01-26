package com.examresultuploader;

public class Main {
    public static void main(String[] args) {

        ExamResultUploader<String> uploader =
                new ExamResultUploader<>();

        uploader.processFile("results.csv", "Final Exam");
    }
}

