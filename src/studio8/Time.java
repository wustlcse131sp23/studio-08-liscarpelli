package studio8;

import java.util.Objects;

/**
 * @author Judyli
 *
 */
public class Time {
	private int hour;
	private int minute;
	
	/**
	 * @param hour is the hour
	 * @param minute is the minute
	 * @return the time in minutes and hour*/
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	
	public Time() {
		this.hour = 0;
		this.minute = 0;
	}
	
	
	
	/**
	 *
	 */
	@Override
	public String toString() {
		int newHour;
		if (this.hour>12) {
			newHour = this.hour - 12;
		} else {
			newHour = this.hour;
		}
		return "Time [" + newHour + ":" + minute + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

	public int getHour() {
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public static void main(String[] args) {
		System.out.println(new Time(8, 42));
    	
    }

}