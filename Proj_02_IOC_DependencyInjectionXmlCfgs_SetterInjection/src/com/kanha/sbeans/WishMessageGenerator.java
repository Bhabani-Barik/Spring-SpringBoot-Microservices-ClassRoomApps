package com.kanha.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator {
	private LocalTime localTime; // HAS-A property
	private LocalDate localDate; // HAS-A property

	// 0-parameter constructor
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-param constructor");
	}

	// setter method for setter injection
	public void setLocalTime(LocalTime localTime) {
		System.out.println("WishMessageGenerator.setLocalTime()");
		this.localTime = localTime;
	}

	public void setLocalDate(LocalDate localDate) {
		System.out.println("WishMessageGenerator.setLocalDate()");
		this.localDate = localDate;
	}

	// Business Method
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage():: " + localTime + " .... " + localDate);

		// get current hour of the day
		int hour = localTime.getHour(); // in 24hrs format

		if (hour < 12) {
			return "Good Morning :: " + user;
		} else if (hour < 16) {
			return "Good Afternoon :: " + user;
		} else if (hour < 20) {
			return "Good Evening :: " + user;
		} else {
			return "Good Night :: " + user;
		}
	}

}
