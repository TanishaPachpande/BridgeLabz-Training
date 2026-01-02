package com.objectmodeling.UniversityWithFaculties;

import java.util.ArrayList;

class Department {
    private String deptName;
    private ArrayList<Faculty> facultyList;

    public Department(String deptName) {
        this.deptName = deptName;
        this.facultyList = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        facultyList.add(faculty);
    }

    public void displayDepartment() {
        System.out.println("\nDepartment: " + deptName);
        for (Faculty f : facultyList) {
            f.displayFaculty();
        }
    }
}

