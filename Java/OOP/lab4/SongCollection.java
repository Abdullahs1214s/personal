package OOP.lab4;

import java.util.ArrayList;

/** 
 * Finish this class.
 */
public class SongCollection {
	private ArrayList<Song> songs;

	public SongCollection() {
		songs = new ArrayList<Song>();
	}

	/**
	 * Add the song if it is not in the list yet, otherwise update the average
	 * rating of the song.
	 * 
	 * @param s
	 */
	public void add(Song s) {
		if (songs.contains(s)) {
			for (Song i: songs){
				if (i.equals(s)){
					i.addRating(s.getRating().getAvgRating());
				}
			}
	}
	else{
		songs.add(s);
	}}

	public void remove(Song s) {
		songs.remove(s);
	}

	public boolean contains(Song s) {
		for(Song i : songs){
			if (i.equals(s)){
				//i.addRating(s.getRating().getAvgRating());
				return true;
			}}
			//songs.add(s);
			return false;
		
	}

	public Song getSong(int index) {
		if (0 <= index && index < songs.size())
			return songs.get(index);
		return null;
	}

	public int getNumberOfSongs() {
		return songs.size();
	}

	public ArrayList<Song> getSongs() {
		return songs;
		
	}

	public String toString() {
		String toRet = "[SongCollection: ";
		for (Song s : songs)
			toRet += "\n\t" + s + "; ";
		return toRet + "\n]";
	}
}
