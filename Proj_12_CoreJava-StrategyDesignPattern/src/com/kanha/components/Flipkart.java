// Target class
package com.kanha.components;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {

	private Courier courier; // HAS-A property

	// Setter Method
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}

	// Business Method
	public String shopping(String items[], double prices[]) {

		// Calculate Bill Amount
		double billAmount = 0.0;

		for (double price : prices) {
			billAmount = billAmount + price;
		}

		// Generate the order ID (Random Number as the order ID)
		int orderID = new Random().nextInt();

		// Deliver the Products using courier
		String msg = courier.deliver(orderID);

		return Arrays.toString(items) + " items with billAmount ::: " + billAmount + "-----" + msg;
	}

}
