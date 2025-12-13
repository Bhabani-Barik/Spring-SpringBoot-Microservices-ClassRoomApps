// Dependent class
package com.kanha.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dtdc")
@Lazy(true)
public final class DTDC implements ICourier {
	
	public DTDC() {
		System.out.println("DTDC::0-prarm constructor");
	}

	@Override
	public String deliver(int orderID) {
		return "DTDC courier is ready to deliver " + orderID + " order number products.";
	}

}
