package com.hospitalqueue;

public class HospitalQueue {

    // Bubble Sort based on criticality (descending)
    public static void sortByCriticality(Patient[] patients) {

        int n = patients.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {

                if (patients[j].criticality < patients[j + 1].criticality) {
                    // Swap adjacent patients
                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
                    swapped = true;
                }
            }

            // Optimization: stop if already sorted
            if (!swapped)
                break;
        }
    }
}

