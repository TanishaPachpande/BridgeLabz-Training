package com.examresultuploader;

public class ExamResult<T> {

    private String rollNo;
    private String name;
    private T examType;
    private String subject;
    private int marks;

    public ExamResult(String rollNo, String name, T examType,
                      String subject, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.examType = examType;
        this.subject = subject;
        this.marks = marks;
    }

    public String getSubject() {
        return subject;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}

