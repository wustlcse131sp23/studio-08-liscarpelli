package studio8;

import java.util.Objects;
import java.util.List;
import java.util.HashSet;
import java.util.LinkedList;

public class Date {
	private int month;
	private int day;
	private int year;

    public Date(int month, int day, int year) {
    	this.month = month;
    	this.day = day;
    	this.year = year;
    }
    
    public int getMonth() {
    	return this.month;
    }
    
    public int getDay() {
    	return this.day;
    }
    
    public int getYear() {
    	return this.year;
    }
    
    @Override
	public String toString() {
		return "Date [" + month + "/" + day + "/" + year + "]";
	}

	public void setMonth(int month) {
		this.month = month;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Date() {
    	this.month = 0;
    	this.day = 0;
    	this.year = 0;
    }
	
	public static void main(String[] args) {
		//System.out.println(new Date(4, 6, 2023));
		Date a = new Date(12, 19, 2003);
		Date b = new Date(11, 02, 2004);
		Date c = new Date(11, 02, 2004);
		Date d = new Date(02, 21, 2021);
		Date e = new Date(04, 01, 2022);
		Date f = new Date(04, 06, 2023);
		Date g = new Date(12, 25, 0000);
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		list.add(f);
		list.add(g);
		System.out.println(list);
		
		HashSet<Date> set = new HashSet<Date>();
		set.add(a);
		set.add(b);
		set.add(c);
		set.add(d);
		set.add(e);
		set.add(f);
		set.add(g);
		System.out.println(set);

    }

}
