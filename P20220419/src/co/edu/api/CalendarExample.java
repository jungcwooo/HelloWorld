package co.edu.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
	public static void main(String[] args) {

		int year = 2022;
		int month = 5;

		Calendar cal = Calendar.getInstance();

		cal.set(year, month - 1, 1);
		System.out.println("년도 : " + cal.get(Calendar.YEAR));
		System.out.println("월 : " + cal.get(Calendar.MONTH));
		System.out.println("일 : " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일 : " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("마지막 일 : " + cal.getActualMaximum(Calendar.DATE));

		//////////////////////////////////////////

		Date today = new Date();
		System.out.println(today.toString());

		LocalDate ldate = LocalDate.of(2022, 10, 10);
		System.out.println(ldate.toString());

		LocalTime ltime = LocalTime.of(10, 10, 10);
		System.out.println(ltime.toString());

		LocalDateTime ldatetTime = LocalDateTime.now();
		ldatetTime = LocalDateTime.of(2022, 10,5, 10,20,30);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy-MM-dd, HH:mm");
		System.out.println(dtf.format(ldatetTime));
//		System.out.println(ldatetTime.toString());

	}
}
