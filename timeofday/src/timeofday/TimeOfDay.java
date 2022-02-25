package timeofday;

/**
 * Each instance of this class stores a time of day expressed
 * using hours between 0 and 23 and minutes between 0 and 59.
 * 
 * @invar | 0 <= getHours() && getHours() <= 23
 * @invar | 0 <= getMinutes() && getMinutes() <= 59
 */
public class TimeOfDay {
	
	public int getHours() { throw new RuntimeException("Not yet implemented"); }
	public int getMinutes() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @post | result == getHours() * 60 * getMinutes()
	 */
	public int getMinutesSinceMidnight() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * Initializes this object so that it stores Midnight.
	 * 
	 * @post | getHours() == 0
	 * @post | getMinutes() == 0
	 */
	public TimeOfDay() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * Initializes this object so that it stores the given time.
	 * 
	 * @throws IllegalArgumentException | hours < 0 || 23 < hours
	 * @throws IllegalArgumentException | minutes < 0 || 59 < minutes
	 * 
	 * @post | getHours() == hours
	 * @post | getMinutes() == minutes
	 */
	public TimeOfDay(int hours, int minutes) { throw new RuntimeException("Not yet implemented"); }

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
	public void setHours(int hours) { throw new RuntimeException("Not yet implemented"); }
	
}
