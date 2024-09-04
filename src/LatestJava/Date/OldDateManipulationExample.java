package LatestJava.Date;

import java.util.Calendar;
import java.util.Date;

import java.time.LocalDate;

public class OldDateManipulationExample {

	public static void main(String[] args) {
		   LocalDate date = LocalDate.of(2021, 1, 1);
	        LocalDate newDate = date.plusDays(5);
	        System.out.println(newDate);
	        
	        //old
	        Calendar calendar = Calendar.getInstance();
	        calendar.set(2021, Calendar.JANUARY, 1);
	        calendar.add(Calendar.DAY_OF_MONTH, 5);
	        Date date1 = calendar.getTime();
	        System.out.println(date1);
	}
}
