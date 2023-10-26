package OOP.lab4;

/** 
 * Finish this class.
 */
public class AverageRating {
	private float avgRating;
	private float count;
	
	public AverageRating(float rating) {
		this.avgRating = rating;
		this.count = count;
		count = 1;
	}
	
	/**
	 * Recomputes the average rating taking the new rating r into account.
	 * @param rating 
	 */
	public void addRating(float r) {
		if (count > 0){
		
		avgRating = (avgRating * count + r)/(count+1);
		count +=1;
		}
		else {
		count = 1;
		avgRating = avgRating+r;
		}
	}
	
	public float getAvgRating() {
		return avgRating;
	}
	
	public String toString() {
		return "[AverageRating: " + avgRating + "]";
	}
}
