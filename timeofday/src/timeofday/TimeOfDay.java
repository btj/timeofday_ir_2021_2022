package timeofday;

/**
 * Each instance of this class stores a time of day expressed
 * using hours between 0 and 23 and minutes between 0 and 59.
 * 
 * @invar | 0 <= getHours() && getHours() <= 23
 * @invar | 0 <= getMinutes() && getMinutes() <= 59
 */
public class TimeOfDay {
	
	/**
	 * @invar | 0 <= hours && hours <= 23
	 * @invar | 0 <= minutes && minutes <= 59
	 */
	private int hours;
	private int minutes;
	
	public int getHours() { return hours; }
	public int getMinutes() { return minutes; }
	
	/**
	 * @post | result == getHours() * 60 + getMinutes()
	 */
	public int getMinutesSinceMidnight() { return hours * 60 + minutes; }
	
	/**
	 * Initializes this object so that it stores Midnight.
	 * 
	 * @post | getHours() == 0
	 * @post | getMinutes() == 0
	 */
	public TimeOfDay() {}
	
	/**
	 * Initializes this object so that it stores the given time.
	 * 
	 * @throws IllegalArgumentException | hours < 0 || 23 < hours
	 * @throws IllegalArgumentException | minutes < 0 || 59 < minutes
	 * 
	 * @post | getHours() == hours
	 * @post | getMinutes() == minutes
	 */
	public TimeOfDay(int hours, int minutes) {
		if (hours < 0 || 23 < hours)
			throw new IllegalArgumentException("`hours` out of range");
		if (minutes < 0 || 59 < minutes)
			throw new IllegalArgumentException("`minutes` out of range");
		
		this.hours = hours;
		this.minutes = minutes;
	}

	/**
	 * Sets this object's hours to the given value.
	 * 
	 * @throws IllegalArgumentException | hours < 0 || 23 < hours
	 * 
	 * @post | getHours() == hours
	 * @post | getMinutes() == old(getMinutes())
	 * 
	 * @mutates_properties | getHours()
	 */
	public void setHours(int hours) {
		if (hours < 0 || 23 < hours)
			throw new IllegalArgumentException("`hours` out of range");
		
		this.hours = hours;
	}
	
}
