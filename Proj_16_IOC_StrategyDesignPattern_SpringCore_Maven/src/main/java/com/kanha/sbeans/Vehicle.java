package com.kanha.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public final class Vehicle {
	
	@Autowired
	@Qualifier("dieselEngine")
	private IEngine engine; // HAS-A Property
	
	// Business Methods
	public void journey(String startJourney, String endJourney) {
		System.out.print("Vehicle.journey start with ");
		engine.startEngine();
		
		System.out.println(" From " + startJourney + " to " + endJourney);
		engine.stopEngine();
		
		
	}

}
