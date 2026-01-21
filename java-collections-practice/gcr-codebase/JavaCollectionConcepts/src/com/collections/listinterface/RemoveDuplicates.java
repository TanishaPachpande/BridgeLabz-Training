package com.collections.listinterface;

import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> result = new ArrayList<>();

        for (int num : list) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }

        System.out.println(result);
    }
}

