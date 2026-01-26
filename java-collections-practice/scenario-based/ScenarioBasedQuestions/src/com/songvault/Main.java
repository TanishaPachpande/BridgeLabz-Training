package com.songvault;

public class Main {
    public static void main(String[] args) {

        SongVault<Song> vault = new SongVault<>();

        vault.loadSongs("songs");

        vault.printLibrary();
        vault.printByGenre();
        vault.printUniqueArtists();
        vault.filterAndSort();
    }
}

