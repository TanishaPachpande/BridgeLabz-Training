package HospitalPatientSystem;

public class Main {
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Tanisha", 22, 5);
        Patient p2 = new OutPatient(102, "Rahul", 30, "03-Jan-2026");

        Doctor d1 = new Doctor(201, "Dr. Sharma", "Cardiology");

        Bill bill = new Bill(500, 1200, 200);

        // Polymorphism
        p1.displayInfo();
        p2.displayInfo();
        d1.displayInfo();

        System.out.println("Total Bill Amount: ₹" + bill.calculatePayment());
    }
}

