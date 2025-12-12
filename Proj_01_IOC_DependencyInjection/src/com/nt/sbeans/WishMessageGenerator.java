package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator {
	
	private LocalTime time; // HAS-A property
	private LocalDate date; // HAS-A property
	private String favColor;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-param constructor");
	}

	// setter methods for setter Injection cfgs (alt+shift+s,r)

	public void setTime(LocalTime time) {
		System.out.println("WishMessageGenerator.setTime()");
		this.time = time;
	}

	public void setDate(LocalDate date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}

	public void setFavColor(String favColor) {
		System.out.println("WishMessageGenerator.setFavColor()");
		this.favColor = favColor;
	}

	// b.method
	public String showWishMessage(String name) {
		System.out.println("WishMessageGenerator.showWishMessage()::" + date + "...." + time + "..." + favColor);
		// get current hour of the day
		int hour = time.getHour();
		if (hour < 12)
			return "Good Morning:" + name;
		else if (hour < 16)
			return "Good Afternoon:" + name;
		else if (hour < 20)
			return "Good Evening:" + name;
		else
			return "Good Night:" + name;
	}
}
