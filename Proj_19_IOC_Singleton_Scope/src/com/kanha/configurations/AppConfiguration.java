package com.kanha.configurations;

import java.time.LocalDateTime;

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
	
	
	// Make Pre-defined class as Spring Bean
	@Bean(name="localDateTime1")
	@Scope("singleton")
	public LocalDateTime createTime() {
		System.out.println("AppConfiguration.createTime()");
		return LocalDateTime.now();
	}
	
	@Bean(name="localDateTime2")
	@Scope("singleton")
	public LocalDateTime createDate() {
		System.out.println("AppConfiguration.createDate()");
		return LocalDateTime.now();
	}

}
