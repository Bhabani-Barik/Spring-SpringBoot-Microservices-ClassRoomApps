package com.kanha.configurations;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.kanha.singleton.Printer;

@Configuration
@ComponentScan(basePackages="com.kanha.singleton")
public class AppConfiguration {
	
	public AppConfiguration() {
		System.out.println("AppConfiguration:: 0-param constructor");
	}
	
	@Bean(name="printer")
	@Scope("prototype")
	public Printer createPrinter() {
		System.out.println("AppConfiguration.createPrinter():: 1");
		return Printer.getInstance(); // Enable the static factory method bean instantiation for singleton  java class
		
/*
 		NOTE:: 
 			- Since we're configuring Printer class as the spring bean class using @Bean method.
 			  So, comment @Component Annotation in the Printer.java class
 */

	}

}
