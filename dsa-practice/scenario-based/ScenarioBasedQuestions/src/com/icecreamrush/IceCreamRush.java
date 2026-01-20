package com.icecreamrush;

public class IceCreamRush {

    public static void bubbleSort(int[] sales) {
        int n = sales.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sales[j] > sales[j + 1]) {
                    // swap
                    int temp = sales[j];
                    sales[j] = sales[j + 1];
                    sales[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] weeklySales = {120, 90, 150, 60, 200, 80, 170, 110};

        System.out.println("Before Sorting:");
        for (int sale : weeklySales) {
            System.out.print(sale + " ");
        }

        bubbleSort(weeklySales);

        System.out.println("\n\nAfter Sorting (Least → Most Popular):");
        for (int sale : weeklySales) {
            System.out.print(sale + " ");
        }
    }
}

