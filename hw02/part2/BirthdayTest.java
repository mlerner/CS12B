import java.util.*;

public class BirthdayTest{
	public static void main(String [] args ){
		//Prompt for birth year, month, day 
		Scanner input = new Scanner(System.in);
		System.out.print("What month, day, and year were you born?  ");
		
		//Scanning input
		int month = input.nextInt();
		int day = input.nextInt();
		int year = input.nextInt();
		
		//Instantiating date and today Date objects
		Date date = new Date(year, month, day);
		Date today = new Date();
		
		//Print out the day that user was born on.
		System.out.println("You were born on " + date.toString() + ", which was a " + date.getDayOfWeek() + ".");
		
		//If today is the birthday entered, print message and age.
		if (date.getDay() == today.getDay() && date.getMonth() == today.getMonth()){
			System.out.println("Happy Birthday! You are now age " + getAge(date, today));
		}
		//If it is a leap year, print that the birthday occurred on a leap year.
		else if (date.isLeapYear()){
			System.out.println(date.getYear() + " was a leap year.");
		}
		
		//Print out how many days it is til birthday, if it isn't your birthday today.
		if (dayCounter(date, today) != 365){
			System.out.println("It will be your birthday in " + daysUntilBirthday(date, today) + " days.");
		}
		//Print how old user is.
		System.out.println("You are " + dayCounter(date, today) + " days old.");
		
	}
	
	//getAge Calculates age.
	public static int getAge( Date date, Date today ){
		return (today.getYear() - date.getYear());
	}//End of method getAge
	
	//dayCounter calculates days between dates.
	public static int dayCounter(Date date, Date today){
		double daysOld = 0;
		Date dayCounter = new Date(date.getYear(), date.getMonth(), date.getDay());
		//While you haven't reached the day yet, keep adding days.
		while (dayCounter.equals(today) == false) {	
			++daysOld;
			dayCounter.nextDay();		
		}
		
		return (int) daysOld;
	}//End of method dayCounter

	//daysUntilBirthday calculates daysUntilBirthday
	public static int daysUntilBirthday(Date date, Date today){
		//Instantiating objects that will be used in the method.
		//If the birthday is before today's month, then this object will be used
		Date birthday = new Date(today.getYear(), date.getMonth(), date.getDay()); 
		
		//If the birthday is after the today date, then this object will be used.
		Date birthdayAfter = new Date((today.getYear() + 1), date.getMonth(), date.getDay());
		
		//If the birthday has not happened in the current year
		if( birthday.getMonth() <= today.getMonth() && birthday.getDay() < today.getDay()){
			return dayCounter(birthday, today);
		}
		//If the birthday is later in the year, but hasn't happened.
		else if (birthday.getMonth() > today.getMonth()){
			return dayCounter(today, birthday);
		}
		//If the closest birthday is next year.
		else{	
			return dayCounter(today, birthdayAfter);
		}
		
	}//End of method daysUntilBirthday
	
}//End of public class BirthdayDate