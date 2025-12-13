package com.kanha.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public final class Vehicle {

	@Autowired
	@Qualifier("dieselEngine")
	private IEngine engine; // HAS-A Property

	public Vehicle() {
		System.out.println("Vehicle:: 0-param constructor");
	}

	// Business Methods
	public void journey(String sourcePlace, String destinyPlace) {
		System.out.println("Vehicle.journey start with ");
		engine.startEngine();

		System.out.println("From " + sourcePlace);
		System.out.println("Journey is going on....");
		engine.stopEngine();
		System.out.println("Journey stopped at:: " + destinyPlace);

	}

}
