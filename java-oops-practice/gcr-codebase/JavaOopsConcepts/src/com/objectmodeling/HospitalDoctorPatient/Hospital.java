package com.objectmodeling.HospitalDoctorPatient;

import java.util.ArrayList;

class Hospital {
    private String hospitalName;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showHospitalInfo() {
        System.out.println("\nHospital: " + hospitalName);
        System.out.println("Doctors: " + doctors.size());
        System.out.println("Patients: " + patients.size());
    }
}

