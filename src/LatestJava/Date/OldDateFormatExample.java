package LatestJava.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class OldDateFormatExample {

	public static void main(String[] args) throws ParseException {
		//Old
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	        Date date = formatter.parse("2021-01-01");
	        String formattedDate = formatter.format(date);
	        System.out.println(formattedDate);
	        
	        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        LocalDate date1 = LocalDate.parse("2021-01-01", formatter1);
	        String formattedDate1 = date1.format(formatter1);
	        System.out.println(formattedDate1);
	}

}
