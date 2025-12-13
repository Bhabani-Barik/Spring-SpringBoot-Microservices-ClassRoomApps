// Dependent class
package com.kanha.components;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("blueDart")
@Lazy(true)
public final class BlueDart implements ICourier {
	
	public BlueDart() {
		System.out.println("BlueDart:: 0-param constructor");
	}

	@Override
	public String deliver(int orderID) {
		return "BlueDart courier is ready to deliver " + orderID + " order number products." ;
	}

}
