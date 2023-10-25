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

/** 
 * Finish this class.
 */
public class SongLoader {
	/**
	 * Load a SongCollection from a file. Uses one or more Scanners to read the
	 * file, create Song objects and insert them into a SongCollection.
	 * 
	 * 
	 * The input is of the format: Songtitle; Instruments; Rating 
	 * Contribution;Guitar,Guitar,Drums;4.5
	 * 
	 * (see songratings.txt for the full input)
	 * 
	 * @param file
	 * @return the loaded SongCollection
	 */
	public static SongCollection loadSongs(String file) {
		try {
			File myobj = new File("/workspaces/personal/Java/OOP/lab4/songratings.txt");
			Scanner sc = new Scanner(myobj);
			SongCollection s = new SongCollection();
			while (sc.hasNextLine()){
				String line = sc.nextLine();
				s.add(parseSong(line));
				for (Song so : songs){

				}
			}sc.close();
			return s;
		}
			catch (FileNotFoundException e){
			System.err.println(e.getMessage());
		} catch (InvalidSongFormatException e){
			System.out.println(e.getMessage());
		}return null;
	}


	/**
	 * Parse a Song object from the String and return it. If the String cannot be
	 * parsed into a Song, throw an InvalidSongFormatException.
	 * 
	 * @param songString
	 * @return
	 * @throws InvalidSongFormatException
	 */
	
	 public static Song parseSong(String songString) throws InvalidSongFormatException {
		String title = "";
		String instruments = "";
		String rat = "";
		try {
		String[] splittedstr = songString.trim().split("\\s*;\\s*");
		title = splittedstr[0];
		instruments = splittedstr[1];
		rat = splittedstr[2];
		float rating = Float.parseFloat(rat);
		AverageRating rate = new AverageRating(rating);
		
		if (instruments == "" || title == "" || rat == ""){
			throw new InvalidSongFormatException("Invalid Song Format");
		}
		Song song = new Song (title,parseInstrumentsList(instruments),rate);
		return song;
	}
		catch (InvalidSongFormatException e){
			System.err.println(e.getMessage());
		}catch (ArrayIndexOutOfBoundsException e){
			throw new InvalidSongFormatException("Invalid Song Format");
		}
		
		return null;
	}

	/**
	 * Uses a scanner to parse the instruments string into an ArrayList of String
	 * objects. You can assume that the string comes in CSV (comma-separated-value)
	 * format, and that it is valid CSV (so no need to do error checking or account
	 * for issues with the data).
	 * 
	 * @param instruments
	 * @return an ArrayList with one String per parsed instrument
	 */
	
 	public static ArrayList<String> parseInstrumentsList(String instruments) {
		ArrayList<String> inst = new ArrayList<String>();
		String[] splitted = instruments.trim().split("\\s*,\\s*");
		int len = Arrays.asList(splitted).size();
		for (int i = 0; i < len; i++){
			inst.add(splitted[i]);
		}
		return inst;
	}
	

	public static void main(String[] args) {
		String file = "songratings.txt";
		System.out.println(SongLoader.loadSongs(file));
		

		//("C:\\Users\\srskh\\Downloads\\ece325_lab_assignment4\\lab_assignment4\\src\\ece325\\labs\\lab4\\songratings.txt")
	}
}
