package com.binarysearchtree.universityrecordsystem;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        // 🔹 Scenario 1: Insertion
        bst.root = bst.insert(bst.root, 50);
        bst.insert(bst.root, 30);
        bst.insert(bst.root, 70);
        bst.insert(bst.root, 20);
        bst.insert(bst.root, 40);

        // 🔹 Scenario 3: Display Sorted Roll Numbers
        System.out.println("Student Roll Numbers (Sorted):");
        bst.inorder(bst.root);

        // 🔹 Scenario 3: Search
        System.out.println("\n\nSearching roll number 40:");
        System.out.println(bst.search(bst.root, 40) ? "Student Found" : "Student Not Found");

        // 🔹 Scenario 2: Deletion
        System.out.println("\nDeleting roll number 30");
        bst.root = bst.delete(bst.root, 30);

        System.out.println("After Deletion:");
        bst.inorder(bst.root);
    }
}

