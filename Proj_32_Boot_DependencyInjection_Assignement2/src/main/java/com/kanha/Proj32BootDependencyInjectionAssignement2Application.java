package com.kanha;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.kanha.sbeans.WishMessageGenerator;

@SpringBootApplication
public class Proj32BootDependencyInjectionAssignement2Application {

	@Bean(name = "locaDate")
	public LocalDate createDate() {
		return LocalDate.now();
	}

	public static void main(String[] args) {

		// Get IOC container
		ApplicationContext context = SpringApplication.run(Proj32BootDependencyInjectionAssignement2Application.class,
				args);

		// Get Target Spring Bean Class Object
		WishMessageGenerator wmg = context.getBean("wmg", WishMessageGenerator.class);

		// Invoke the Business Methods
		wmg.wishMessage();

		// Close the IOC container
		((ConfigurableApplicationContext) context).close();
	}

}
