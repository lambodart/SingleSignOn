package LatestJava.Date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;


public class OldDateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
        calendar.set(2021, Calendar.JANUARY, 1);
        Date date = calendar.getTime();
        System.out.println(date);
        
        LocalDate date1 = LocalDate.of(2024, 12, 30);
        DayOfWeek dayOfWeek = date1.getDayOfWeek();
        System.out.println(date1);
        System.out.println(dayOfWeek);

        
        Calendar startCal = Calendar.getInstance();
        startCal.set(2024, Calendar.JUNE, 6, 10, 0);

        Calendar endCal = Calendar.getInstance();
        endCal.set(2024, Calendar.JUNE, 6, 12, 30);

        Date startDate = startCal.getTime();
        Date endDate = endCal.getTime();

        System.out.println("Event Start: " + startDate);
        System.out.println("Event End: " + endDate);
        
        LocalDateTime startDate1 = LocalDateTime.of(2024, 6, 6, 10, 0);
        LocalDateTime endDate1 = LocalDateTime.of(2024, 6, 6, 12, 30);

        System.out.println("Event Start: " + startDate1);
        System.out.println("Event End: " + endDate1);
	}

}
