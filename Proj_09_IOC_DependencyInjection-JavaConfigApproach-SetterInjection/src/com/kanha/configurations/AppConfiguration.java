package com.kanha.configurations;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.kanha.sbeans")
public class AppConfiguration {

	public AppConfiguration() {
		System.out.println("AppConfiguration:: 0-param constructor");
	}

	// Make Pre-defined class as Spring Bean
	@Bean(name = "lTime")
	public LocalTime createTime() {
		System.out.println("AppConfiguration.createTime()");
		return LocalTime.now();
	}

	@Bean(name = "lDate")
	public LocalDate createDate() {
		System.out.println("AppConfiguration.createDate()");
		return LocalDate.now();
	}

}
