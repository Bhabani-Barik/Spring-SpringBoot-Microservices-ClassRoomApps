package com.kanha.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	
	private LocalTime localTime; // HAS-A property
	
	
	private LocalDate localDate; // HAS-A property
	
	
	// 0-parameter constructor
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-param constructor");
	}
		
	// 2-parameter constructor
	@Autowired
	public WishMessageGenerator(LocalTime localTime, LocalDate localDate) {
		this.localTime = localTime;
		this.localDate = localDate;
	}

	// Business Method
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage():: " + localTime +" ..... " + localDate );
		
		// get current hour of the day
		int hour = localTime.getHour(); // in 24hrs format
		
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
