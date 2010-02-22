import java.util.*;

public class Date{
	private int year = 1970;
	private int month = 1;
	private int day = 1;
	private int dayOfWeekIndex = 3;
	private static final int MONTHS_PER_YEAR = 12;
	private static final int START_DATE = 1970;
	private static final int END_OF_WEEK = 6;
	private static final int BEGINNING_OF_WEEK = 0;
	String [] daysInWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	
	//If initial values of values are given, check their values, and assign if valid.
	public Date(int year, int month, int day){
		if (year < 0 || month < 0 || month > 12 || day < 0 || day > 31){
			throw new IllegalArgumentException();
		}
		this.year = year;
		this.month = month;
		this.day = day;
	}
	//If no initial values are set, calculate what today is.
	public Date(){
		int dayCount = 0;
		while (dayCount < this.getDaysSinceEpoch()){
			this.nextDay();
			++dayCount;
		}
	}
		
	//getDay() returns day
	public int getDay(){
		return this.day;
	}//End of getDay() method
	
	//getMonth() returns month
	public int getMonth(){
		return this.month;
	}//End of getMonth() method
	
	//getYear() returns year
	public int getYear(){
		return this.year;
	}//End of getYear() method

	
	//getdayOfWeek() returns day of week
    public String getDayOfWeek(){
            //Return the name of the day.
            return this.daysInWeek[this.dayOfWeekIndex];
    }//End of getdayOfWeek() method

	
	//isLeapYear() returns whether year is leap year or not
	public boolean isLeapYear(){
		//If it is a leap year, return true.
		if ((this.year % 4 == 0) && (this.year % 100 != 0) || (this.year % 400 == 0)){
			return true;
		}
		else{
			return false;
		}
	}//End of isLeapYear() method
	
	//nextDay() returns next day
	public void nextDay(){
		//If number of days is less than the total amount of days in the month, increment.
		if (this.getDay() < this.daysInMonth() ){
			++this.day;
		}
		//If number of days is equals to total amount of days in month, and month is not december
		else if (this.getDay() == this.daysInMonth() && this.getMonth() < MONTHS_PER_YEAR){
			++this.month;
			this.day = 1;
		}
		else if (this.getMonth() == MONTHS_PER_YEAR){
			++this.year;
			this.month = 1;
			this.day = 1;
		}	
		
		if (this.dayOfWeekIndex == END_OF_WEEK){
			this.dayOfWeekIndex = BEGINNING_OF_WEEK;
		}
		++this.dayOfWeekIndex;
	
		
	}//End of nextDay() method
	
	//toString() converts date to string and returns it
	public String toString(){
		return this.year + "/" + this.month + "/" + this.day;
	}//End of toString() method
	
	//equals() compares to objects, and returns whether they are referring to the same attributesreturns
	public boolean equals (Object o){
		if (o instanceof Date){
			Date compare = (Date) o;
			//Return whether the attributes are the same for each. 
			return this.year == compare.year && this.month == compare.month && this.day == compare.day; 
		}
		else { //if o is not a Date object, return false
			return false;
		}
		
	}//End of getDay() method
	
	//A method that returns the days in a month
	public int daysInMonth(){
		
		int [] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		//If this is a leap year, make number of days in February 29.
		if (this.isLeapYear()){
			months[1] = 29;
		}
		if (this.month == 1){
			return months[0];
		}
		else{
			return months[this.month - 1];
		}
		
	}//End of daysInMonth() method

	public int getDaysSinceEpoch(){
		return (int) ((System.currentTimeMillis() + TimeZone.getDefault().getRawOffset()) / 1000 / 60 / 60 / 24);
	}//End of daysInMonth() method
}

