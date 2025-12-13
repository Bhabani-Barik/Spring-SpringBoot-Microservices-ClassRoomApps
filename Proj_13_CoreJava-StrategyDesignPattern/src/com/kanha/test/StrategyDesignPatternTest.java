// Client App

package com.kanha.test;

import com.kanha.components.Vehicle;
import com.kanha.factory.VehicleFactory;

public class StrategyDesignPatternTest {

	public static void main(String[] args) {

		// use factory pattern to get target class object
		Vehicle vehicle = VehicleFactory.getEngine("petrol");

		// Invoke the business method
		String result = vehicle.drive();
		System.out.println(result);
	}

}
