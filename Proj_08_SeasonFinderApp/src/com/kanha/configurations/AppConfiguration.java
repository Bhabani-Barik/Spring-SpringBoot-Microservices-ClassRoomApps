package com.kanha.configurations;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.kanha.sbeans")
public class AppConfiguration {

	public AppConfiguration() {
		System.out.println("AppConfig:: 0-parameter constructor");
	}

	// Make predefined class as the Spring Bean
	@Bean(name = "lDate")
	public LocalDate createDate() {
		System.out.println("AppConfig.createDate()");
		return LocalDate.now();
	}
}
