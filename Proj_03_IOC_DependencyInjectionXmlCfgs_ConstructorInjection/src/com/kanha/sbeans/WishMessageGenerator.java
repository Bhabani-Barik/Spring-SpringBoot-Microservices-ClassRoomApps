package com.kanha.sbeans;

import java.io.PrintStream;
import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator {
	private LocalTime localTime;
	private LocalDate localDate;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-param constructor");
	}

	public WishMessageGenerator(LocalTime localTime) {
		this.localTime = localTime;
		System.out.println("WishMessageGenerator:: 1-param constructor");
	}

	public WishMessageGenerator(LocalTime localTime, LocalDate localDate) {
		System.out.println("WishMessageGenerator :: 2-param constructor");
		this.localTime = localTime;
		this.localDate = localDate;
	}

	public String generateWishMessage(String user) {
		PrintStream var10000 = System.out;
		String var10001 = String.valueOf(this.localTime);
		var10000.println("WishMessageGenerator.generateWishMessage():: " + var10001 + " ..... "
				+ String.valueOf(this.localDate));
		int hour = this.localTime.getHour();
		if (hour < 12) {
			return "Good Morning :: " + user;
		} else if (hour < 16) {
			return "Good Afternoon :: " + user;
		} else {
			return hour < 20 ? "Good Evening :: " + user : "Good Night :: " + user;
		}
	}
}
