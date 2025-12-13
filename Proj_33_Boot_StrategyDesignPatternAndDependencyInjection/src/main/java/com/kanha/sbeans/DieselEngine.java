// Dependent class
package com.kanha.sbeans;

import org.springframework.stereotype.Component;

@Component("dieselEngine")
public final class DieselEngine implements IEngine {
	
	public DieselEngine() {
		System.out.println("DieselEngine :: 0-param constructor");
	}

	@Override
	public void startEngine() {
		System.out.println("DieselEngine:: Diesel Engine Started.");
	}

	@Override
	public void stopEngine() {
		System.out.println("DieselEngine:: Diesel Engine Stopped.");
	}

}
