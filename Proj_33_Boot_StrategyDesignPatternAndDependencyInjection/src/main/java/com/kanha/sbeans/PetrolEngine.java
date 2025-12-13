// Dependent Class
package com.kanha.sbeans;

import org.springframework.stereotype.Component;

@Component("petrolEngine")
public final class PetrolEngine implements IEngine {
	
	public PetrolEngine() {
		System.out.println("PetrolEngine:: 0-param constructor");
	}

	@Override
	public void startEngine() {
		System.out.println("PetrolEngine:: Petrol Engine Started.");
	}

	@Override
	public void stopEngine() {
		System.out.println("PetrolEngine:: Petrol Engine Stopped.");		
	}

}
