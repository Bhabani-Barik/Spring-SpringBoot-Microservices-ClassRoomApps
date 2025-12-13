// Target Class

package com.kanha.components;

public final class Vehicle {
	
	private VehicleEngine vehicleEngine; // HAS-A property
	
	
	public void setVehicleEngine(VehicleEngine vehicleEngine) {
		System.out.println("Vehicle.setVehicleEngine()");
		this.vehicleEngine = vehicleEngine;
	}
	
	public String drive() {
	return vehicleEngine.engineType();
		
	}

}
