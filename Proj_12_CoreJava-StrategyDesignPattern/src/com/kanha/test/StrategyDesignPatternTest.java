package com.kanha.test;

import com.kanha.components.Flipkart;
import com.kanha.factory.FlipkartFactory;

public class StrategyDesignPatternTest {
	public static void main(String[] args) {
		
		// Use Factory pattern to get target class object
		Flipkart fpkt = FlipkartFactory.getInstance("ekart");
		
		// Invoke the business method
		String resultMsg = fpkt.shopping(new String[] {"shirt", "trouser"}, new double[] {5000.0 ,6000.0});
		System.out.println(resultMsg);
	} // main

} // class
