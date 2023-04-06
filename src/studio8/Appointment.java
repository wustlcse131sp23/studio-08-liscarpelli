package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;
	
	public Appointment(Date date, Time time) {
		this.date = date;
		this.time = time;
	}
	
	public Appointment() {
		this.date = new Date();
		this.time = new Time();
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}

	@Override
	public String toString() {
		return "Appointment [date: " + date + ", time: " + time + "]";
	}
	
	public static void main(String[] args) {
		Appointment a1 = new Appointment(new Date(1, 1, 2000), new Time(8, 10));
		Appointment a2 = new Appointment(new Date(3, 13, 2000), new Time(8, 20));
		Appointment a3 = new Appointment(new Date(5, 24, 2000), new Time(8, 30));
		Appointment a4 = new Appointment(new Date(7, 29, 2000), new Time(8, 40));
		Appointment a5 = new Appointment(new Date(9, 15, 2000), new Time(8, 50));
		Appointment a6 = new Appointment(new Date(11, 5, 2000), new Time(9, 00));
		
		LinkedList<Appointment> calendar = new LinkedList<Appointment>();
		calendar.add(a1);
		calendar.add(a2);
		calendar.add(a3);
		calendar.add(a4);
		calendar.add(a5);
		calendar.add(a6);
		System.out.println(calendar);

	}
}
