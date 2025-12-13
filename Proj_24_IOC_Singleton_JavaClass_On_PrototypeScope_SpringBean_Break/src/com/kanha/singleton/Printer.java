package com.kanha.singleton;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("printer")
@Scope("prototype")
public class Printer {
	
	private static Printer INSTANCE;
	
	
	// Private Constructor
	private Printer() {
		System.out.println("Printer:: 0-param constructor.");
	}
	
	// static factory method having singleton logic
	public static Printer getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Printer();
		}
		return INSTANCE;
	}
}
