// Dependent class
package com.kanha.components;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("ekart")
@Lazy(true)
public final class Ekart implements ICourier {
	
	public Ekart() {
		System.out.println("Ekart:: 0-param constructor.");
	}

	@Override
	public String deliver(int orderID) {
		return "Ekart courier is ready to deliver " + orderID + " order number products";
	}

}
