package com.kanha.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kanha.configs.AppConfig;
import com.kanha.sbeans.Vehicle;


public class StrategyDesignPatternTest {
	public static void main(String[] args) {
		
		// Create the IOC container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// get the target spring bean class object from the IOC container
		Vehicle vehicle = context.getBean("vehicle", Vehicle.class);
		
		//Invoke the business method
		vehicle.journey("Hyderabad", "Goa");
		
		// close the IOC container
		context.close();
	} // end main()

} // end class