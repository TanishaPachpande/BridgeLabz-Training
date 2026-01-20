package com.eduresults;

public class EduResults {

    public static void mergeSort(Student[] students, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(students, left, mid);
            mergeSort(students, mid + 1, right);
            merge(students, left, mid, right);
        }
    }

    private static void merge(Student[] students, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Student[] L = new Student[n1];
        Student[] R = new Student[n2];

        for (int i = 0; i < n1; i++)
            L[i] = students[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = students[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Stable merge
        while (i < n1 && j < n2) {
            if (L[i].score <= R[j].score) {
                students[k++] = L[i++];
            } else {
                students[k++] = R[j++];
            }
        }

        while (i < n1) students[k++] = L[i++];
        while (j < n2) students[k++] = R[j++];
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student("Amit", 72),
            new Student("Neha", 88),
            new Student("Rahul", 65),
            new Student("Sneha", 72),
            new Student("Vikas", 90)
        };

        mergeSort(students, 0, students.length - 1);

        System.out.println("State-wise Rank List:");
        for (Student s : students) {
            System.out.println(s.name + " - " + s.score);
        }
    }
}

