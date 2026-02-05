package com.resumeanalyzer;


public class ResumeData implements Comparable<ResumeData> {

    private String email;
    private String phone;
    private int keywordCount;

    public ResumeData(String email, String phone, int keywordCount) {
        this.email = email;
        this.phone = phone;
        this.keywordCount = keywordCount;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getKeywordCount() {
        return keywordCount;
    }

    @Override
    public int compareTo(ResumeData other) {
        return Integer.compare(other.keywordCount, this.keywordCount);
    }

    @Override
    public String toString() {
        return "Email: " + email +
               ", Phone: " + phone +
               ", Keyword Matches: " + keywordCount;
    }
}

