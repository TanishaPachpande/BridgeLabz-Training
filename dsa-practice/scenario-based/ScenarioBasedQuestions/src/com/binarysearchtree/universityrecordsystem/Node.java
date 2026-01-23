package com.binarysearchtree.universityrecordsystem;

class Node {
    int rollNo;
    Node left, right;

    Node(int rollNo) {
        this.rollNo = rollNo;
        left = right = null;
    }
}

