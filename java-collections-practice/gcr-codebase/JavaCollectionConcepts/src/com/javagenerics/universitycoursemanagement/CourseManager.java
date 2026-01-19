package com.javagenerics.universitycoursemanagement;

import java.util.List;

class CourseManager {

    public static void displayAllCourses(List<? extends CourseType> courseTypes) {

        for (CourseType type : courseTypes) {
            System.out.println("Evaluation Method: " + type.getEvaluationMethod());
        }
    }
}

