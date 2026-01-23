package com.avltree.hospitalqueuemanagement;

class PatientNode {
    int checkInTime;
    String name;
    int height;
    PatientNode left, right;

    PatientNode(String name, int checkInTime) {
        this.name = name;
        this.checkInTime = checkInTime;
        this.height = 1;
    }
}

