package com.kanha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.kanha.sbeans.Vehicle;

@SpringBootApplication
public class Proj35BootDependencyInjectionLooseCouplingApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Proj35BootDependencyInjectionLooseCouplingApplication.class,
				args);

		// get the target spring bean class object from the IOC container
		Vehicle vehicle = context.getBean("vehicle", Vehicle.class);

		// Invoke the business method
		vehicle.journey("Hyderabad", "Goa");

		// close the IOC container
		((ConfigurableApplicationContext) context).close();

	}

}
