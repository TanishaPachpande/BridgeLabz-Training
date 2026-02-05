package com.songvault;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SongVault {

    private static final Pattern TITLE_PATTERN =
            Pattern.compile("Title:\\s*(.*)");
    private static final Pattern ARTIST_PATTERN =
            Pattern.compile("Artist:\\s*(.*)");
    private static final Pattern DURATION_PATTERN =
            Pattern.compile("Duration:\\s*(.*)");
    private static final Pattern GENRE_PATTERN =
            Pattern.compile("Genre:\\s*(.*)");

    public static void main(String[] args) {

        File folder = new File("songs");

        List<Song> songList = new ArrayList<>();
        Map<String, List<Song>> songsByGenre = new HashMap<>();
        Set<String> uniqueArtists = new HashSet<>();

        for (File file : folder.listFiles()) {
            if (file.getName().endsWith(".txt")) {
                try {
                    Song song = readSongFile(file);
                    songList.add(song);

                    songsByGenre
                            .computeIfAbsent(song.getGenre(), k -> new ArrayList<>())
                            .add(song);

                    uniqueArtists.add(song.getArtist());

                } catch (Exception e) {
                    System.out.println("Invalid song file skipped: " + file.getName());
                }
            }
        }

        System.out.println("\nAll Songs:");
        songList.forEach(System.out::println);

        System.out.println("\nUnique Artists:");
        uniqueArtists.forEach(System.out::println);

        System.out.println("\nSongs Grouped by Genre:");
        songsByGenre.forEach((genre, songs) -> {
            System.out.println("\n" + genre + ":");
            songs.forEach(System.out::println);
        });

        System.out.println("\nFiltered & Sorted Songs (Rock, sorted by title):");
        songList.stream()
                .filter(s -> s.getGenre().equalsIgnoreCase("Rock"))
                .sorted(Comparator.comparing(Song::getTitle))
                .forEach(System.out::println);
    }

    // -------- Read Song File --------

    private static Song readSongFile(File file) throws Exception {

        String title = null, artist = null, duration = null, genre = null;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

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
        }

        if (title == null || artist == null || duration == null || genre == null) {
            throw new RuntimeException("Missing song data");
        }

        return new Song(title, artist, duration, genre);
    }
}

