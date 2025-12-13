// Factory Pattern
package com.kanha.factory;

import com.kanha.components.DieselEngine;
import com.kanha.components.ElectricEngine;
import com.kanha.components.PetrolEngine;
import com.kanha.components.Vehicle;
import com.kanha.components.VehicleEngine;

public final class VehicleFactory {
	
	// static factory method having factory pattern logic
	public static Vehicle getEngine(String engineType) {
		
		// create dependent class object
		VehicleEngine engine = null;
		
		if (engineType.equalsIgnoreCase("diesel")) {
			engine = new DieselEngine();
		}
		else if (engineType.equalsIgnoreCase("electric")) {
			engine = new ElectricEngine();
		}
		else if (engineType.equalsIgnoreCase("petrol")) {
			engine = new PetrolEngine();
		}
		else {
			throw new IllegalArgumentException("Invalid Engine Type.");
		}
		
		// create target class object
		Vehicle vehicle = new Vehicle();
		
		// Assign dependent class object to target class
		vehicle.setVehicleEngine(engine);
		return vehicle;
	}

}
