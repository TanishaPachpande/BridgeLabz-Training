package com.collections.setinterface;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersection {
	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		Set<Integer> set2 =  new HashSet<>();
		set2.add(3);
		set1.add(4);
		set1.add(5);
		
		Set<Integer> union = new HashSet<>();
		Set<Integer> intersection = new HashSet<>();
		
		for(int i: set1) {
			if(set2.contains(i)) {
				intersection.add(i);
			}
			union.add(i);
		}
		
		for(int i: set2) {
			union.add(i);
		}
		
		System.out.println("Union: "+ union);
		System.out.println("Intersection: "+ intersection);
		
	}
}
