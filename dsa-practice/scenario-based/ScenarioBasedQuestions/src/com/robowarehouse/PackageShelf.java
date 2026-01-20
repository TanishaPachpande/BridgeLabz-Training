package com.robowarehouse;

import java.util.ArrayList;

public class PackageShelf {
	ArrayList<Integer> packages = new ArrayList<>();
	
	public void addPackage(int weight) {
		packages.add(weight);
	
		int i = packages.size() - 1;
	    int key = packages.get(i);

	    int j = i - 1;

	    // shift elements to the right
	    while (j >= 0 && packages.get(j) > key) {
	        packages.set(j + 1, packages.get(j));
	        j--;
	    }

	    // place key at correct position
	    packages.set(j + 1, key);
		System.out.println("Added package to the shelf");
	}
	
	public void display() {
		if(packages!=null) {
			for(int wt : packages) {
				System.out.print(wt+" ");
			}
			System.out.println();
		}
		else {
			System.out.println("No packages in Shelf");
		}
	}
}
