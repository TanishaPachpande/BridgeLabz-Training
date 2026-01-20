package com.cropmonitor;

import java.util.ArrayList;

public class CropMonitor {

    public static void quickSort(ArrayList<SensorData> list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);
            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }
    }

    private static int partition(ArrayList<SensorData> list, int low, int high) {
        long pivot = list.get(high).timestamp; // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (list.get(j).timestamp <= pivot) {
                i++;
                swap(list, i, j);
            }
        }
        swap(list, i + 1, high);
        return i + 1;
    }

    private static void swap(ArrayList<SensorData> list, int i, int j) {
        SensorData temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}

