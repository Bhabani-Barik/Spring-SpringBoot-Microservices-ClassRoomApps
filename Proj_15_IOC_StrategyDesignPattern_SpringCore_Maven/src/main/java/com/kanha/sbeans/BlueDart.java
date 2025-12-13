// Dependent Class
package com.kanha.sbeans;

import org.springframework.stereotype.Component;

@Component("blueDart")
public final class BlueDart implements ICourier {

	@Override
	public String deliver(int orderID) {
		return orderID + " oder items are kept for delivery by BlueDart..";
	}
	
}
