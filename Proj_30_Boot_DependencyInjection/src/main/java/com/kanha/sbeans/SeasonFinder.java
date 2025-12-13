package com.kanha.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("seasonFinder")
public class SeasonFinder {

	@Autowired
	private LocalDate localDate; // HAS-A property or Bean Property
	
	// Business Methods
	public String findSeason() {
		
		System.out.println("SeasonFinder.findSeason()");
		
		// get current month
		int month = localDate.getMonthValue();
		
		// show season name
		if (month >= 3 && month <= 6) {
			return "Summer Season";
		}
		else if (month >= 7 && month <= 10) {
			return "Rainy Season";
		}
		else {
			return "Winter Season";
		}
	}
}
