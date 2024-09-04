package com.nt.sbeans;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;


import java.time.LocalDate;

@Component("sm")
public class SeasonMonth {
	
	public SeasonMonth() {
		System.out.println("SeasonMonth::0arg Constructor");
	}
	
	@Autowired
	LocalDate lt; // HAS-A Field Injection
	
	// business logic
	public String getSeasonBasedOnMonth() {
		int month = lt.getMonthValue();
		
		if ( month >= 3 && month <= 6 ) {
			return "Summer";
		}
		else if(month >= 7 && month <= 10) {
			return "Rainy";
		}
		else {
			return "Winter";
		}
	}
}
