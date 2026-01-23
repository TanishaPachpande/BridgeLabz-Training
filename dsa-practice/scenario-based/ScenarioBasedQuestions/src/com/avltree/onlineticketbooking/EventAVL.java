package com.avltree.onlineticketbooking;

class EventAVL {

    EventNode root;

    // 🔹 Height
    int height(EventNode node) {
        return node == null ? 0 : node.height;
    }

    // 🔹 Balance Factor
    int getBalance(EventNode node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    // 🔹 Right Rotation
    EventNode rightRotate(EventNode y) {
        EventNode x = y.left;
        EventNode t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // 🔹 Left Rotation
    EventNode leftRotate(EventNode x) {
        EventNode y = x.right;
        EventNode t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // 🔹 Scenario 1: Insert Event
    EventNode insert(EventNode node, String eventName, int startTime) {

        if (node == null)
            return new EventNode(eventName, startTime);

        if (startTime < node.startTime)
            node.left = insert(node.left, eventName, startTime);
        else
            node.right = insert(node.right, eventName, startTime);

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        // LL
        if (balance > 1 && startTime < node.left.startTime)
            return rightRotate(node);

        // RR
        if (balance < -1 && startTime > node.right.startTime)
            return leftRotate(node);

        // LR
        if (balance > 1 && startTime > node.left.startTime) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL
        if (balance < -1 && startTime < node.right.startTime) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // 🔹 Find Minimum Event
    EventNode minValueNode(EventNode node) {
        EventNode current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    // 🔹 Scenario 2: Cancel Event
    EventNode delete(EventNode root, int startTime) {

        if (root == null)
            return root;

        if (startTime < root.startTime)
            root.left = delete(root.left, startTime);
        else if (startTime > root.startTime)
            root.right = delete(root.right, startTime);
        else {

            if (root.left == null || root.right == null) {
                root = (root.left != null) ? root.left : root.right;
            } else {
                EventNode temp = minValueNode(root.right);
                root.startTime = temp.startTime;
                root.eventName = temp.eventName;
                root.right = delete(root.right, temp.startTime);
            }
        }

        if (root == null)
            return root;

        root.height = 1 + Math.max(height(root.left), height(root.right));
        int balance = getBalance(root);

        // Balance tree
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

    // 🔹 Scenario 3: Show Events in Order
    void inorder(EventNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("Time: " + root.startTime + " | Event: " + root.eventName);
            inorder(root.right);
        }
    }
}

