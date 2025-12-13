package com.kanha;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.kanha.sbeans.SeasonFinder;

@SpringBootApplication
public class Proj30BootDependencyInjectionApplication {

	@Bean(name = "localDate")
	public LocalDate createDate() {
		return LocalDate.now();
	}

	public static void main(String[] args) {

		// Get IOC container
		ApplicationContext context = SpringApplication.run(Proj30BootDependencyInjectionApplication.class, args);

		// Get Target Spring Bean Class Object
		SeasonFinder finder = context.getBean("seasonFinder", SeasonFinder.class);

		// Invoke the Business Methods
		String seasonName = finder.findSeason();

		System.out.println("Season Name:: " + seasonName);

		// Close the IOC container
		((ConfigurableApplicationContext) context).close();
	}

}
