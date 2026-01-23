package com.binarysearchtree.musicapp;

class MusicBST {

    SongNode root;

    // 🔹 Insert song (based on title for alphabetical order)
    SongNode insert(SongNode root, int trackId, String title) {
        if (root == null) {
            return new SongNode(trackId, title);
        }

        if (title.compareToIgnoreCase(root.title) < 0) {
            root.left = insert(root.left, trackId, title);
        } else {
            root.right = insert(root.right, trackId, title);
        }

        return root;
    }

    // 🔹 Search song by Track ID
    SongNode searchById(SongNode root, int trackId) {
        if (root == null)
            return null;

        if (root.trackId == trackId)
            return root;

        SongNode leftResult = searchById(root.left, trackId);
        if (leftResult != null)
            return leftResult;

        return searchById(root.right, trackId);
    }

    // 🔹 Inorder Traversal (Alphabetical Playlist)
    void inorder(SongNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("Track ID: " + root.trackId + " | Title: " + root.title);
            inorder(root.right);
        }
    }
}
