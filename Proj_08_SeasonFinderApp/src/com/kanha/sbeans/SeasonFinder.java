/*
 Assignment: Find out current season  named based on the current month of the year by taking "com.kanha.sbeans.SeasonFinder" (target class) 
 and java.util.Date (dependent class)
*/

package com.kanha.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("seasonFinder")
public class SeasonFinder {

	private LocalDate localDate; // HAS-A Property

	// 0-parameter constructor
	public SeasonFinder() {
		System.out.println("SeasonFinder:: 0-parameter constructor");
	}

	// 1-parameter constructor
	@Autowired
	public SeasonFinder(LocalDate localDate) {
		System.out.println("SeasonFinder:: 1-param constructor");
		this.localDate = localDate;
	}

	// Business Methods
	public String findCurrentSeason() {
		System.out.println("SeasonFinder.findCurrentSeason()");

		// get current month
		int currentMonth = localDate.getMonthValue();

		System.out.println(
				"Current Day:: " + localDate.getDayOfWeek() + " " + localDate.getMonth() + " " + localDate.getYear());

		if (currentMonth >= 3 && currentMonth <= 5) {
			return "Oh! God, Too much Hot - It's Summer Season";
		} else if (currentMonth >= 6 && currentMonth <= 8) {
			return "Feel the rain drops & cloudy sky - Boss it's Rainy Season";
		} else if (currentMonth >= 9 && currentMonth <= 11) {
			return "Too much cold environment bro! - It's Winter Season";
		} else {
			return "It's Automon Season";
		}
	}
}
