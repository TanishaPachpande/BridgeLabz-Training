package com.fleetmanager;

import java.util.ArrayList;

public class MasterList {
	ArrayList<Vehicle> vehicles = new ArrayList<>();
	
	public void addVehicle(Vehicle v) {
		vehicles.add(v);
		
		mergeSort(vehicles, 0, vehicles.size()-1);
		
		System.out.println("Added vehicle");
	}
	
	public void display() {
		for(Vehicle v : vehicles) {
			System.out.println("Vehicle no. "+v.vehicleNumber+" has mileage of "+ v.mileage);
		}
		System.out.println();
	}
	
	public void mergeSort(ArrayList<Vehicle> vehicles, int start, int end) {
		if (start < end) {
            int mid = (start + end) / 2;

            mergeSort(vehicles, start, mid);
            mergeSort(vehicles, mid + 1, end);

            mixMerge(vehicles, start, mid, end);
        }
	}
	
	public void mixMerge(ArrayList<Vehicle> list, int left, int mid, int right) {
		ArrayList<Vehicle> temp = new ArrayList<>();
		
		int i = left;
        int j = mid + 1;

        while (i <= mid && j <= right) {
            if (list.get(i).mileage <= list.get(j).mileage) {
                temp.add(list.get(i++));
            } else {
                temp.add(list.get(j++));
            }
        }

        while (i <= mid) {
            temp.add(list.get(i++));
        }

        while (j <= right) {
            temp.add(list.get(j++));
        }

        for (int k = 0; k < temp.size(); k++) {
            list.set(left + k, temp.get(k));
        }
	}
}
