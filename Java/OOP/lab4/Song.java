package OOP.lab4;


import java.util.ArrayList;
import java.util.Collections;


/** 
 * Finish this class.
 */
public class Song {
	private String title;
	private ArrayList<String> instruments;
	private AverageRating averageRating;
	
	public Song(String title, ArrayList<String> instruments, AverageRating rating) {
		this.title = title;
		this.instruments = instruments;
		this.averageRating = rating;
	}
	
	/**
	 * Returns true if the title of and instruments used in the Songs are the same.
	 * Note that you don't have to include the AverageRating in this comparison (as it is not really related to the equality of the Song). 
	 */
	public boolean equals(Object o) {
		if (o instanceof Song){
			Song obj = (Song) o;
			return equals(obj);
		}
		return false;
	}
	
	/**
	 * Returns true if the title of and instruments used in the Songs are the same.
	 * Note that you don't have to include the AverageRating in this comparison (as it is not really related to the equality of the Song). 
	 */
	public boolean equals(Song s) {
		boolean test = title.compareTo(s.getTitle()) == 0;
		Collections.sort(instruments);
		Collections.sort(s.getInstruments());
		boolean test1 = (instruments).equals(s.getInstruments());
		return test && test1;
	}
	
	public ArrayList<String> getInstruments(){
		return instruments;
	}
	
	public void addRating(float rating) {
		averageRating.addRating(rating);
	}
	
	public AverageRating getRating() {
		return averageRating;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String toString() {
		return "[Song: " + title + ", instruments: " + instruments + ", avg. rating: " + averageRating + "]"; 
	}
	
		/*ArrayList<String> inst = new ArrayList();
		inst.add("Guitar");
		inst.add("Drum");
		inst.add("Guitar");
		ArrayList<String> ins = new ArrayList();
		ins.add("Guitar");
		ins.add("Guitar");
		ins.add("Drum");
		AverageRating rating = new AverageRating(4);
		Song song = new Song("test", inst, rating);
		Song song1 = new Song("test", ins, rating);
		Song song2 = new Song("name", inst, rating);
		*/
		//System.out.println(song.equals(song1));

		//System.out.println(song.equals(song1));
		//System.out.println(inst);
		//Collections.sort(inst);
	//	System.out.println(inst);
		//AverageRating rating = new AverageRating(4);
		//System.out.println(rating.getAvgRating());
		
		//rating.addRating(9);
		//System.out.println(rating.getAvgRating());
	
}
