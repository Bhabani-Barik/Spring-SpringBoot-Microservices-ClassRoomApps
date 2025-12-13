package com.kanha.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements ICourier {

	@Override
	public String deliver(int orderID) {
		return orderID + " order items are kept for delivery by DTDC.";
	}

}
