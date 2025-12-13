package com.kanha.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart {
	
	@Autowired
	@Qualifier("ekart")
	private ICourier courier; // HAS-A property
	
	public Flipkart() {
		System.out.println("Flipkart:: 0-param constructor.");
	}

	// Business Methods
	public String shopping(String items[], double prices[]) {
		System.out.println("Flipkart.shopping()");
		
		// calculate bill amount
		double billAmount = 0.0;
		
		for (double price : prices) {
			billAmount = billAmount + price;
		}
		
		// generate order id randomly
		int orderID = new Random().nextInt(100000);
		
		// deliver the order using courier
		String msg = courier.deliver(orderID);
		
		return Arrays.toString(items) + " are shopped having bill amount " + billAmount + " --> " + msg; 
		
	}
	
}
