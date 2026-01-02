package com.objectmodeling.HospitalDoctorPatient;

import java.util.ArrayList;

class Doctor {
    private int doctorId;
    private String doctorName;
    private ArrayList<Patient> patients;

    public Doctor(int doctorId, String doctorName) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.patients = new ArrayList<>();
    }

    public String getDoctorName() {
        return doctorName;
    }

    // Association + Communication
    public void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);
        System.out.println("Dr. " + doctorName +
                " is consulting patient " + patient.getPatientName());
    }

    public void showPatients() {
        System.out.println("\nDoctor: " + doctorName + " consulted:");
        for (Patient p : patients) {
            System.out.println("Patient: " + p.getPatientName());
        }
    }
}

