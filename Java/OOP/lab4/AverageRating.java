package OOP.lab4;

/** 
 * Finish this class.
 */
public class AverageRating {
	private float avgRating;
	private float count;
	
	public AverageRating(float rating) {
		 this.avgRating = rating;
	}
	
	/**
	 * Recomputes the average rating taking the new rating r into account.
	 * @param rating 
	 */
	public void addRating(float r) {
		avgRating = (avgRating + r)/2;
	}
	
	public float getAvgRating() {
		return avgRating;
	}
	
	public String toString() {
		return "[AverageRating: " + avgRating + "]";
	}
}
