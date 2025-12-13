// Factory Pattern
package com.kanha.factory;

import com.kanha.components.BlueDart;
import com.kanha.components.Courier;
import com.kanha.components.DTDC;
import com.kanha.components.Ekart;
import com.kanha.components.Flipkart;

public final class FlipkartFactory {

	// Static factory method having factory pattern logic.
	public static Flipkart getInstance(String courierType) {

		// create dependent class object
		Courier courier = null;

		if (courierType.equalsIgnoreCase("dtdc")) {
			courier = new DTDC();
		} else if (courierType.equalsIgnoreCase("blueDart")) {
			courier = new BlueDart();
		} else if (courierType.equals("ekart")) {
			courier = new Ekart();
		} else {
			throw new IllegalArgumentException("Invalid Courier Type");
		}

		// create target class object
		Flipkart fpkt = new Flipkart();

		// Assign dependent class object to target class
		fpkt.setCourier(courier);

		return fpkt;
	}

}
