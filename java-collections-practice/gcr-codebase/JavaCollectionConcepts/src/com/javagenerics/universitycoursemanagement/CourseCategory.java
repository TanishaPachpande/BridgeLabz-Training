package com.javagenerics.universitycoursemanagement;

class ExamCourse extends CourseType {

    public ExamCourse() {
        this.evaluationMethod = "Written Exam";
    }

    @Override
    public String getEvaluationMethod() {
        return evaluationMethod;
    }
}

class AssignmentCourse extends CourseType {

    public AssignmentCourse() {
        this.evaluationMethod = "Assignments";
    }

    @Override
    public String getEvaluationMethod() {
        return evaluationMethod;
    }
}

class ResearchCourse extends CourseType {

    public ResearchCourse() {
        this.evaluationMethod = "Research Work";
    }

    @Override
    public String getEvaluationMethod() {
        return evaluationMethod;
    }
}

