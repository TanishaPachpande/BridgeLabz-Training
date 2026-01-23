package com.avltree.gamingapp;

class PlayerNode {
    String name;
    int score, height;
    PlayerNode left, right;

    PlayerNode(String name, int score) {
        this.name = name;
        this.score = score;
        height = 1;
    }
}

