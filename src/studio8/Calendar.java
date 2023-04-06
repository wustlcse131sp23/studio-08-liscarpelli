package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Calendar {
	private LinkedList<Appointment> calendar;
	
	public Calendar() {	
		this.calendar = null;
	}
	
	public void addAppointment(Appointment a) {
		calendar.add(a);
	}

	@Override
	public String toString() {
		return "Calendar [calendar=" + calendar + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(calendar);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calendar other = (Calendar) obj;
		return Objects.equals(calendar, other.calendar);
	}

	public LinkedList<Appointment> getCalendar() {
		return calendar;
	}

	public void setCalendar(LinkedList<Appointment> calendar) {
		this.calendar = calendar;
	}

}
