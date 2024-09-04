package LatestJava.Java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

import java.time.ZonedDateTime;
import java.time.ZoneId;

import java.time.Period;
import java.time.Duration;

import java.time.format.DateTimeFormatter;

public class timeApi {

	public static void main(String[] args) {	
	LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();
    LocalDateTime dateTime = LocalDateTime.now();

    System.out.println("Current Date: " + date);
    System.out.println("Current Time: " + time);
    System.out.println("Current Date and Time: " + dateTime);
    
    ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
    System.out.println("Current Date and Time in New York: " + zonedDateTime);

    
    LocalDateTime dateTime1 = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formattedDateTime = dateTime1.format(formatter);
    System.out.println("Formatted DateTime: " + formattedDateTime);
    
    LocalDate startDate = LocalDate.of(2020, 1, 1);
    LocalDate endDate = LocalDate.of(2021, 1, 1);
    Period period = Period.between(startDate, endDate);
    System.out.println("Period: " + period);

    LocalTime startTime = LocalTime.of(12, 0);
    LocalTime endTime = LocalTime.of(14, 30);
    Duration duration = Duration.between(startTime, endTime);
    System.out.println("Duration: " + duration);
	}

}
