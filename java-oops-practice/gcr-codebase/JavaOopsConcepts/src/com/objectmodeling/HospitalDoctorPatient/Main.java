
package com.objectmodeling.HospitalDoctorPatient;

public class Main {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Care Hospital");

        Doctor d1 = new Doctor(101, "Mehra");
        Doctor d2 = new Doctor(102, "Singh");

        Patient p1 = new Patient(1, "Tanisha");
        Patient p2 = new Patient(2, "Amit");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatient(p1);
        hospital.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);

        d2.consult(p1);

        d1.showPatients();
        d2.showPatients();

        p1.showDoctors();
        p2.showDoctors();
    }
}

