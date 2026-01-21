package com.collections.setinterface;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		Set<Integer> set2 =  new HashSet<>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		Set<Integer> difference = new HashSet<>();
		for(int i: set1) {
			if(!set2.contains(i)) {
				difference.add(i);
			}
		}
		for(int i: set2) {
			if(!set1.contains(i)) {
				difference.add(i);
			}
		}
		
		System.out.println("Symmetric Difference: "+ difference);
	}
}
