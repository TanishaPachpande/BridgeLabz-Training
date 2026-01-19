package com.javagenerics.universitycoursemanagement;

import java.util.ArrayList;
import java.util.List;

public class UniversityApp {

    public static void main(String[] args) {

        Course<ExamCourse> math =
                new Course<>("Mathematics", "Science", new ExamCourse());

        Course<AssignmentCourse> cs =
                new Course<>("Data Structures", "Computer Science", new AssignmentCourse());

        Course<ResearchCourse> phd =
                new Course<>("AI Research", "Engineering", new ResearchCourse());

        math.displayCourse();
        cs.displayCourse();
        phd.displayCourse();

        // Using wildcard
        List<CourseType> courseTypes = new ArrayList<>();
        courseTypes.add(new ExamCourse());
        courseTypes.add(new AssignmentCourse());
        courseTypes.add(new ResearchCourse());

        System.out.println("---- Evaluation Methods ----");
        CourseManager.displayAllCourses(courseTypes);
    }
}
