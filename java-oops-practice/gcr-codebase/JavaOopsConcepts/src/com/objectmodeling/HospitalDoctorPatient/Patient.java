package com.objectmodeling.HospitalDoctorPatient;

import java.util.ArrayList;

class Patient {
    private int patientId;
    private String patientName;
    private ArrayList<Doctor> doctors;

    public Patient(int patientId, String patientName) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.doctors = new ArrayList<>();
    }

    public String getPatientName() {
        return patientName;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void showDoctors() {
        System.out.println("\nPatient: " + patientName + " consulted:");
        for (Doctor d : doctors) {
            System.out.println("Doctor: " + d.getDoctorName());
        }
    }
}

