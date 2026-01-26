package com.songvault;

import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class SongVault<T extends Media> {

    private static final Pattern TITLE_PATTERN =
            Pattern.compile("Title:\\s*(.*)");
    private static final Pattern ARTIST_PATTERN =
            Pattern.compile("Artist:\\s*(.*)");
    private static final Pattern DURATION_PATTERN =
            Pattern.compile("Duration:\\s*(\\d+:\\d{2})");
    private static final Pattern GENRE_PATTERN =
            Pattern.compile("Genre:\\s*(.*)");

    private List<Song> songs = new ArrayList<>();
    private Map<String, List<Song>> songsByGenre = new HashMap<>();
    private Set<String> uniqueArtists = new HashSet<>();

    public void loadSongs(String folderPath) {

        File folder = new File(folderPath);

        for (File file : folder.listFiles()) {
            if (file.getName().endsWith(".txt")) {
                try {
                    Song song = parseSongFile(file);
                    songs.add(song);
                    uniqueArtists.add(song.getArtist());
                    groupByGenre(song);
                } catch (Exception e) {
                    System.out.println("Skipping invalid file: " + file.getName());
                }
            }
        }
    }

    private Song parseSongFile(File file) throws IOException {

        String title = null, artist = null, duration = null, genre = null;

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        while ((line = br.readLine()) != null) {

            Matcher m;

            m = TITLE_PATTERN.matcher(line);
            if (m.matches()) title = m.group(1);

            m = ARTIST_PATTERN.matcher(line);
            if (m.matches()) artist = m.group(1);

            m = DURATION_PATTERN.matcher(line);
            if (m.matches()) duration = m.group(1);

            m = GENRE_PATTERN.matcher(line);
            if (m.matches()) genre = m.group(1);
        }
        br.close();

        if (title == null || artist == null || duration == null || genre == null) {
            throw new IllegalArgumentException("Missing fields");
        }

        return new Song(title, artist, duration, genre);
    }

    private void groupByGenre(Song song) {
        songsByGenre
                .computeIfAbsent(song.getGenre(), k -> new ArrayList<>())
                .add(song);
    }

    public void printLibrary() {
        System.out.println("\n--- Song Library ---");
        songs.forEach(System.out::println);
    }

    public void printByGenre() {
        System.out.println("\n--- Songs by Genre ---");
        songsByGenre.forEach((genre, list) -> {
            System.out.println(genre + ":");
            list.forEach(s -> System.out.println("  " + s));
        });
    }

    public void printUniqueArtists() {
        System.out.println("\n--- Unique Artists ---");
        uniqueArtists.forEach(System.out::println);
    }

    public void filterAndSort() {

        System.out.println("\n--- Rock Songs Sorted by Title ---");
        songs.stream()
                .filter(s -> s.getGenre().equalsIgnoreCase("Rock"))
                .sorted(Comparator.comparing(Song::getTitle))
                .forEach(System.out::println);
    }
}

