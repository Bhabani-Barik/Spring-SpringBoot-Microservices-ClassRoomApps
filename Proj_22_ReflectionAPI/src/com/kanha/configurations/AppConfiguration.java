package com.kanha.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.kanha.singleton.Printer;

@Configuration
@ComponentScan(basePackages="com.kanha.sbeans")
public class AppConfiguration {
	
	public AppConfiguration() {
		System.out.println("AppConfiguration:: 0-param constructor");
	}
	
	
	@Bean(name="printer1")
	public Printer createPrinter1() {
		return Printer.getInstance();
	}

	
	@Bean(name="printer2")
	public Printer createPrinter2() {
		return Printer.getInstance();
	}
}
