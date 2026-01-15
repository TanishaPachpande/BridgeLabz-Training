package com.hospitalqueue;

public class Patient {

    int id;
    String name;
    int criticality;   // 1 (low) to 10 (high)

    public Patient(int id, String name, int criticality) {
        this.id = id;
        this.name = name;
        this.criticality = criticality;
    }

    public void display() {
        System.out.println(id + "  " + name + "  Criticality: " + criticality);
    }
}

