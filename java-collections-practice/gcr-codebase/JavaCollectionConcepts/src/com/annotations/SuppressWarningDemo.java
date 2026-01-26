package com.annotations;

import java.util.ArrayList;

public class SuppressWarningDemo {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        @SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList(); // raw type

        list.add("Java");
        list.add(10);     // different type allowed

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}

