package com.avltree.gamingapp;

class LeaderboardAVL {

    PlayerNode root;

    // 🔹 Get height
    int height(PlayerNode node) {
        return node == null ? 0 : node.height;
    }

    // 🔹 Get balance factor
    int getBalance(PlayerNode node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    // 🔹 Right Rotation
    PlayerNode rightRotate(PlayerNode y) {
        PlayerNode x = y.left;
        PlayerNode t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // 🔹 Left Rotation
    PlayerNode leftRotate(PlayerNode x) {
        PlayerNode y = x.right;
        PlayerNode t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // 🔹 Insert / Update Player
    PlayerNode insert(PlayerNode node, String name, int score) {

        if (node == null)
            return new PlayerNode(name, score);

        if (score < node.score)
            node.left = insert(node.left, name, score);
        else if (score > node.score)
            node.right = insert(node.right, name, score);
        else
            return node; // same score ignored for simplicity

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        // LL
        if (balance > 1 && score < node.left.score)
            return rightRotate(node);

        // RR
        if (balance < -1 && score > node.right.score)
            return leftRotate(node);

        // LR
        if (balance > 1 && score > node.left.score) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL
        if (balance < -1 && score < node.right.score) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // 🔹 Find minimum node
    PlayerNode minValueNode(PlayerNode node) {
        PlayerNode current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    // 🔹 Delete Player
    PlayerNode delete(PlayerNode root, int score) {

        if (root == null)
            return root;

        if (score < root.score)
            root.left = delete(root.left, score);
        else if (score > root.score)
            root.right = delete(root.right, score);
        else {

            if (root.left == null || root.right == null) {
                root = (root.left != null) ? root.left : root.right;
            } else {
                PlayerNode temp = minValueNode(root.right);
                root.score = temp.score;
                root.name = temp.name;
                root.right = delete(root.right, temp.score);
            }
        }

        if (root == null)
            return root;

        root.height = Math.max(height(root.left), height(root.right)) + 1;
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

    // 🔹 Display Top Players (Reverse Inorder)
    void displayTop(PlayerNode node, int[] count) {
        if (node != null && count[0] < 10) {
            displayTop(node.right, count);
            if (count[0] < 10) {
                System.out.println((count[0] + 1) + ". " + node.name + " - " + node.score);
                count[0]++;
            }
            displayTop(node.left, count);
        }
    }
}

