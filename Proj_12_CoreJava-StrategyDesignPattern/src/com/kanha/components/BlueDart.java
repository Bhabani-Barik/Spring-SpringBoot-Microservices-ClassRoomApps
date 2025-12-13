// Dependent Class
package com.kanha.components;

public final class BlueDart implements Courier {

	@Override
	public String deliver(int orderID) {
		return orderID + " order items are kept for delivery by BlueDart.";
	}

}
