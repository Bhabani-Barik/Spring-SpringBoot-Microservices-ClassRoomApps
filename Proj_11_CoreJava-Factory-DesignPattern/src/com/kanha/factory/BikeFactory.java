// Factory Pattern
package com.kanha.factory;

import com.kanha.components.Bike;
import com.kanha.components.BulletBike;
import com.kanha.components.ElectricBike;
import com.kanha.components.SportsBike;
import com.kanha.components.StandardBike;

public class BikeFactory {

	/*
	 * - This method taken as public, because it should be invoked outside of the
	 * factory class in different packages.
	 * 
	 * - This method taken as static, because it should be invoked on class name
	 * (without object) from the client application, because client apps not
	 * interested in Factory class object, they are interested Factory supplied
	 * resultant Bike object
	 * 
	 * - The return type is Bike(i) because that is common for all the related bike
	 * classes. So method can create and return any Bike(i) implementation class
	 * object based on the data that is being provided.
	 */
	// static factory method having factory pattern logic
	public static Bike orderBike(String type) {

		Bike bike = null;

		if (type.equalsIgnoreCase("standard")) {
			bike = new StandardBike();
		} else if (type.equalsIgnoreCase("sports")) {
			bike = new SportsBike();
		} else if (type.equalsIgnoreCase("electric")) {
			bike = new ElectricBike();
		} else if (type.equalsIgnoreCase("bullet")) {
			bike = new BulletBike();
		} else {
			throw new IllegalArgumentException("InValid Bike Type");
		}

		return bike;

	}

}
