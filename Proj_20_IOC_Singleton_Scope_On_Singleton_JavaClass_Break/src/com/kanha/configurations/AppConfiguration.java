package com.kanha.configurations;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="com.kanha.sbeans")
public class AppConfiguration {
	
	public AppConfiguration() {
		System.out.println("AppConfiguration:: 0-param constructor");
	}
	
	/*
	 NOTE:: If we configure normal java class as multiple spring beans with different bean ids having
	 		singleton scope then the IOC container creates multiple objects for spring bean  class w.r.t beans ids.
	 */
	
	
	// Make Pre-defined class as Spring Bean
	@Bean(name="date1")
	@Scope("singleton")
	public Date createDate1() {
		System.out.println("AppConfiguration.createDate():: 1");
		return new Date();
	}
	
	@Bean(name="date2")
	@Scope("singleton")
	public Date createDate2() {
		System.out.println("AppConfiguration.createDate():: 2");
		return new Date();
	}

}
