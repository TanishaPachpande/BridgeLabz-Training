package com.encapsulation_polymorphism.HospitalPatientManagement;

import java.util.ArrayList;
import java.util.List;

abstract class Patient implements MedicalRecord {

    private int patientId;
    private String name;
    private int age;

    // Sensitive data (encapsulated)
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Encapsulation: controlled access to medical data
    public void addRecord(String diagnosis) {
        medicalHistory.add(diagnosis);
        System.out.println("Medical record added.");
    }

    public void viewRecords() {
        System.out.println("Medical History:");
        for (String record : medicalHistory) {
            System.out.println("- " + record);
        }
    }
}

