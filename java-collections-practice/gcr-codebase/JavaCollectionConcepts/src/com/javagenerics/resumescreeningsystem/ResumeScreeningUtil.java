package com.javagenerics.resumescreeningsystem;

class ResumeScreeningUtil {

    public static <T extends JobRole> void screenResume(Resume<T> resume) {
        resume.displayResult();
    }
}

