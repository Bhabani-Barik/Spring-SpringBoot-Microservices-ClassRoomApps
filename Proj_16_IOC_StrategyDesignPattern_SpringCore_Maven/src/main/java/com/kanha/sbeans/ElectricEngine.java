// Dependent class
package com.kanha.sbeans;

import org.springframework.stereotype.Component;

@Component("electricEngine")
public final class ElectricEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("ElectricEngine:: Electric Engine Started.");
	}

	@Override
	public void stopEngine() {
		System.out.println("ElectricEngine:: Electric Engine Stopped.");
	}
}
