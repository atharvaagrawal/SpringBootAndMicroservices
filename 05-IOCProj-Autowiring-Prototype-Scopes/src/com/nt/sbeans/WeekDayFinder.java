package com.nt.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wdf")
@Scope("prototype")
public class WeekDayFinder {
	
	@Autowired
	LocalDate lt;
	
	// b.method
	public String checkDay() {
		DayOfWeek day = DayOfWeek.of(lt.get(ChronoField.DAY_OF_WEEK));
	      switch (day) {
	         case SATURDAY:
	            return ("Weekend - Saturday");
	         case SUNDAY:
	            return ("Weekend - Sunday");
	         default:
	            return ("Not a Weekend");
	      }
	}
}
