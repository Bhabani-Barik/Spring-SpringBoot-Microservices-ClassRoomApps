package com.kanha.configurations;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.kanha.singleton")
public class AppConfiguration {
	
	public AppConfiguration() {
		System.out.println("AppConfiguration:: 0-param constructor");
	}

}
