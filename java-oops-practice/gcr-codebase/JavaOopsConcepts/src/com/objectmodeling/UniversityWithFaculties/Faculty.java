package com.objectmodeling.UniversityWithFaculties;

class Faculty {
    private int facultyId;
    private String facultyName;

    public Faculty(int facultyId, String facultyName) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
    }

    public void displayFaculty() {
        System.out.println("Faculty ID: " + facultyId + ", Name: " + facultyName);
    }
}
