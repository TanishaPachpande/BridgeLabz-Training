package com.encapsulation_polymorphism.HospitalPatientManagement;

public class Main {

    public static void main(String[] args) {

        Patient inPatient = new InPatient(101, "Amit", 45, 5, 2500);
        Patient outPatient = new OutPatient(102, "Neha", 30, 800);

        inPatient.addRecord("Diabetes");
        inPatient.addRecord("High Blood Pressure");
        outPatient.addRecord("Seasonal Flu");

        displayBill(inPatient);
        displayBill(outPatient);

        inPatient.viewRecords();
        outPatient.viewRecords();
    }
    
    public static void displayBill(Patient patient) {
        patient.getPatientDetails();
        System.out.println("Total Bill Amount: ₹" + patient.calculateBill());
        System.out.println("--------------------------------");
    }
}

