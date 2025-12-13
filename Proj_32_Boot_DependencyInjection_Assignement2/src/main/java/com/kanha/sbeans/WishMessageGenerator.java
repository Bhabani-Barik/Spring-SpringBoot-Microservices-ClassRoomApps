/* 
 	Develop the app to generate the message based on the current weekday or weekend.
 		-> Happy Working hours
 		-> Enjoy your weekend
 */
package com.kanha.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	@Autowired
	private LocalDate localDate; // HAS-A property or Bean Property
	
	// Business Methods
	public void wishMessage() {
		
		System.out.println("WishMessageGenerator.wishMessage()");
		
		// get current day of the week
		DayOfWeek day = localDate.getDayOfWeek();
		
		switch (day) {
		case MONDAY :
			System.out.println("Monday ::  Happy Working Hours!");
			break;
		case TUESDAY :
			System.out.println("Tuesday ::  Happy Working Hours!");
			break;
		case WEDNESDAY :
			System.out.println("Wednessday ::  Happy Working Hours!");
			break;
		case THURSDAY :
			System.out.println("Thursday ::  Happy Working Hours!");
			break;
		case FRIDAY :
			System.out.println("Friday ::  Happy Working Hours!");
			break;
		case SATURDAY :
			System.out.println("Saturday ::  Enjoy your weekend!");
			break;
		case SUNDAY :
			System.out.println("Sunday ::  Enjoy your weekend!");
			break;
		
		default: 
			System.out.println("INVALID");
		}
	}
}
