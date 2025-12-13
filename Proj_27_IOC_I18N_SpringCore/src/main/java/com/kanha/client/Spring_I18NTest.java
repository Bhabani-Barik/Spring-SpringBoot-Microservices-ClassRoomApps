package com.kanha.client;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kanha.config.AppConfig;

public class Spring_I18NTest {
	public static void main(String[] args) {
		
		// Create IOC container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// Read language code  and country code from the end user
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Language Code::");
		String lang= scanner.next();
		System.out.println("Enter country Code::");
		String country= scanner.next();
		
		// prepare Locale obj  having language code + country code
		Locale locale = new Locale(lang, country);
		
		// read the message from the Locale specific properties file using the ctx.getMessage(-) method
		String msg1 = context.getMessage("welcome.msg", new Object[] {"Kanha"}, locale);
		String msg2 = context.getMessage("goodbye.msg", new Object[] {}, locale);
		String msg3 = context.getMessage("application.title", new Object[] {}, locale);
		String msg4 = context.getMessage("wish.message", new Object[] {}, locale);
	
		// Display the message
		System.out.println(msg1 +"...." + msg2 + "...." + msg3 + "...." + msg4);
	
		// close the container
		context.close();
	}

}
