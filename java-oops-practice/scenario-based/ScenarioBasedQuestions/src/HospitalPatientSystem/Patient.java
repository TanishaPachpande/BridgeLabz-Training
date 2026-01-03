package HospitalPatientSystem;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String medicalHistory; // sensitive data

    // Normal admission constructor
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = "Not Provided";
    }

    // Emergency admission constructor (Overloaded)
    public Patient(int patientId, String name, int age, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    // Encapsulation: getters
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    // Sensitive data accessed safely
    public String getSummary() {
        return "Patient: " + name + ", Age: " + age;
    }

    // Polymorphism
    public abstract void displayInfo();
}

