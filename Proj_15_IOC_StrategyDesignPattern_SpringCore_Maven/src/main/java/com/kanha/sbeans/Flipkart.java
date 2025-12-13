package com.kanha.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("flipkart")
public final class Flipkart {
	
	// Field Injection
	@Autowired
	@Qualifier("dtdc")
	private ICourier courier; // HAS-A property
	
	
	public String shopping (String items[], double prices[]) {
		
		// calculate bill Amount
		 double billAmount = 0.0;
		 
		 for (double price : prices) {
			 billAmount = billAmount + price;
		 }
		 
		 // generate the order id (random number as the order)
		 int orderID = new Random().nextInt(1000000000);
		 
		 // Deliver the products using courier
		 String msg = courier.deliver(orderID);
		 
		 return Arrays.toString(items) + " Items with billAmount:: " + billAmount + "...." + msg;
	}

}
