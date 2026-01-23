package com.avltree.hospitalqueuemanagement;

class HospitalAVL {

    PatientNode root;

    // 🔹 Height
    int height(PatientNode node) {
        return node == null ? 0 : node.height;
    }

    // 🔹 Balance Factor
    int getBalance(PatientNode node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    // 🔹 Right Rotation
    PatientNode rightRotate(PatientNode y) {
        PatientNode x = y.left;
        PatientNode t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // 🔹 Left Rotation
    PatientNode leftRotate(PatientNode x) {
        PatientNode y = x.right;
        PatientNode t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // 🔹 Scenario 1: Patient Registration
    PatientNode insert(PatientNode node, String name, int checkInTime) {

        if (node == null)
            return new PatientNode(name, checkInTime);

        if (checkInTime < node.checkInTime)
            node.left = insert(node.left, name, checkInTime);
        else
            node.right = insert(node.right, name, checkInTime);

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        // LL
        if (balance > 1 && checkInTime < node.left.checkInTime)
            return rightRotate(node);

        // RR
        if (balance < -1 && checkInTime > node.right.checkInTime)
            return leftRotate(node);

        // LR
        if (balance > 1 && checkInTime > node.left.checkInTime) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL
        if (balance < -1 && checkInTime < node.right.checkInTime) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // 🔹 Find Minimum Node
    PatientNode minValueNode(PatientNode node) {
        PatientNode current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    // 🔹 Scenario 2: Discharge / Delete Patient
    PatientNode delete(PatientNode root, int checkInTime) {

        if (root == null)
            return root;

        if (checkInTime < root.checkInTime)
            root.left = delete(root.left, checkInTime);
        else if (checkInTime > root.checkInTime)
            root.right = delete(root.right, checkInTime);
        else {

            if (root.left == null || root.right == null) {
                root = (root.left != null) ? root.left : root.right;
            } else {
                PatientNode temp = minValueNode(root.right);
                root.checkInTime = temp.checkInTime;
                root.name = temp.name;
                root.right = delete(root.right, temp.checkInTime);
            }
        }

        if (root == null)
            return root;

        root.height = 1 + Math.max(height(root.left), height(root.right));
        int balance = getBalance(root);

        // Balance cases
        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    // 🔹 Scenario 3: Display Patients by Arrival Time
    void inorder(PatientNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("Time: " + root.checkInTime + " | Patient: " + root.name);
            inorder(root.right);
        }
    }
}

