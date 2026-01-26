package com.resumeanalyzer;

public class ResumeData {
    private String email;
    private String phone;
    private int keywordMatchCount;
    private String fileName;

    public ResumeData(String email, String phone, int keywordMatchCount, String fileName) {
        this.email = email;
        this.phone = phone;
        this.keywordMatchCount = keywordMatchCount;
        this.fileName = fileName;
    }

    public String getEmail() {
        return email;
    }

    public int getKeywordMatchCount() {
        return keywordMatchCount;
    }

    @Override
    public String toString() {
        return "ResumeData{" +
                "email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", keywordMatchCount=" + keywordMatchCount +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}

