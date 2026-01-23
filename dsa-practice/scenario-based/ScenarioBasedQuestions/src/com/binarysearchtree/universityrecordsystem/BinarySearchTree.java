package com.binarysearchtree.universityrecordsystem;

class BinarySearchTree {

    Node root;

    // 🔹 Insert
    Node insert(Node root, int rollNo) {
        if (root == null) {
            return new Node(rollNo);
        }

        if (rollNo < root.rollNo) {
            root.left = insert(root.left, rollNo);
        } else if (rollNo > root.rollNo) {
            root.right = insert(root.right, rollNo);
        }

        return root;
    }

    // 🔹 Search
    boolean search(Node root, int rollNo) {
        if (root == null)
            return false;

        if (rollNo == root.rollNo)
            return true;

        if (rollNo < root.rollNo)
            return search(root.left, rollNo);

        return search(root.right, rollNo);
    }

    // 🔹 Inorder Traversal (Sorted Output)
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.rollNo + " ");
            inorder(root.right);
        }
    }

    // 🔹 Delete
    Node delete(Node root, int rollNo) {
        if (root == null)
            return root;

        if (rollNo < root.rollNo) {
            root.left = delete(root.left, rollNo);
        } else if (rollNo > root.rollNo) {
            root.right = delete(root.right, rollNo);
        } else {

            // Case 1 & 2: One or No Child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Case 3: Two Children
            root.rollNo = minValue(root.right);
            root.right = delete(root.right, root.rollNo);
        }

        return root;
    }

    // Find minimum value (Inorder Successor)
    int minValue(Node root) {
        int min = root.rollNo;
        while (root.left != null) {
            min = root.left.rollNo;
            root = root.left;
        }
        return min;
    }
}
