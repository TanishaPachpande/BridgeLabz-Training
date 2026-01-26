package com.examscanner;

public class StudentScore {
    private String studentName;
    private int score;

    public StudentScore(String studentName, int score) {
        this.studentName = studentName;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return studentName + " → " + score;
    }
}

