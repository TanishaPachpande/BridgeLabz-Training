package com.avltree.hospitalqueuemanagement;

public class Main {
    public static void main(String[] args) {

        HospitalAVL hospital = new HospitalAVL();

        // 🔹 Scenario 1: Patient Registration
        hospital.root = hospital.insert(hospital.root, "Amit", 101);
        hospital.root = hospital.insert(hospital.root, "Neha", 103);
        hospital.root = hospital.insert(hospital.root, "Rahul", 102);
        hospital.root = hospital.insert(hospital.root, "Sneha", 105);
        hospital.root = hospital.insert(hospital.root, "Vikram", 104);

        // 🔹 Scenario 3: Display by Arrival Time
        System.out.println("Patients by Arrival Time:");
        hospital.inorder(hospital.root);

        // 🔹 Scenario 2: Discharge Patient
        System.out.println("\nDischarging patient with check-in time 103");
        hospital.root = hospital.delete(hospital.root, 103);

        System.out.println("\nUpdated Patient Queue:");
        hospital.inorder(hospital.root);
    }
}

