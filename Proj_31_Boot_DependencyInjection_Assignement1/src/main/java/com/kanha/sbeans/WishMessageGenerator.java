package com.kanha.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	@Autowired
	private LocalTime localTime; // HAS-A property or Bean Property
	
	// Business Methods
	public String wishMessage(String user) {
		
		System.out.println("WishMessageGenerator.wishMessage()");
		
		// get current hour of the day
		int hour = localTime.getHour();
		
		if (hour < 12) {
			return "Good Morning :: " + user;
		} 
		else if (hour < 16) {
			return "Good Afternoon :: " + user;
		}
		else if (hour < 20) {
			return "Good Evening :: " + user;
		}
		else {
			return "Good Night :: " + user;
		}
		
	}
}
