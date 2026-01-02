package com.objectmodeling.UniversityWithFaculties;

import java.util.ArrayList;

class University {
    private String universityName;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> facultyPool;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.facultyPool = new ArrayList<>();
    }

    // Composition: Department created inside University
    public Department addDepartment(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
        return dept;
    }

    // Aggregation: Faculty added externally
    public void addFaculty(Faculty faculty) {
        facultyPool.add(faculty);
    }

    public void displayUniversity() {
        System.out.println("\nUniversity: " + universityName);

        System.out.println("\nDepartments:");
        for (Department d : departments) {
            d.displayDepartment();
        }

        System.out.println("\nFaculty Pool:");
        for (Faculty f : facultyPool) {
            f.displayFaculty();
        }
    }

    // Simulating deletion of University (Composition effect)
    public void closeUniversity() {
        departments.clear();
        System.out.println("\nUniversity " + universityName +
                " is closed. All departments are deleted.");
    }
}

