package com.medwarehouse;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/* ================= Medicine Class ================= */
class Medicine {
    String name;
    LocalDate expiryDate;

    Medicine(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return name + " (Expiry: " + expiryDate + ")";
    }
}

/* ================= MedWarehouse Class ================= */
public class MedWarehouse {

    /* -------- Merge Sort -------- */
    public static List<Medicine> mergeSort(List<Medicine> medicines) {
        if (medicines.size() <= 1) {
            return medicines;
        }

        int mid = medicines.size() / 2;

        List<Medicine> left = mergeSort(medicines.subList(0, mid));
        List<Medicine> right = mergeSort(medicines.subList(mid, medicines.size()));

        return merge(left, right);
    }

    /* -------- Merge Two Sorted Lists -------- */
    private static List<Medicine> merge(List<Medicine> left, List<Medicine> right) {
        List<Medicine> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).expiryDate.isBefore(right.get(j).expiryDate)) {
                result.add(left.get(i++));
            } else {
                result.add(right.get(j++));
            }
        }

        while (i < left.size()) result.add(left.get(i++));
        while (j < right.size()) result.add(right.get(j++));

        return result;
    }

    /* -------- Check Near Expiry Medicines -------- */
    public static void checkNearExpiry(List<Medicine> medicines) {
        LocalDate today = LocalDate.now();

        System.out.println("\n⚠ Medicines Nearing Expiry (within 30 days):");
        for (Medicine m : medicines) {
            long daysLeft = ChronoUnit.DAYS.between(today, m.expiryDate);
            if (daysLeft <= 30 && daysLeft >= 0) {
                System.out.println(m + " → " + daysLeft + " days left");
            }
        }
    }

    /* ================= Main Method ================= */
    public static void main(String[] args) {

        // Branch 1 (Already Sorted)
        List<Medicine> branch1 = new ArrayList<>();
        branch1.add(new Medicine("Paracetamol", LocalDate.of(2026, 2, 10)));
        branch1.add(new Medicine("Cough Syrup", LocalDate.of(2026, 3, 5)));
        branch1.add(new Medicine("Vitamin C", LocalDate.of(2026, 4, 1)));

        // Branch 2 (Already Sorted)
        List<Medicine> branch2 = new ArrayList<>();
        branch2.add(new Medicine("Insulin", LocalDate.of(2026, 1, 30)));
        branch2.add(new Medicine("Antibiotic", LocalDate.of(2026, 3, 20)));
        branch2.add(new Medicine("Pain Relief", LocalDate.of(2026, 5, 15)));

        // Combine all branches
        List<Medicine> allMedicines = new ArrayList<>();
        allMedicines.addAll(branch1);
        allMedicines.addAll(branch2);

        // Sort using Merge Sort
        List<Medicine> sortedMedicines = mergeSort(allMedicines);

        // Display Sorted Medicines
        System.out.println("📦 Medicines Sorted by Expiry Date:");
        for (Medicine m : sortedMedicines) {
            System.out.println(m);
        }

        // Check for near expiry medicines
        checkNearExpiry(sortedMedicines);
    }
}
