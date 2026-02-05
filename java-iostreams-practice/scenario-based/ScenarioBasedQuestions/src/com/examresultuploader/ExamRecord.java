package com.examresultuploader;


public class ExamRecord<T> {

    private int rollNo;
    private String name;
    private String subject;
    private T marks;

    public ExamRecord(int rollNo, String name, String subject, T marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public T getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return rollNo + " | " + name + " | " + subject + " | Marks: " + marks;
    }
}

