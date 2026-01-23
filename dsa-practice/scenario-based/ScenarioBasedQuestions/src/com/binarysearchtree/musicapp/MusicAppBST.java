package com.binarysearchtree.musicapp;

public class MusicAppBST {
    public static void main(String[] args) {

        MusicBST library = new MusicBST();

        // 🔹 Scenario 2: Insert New Tracks
        library.root = library.insert(library.root, 201, "Believer");
        library.insert(library.root, 105, "Shape of You");
        library.insert(library.root, 310, "Counting Stars");
        library.insert(library.root, 150, "Apna Bana Le");

        // 🔹 Scenario 1: Search Track
        System.out.println("Searching for Track ID 310:");
        SongNode song = library.searchById(library.root, 310);
        if (song != null) {
            System.out.println("Song Found: " + song.title);
        } else {
            System.out.println("Song not found");
        }

        // 🔹 Scenario 3: Show Playlist Alphabetically
        System.out.println("\nPlaylist (Alphabetical Order):");
        library.inorder(library.root);
    }
}
