/*
package OOP.lab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SongCollectionTest {

    public static void main(String[] args) {
        // Test the Song and AverageRating classes
        testSongAndAverageRating();

        // Test the SongCollection class
        testSongCollection();

        // Test the SongLoader class
        testSongLoader();
    }

    public static void testSongAndAverageRating() {
        System.out.println("Testing Song and AverageRating classes:");

        // Create songs and average ratings
        AverageRating rating1 = new AverageRating(4.5f);
        Song song1 = new Song("Contribution", new ArrayList<>(Arrays.asList("Guitar", "Guitar", "Drums")), rating1);

        AverageRating rating2 = new AverageRating(10.0f);
        Song song2 = new Song("Nobody's Coder", new ArrayList<>(Arrays.asList("Mic", "Drums", "Mic")), rating2);

        AverageRating rating3 = new AverageRating(1.0f);
        Song song3 = new Song("Nobody's Coder", new ArrayList<>(Arrays.asList("Guitar", "Drums", "Mic")), rating3);

        // Test equality and addRating methods
        System.out.println("Song 1 equals Song 2: " + song1.equals(song2));
        System.out.println("Song 1 equals Song 3: " + song1.equals(song3));

        // Add ratings and check the average
        song1.addRating(5.0f);
        song2.addRating(8.0f);

        System.out.println("Song 1 Average Rating (after adding 5.0): " + song1.getRating().getAvgRating());
        System.out.println("Song 2 Average Rating (after adding 8.0): " + song2.getRating().getAvgRating());
    }

    public static void testSongCollection() {
        System.out.println("Testing SongCollection class:");

        // Create a SongCollection
        SongCollection collection = new SongCollection();

        // Add songs to the collection
        Song song1 = new Song("Contribution", new ArrayList<>(Arrays.asList("Guitar", "Guitar", "Drums")), new AverageRating(4.5f));
        Song song2 = new Song("Nobody's Coder", new ArrayList<>(Arrays.asList("Mic", "Drums", "Mic")), new AverageRating(10.0f));

        collection.add(song1);
        collection.add(song2);

        // Test the getNumberOfSongs and getSong methods
        System.out.println("Number of Songs in the Collection: " + collection.getNumberOfSongs());
        System.out.println("Song at Index 1: " + collection.getSong(1));

        // Test the toString method
        System.out.println("Song Collection:\n" + collection.toString());
    }

    public static void testSongLoader() {
        System.out.println("Testing SongLoader class:");

        // Load songs from a file
        String file = "songratings.txt";
        SongCollection songs = SongLoader.loadSongs(file);

        if (songs != null) {
            // Test the loaded collection
            System.out.println("Loaded Song Collection:\n" + songs.toString());
        }
    }
}

*/