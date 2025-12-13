package com.kanha;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.kanha.sbeans.WishMessageGenerator;

@SpringBootApplication
public class Proj31BootDependencyInjectionAssignement1Application {

	@Bean(name = "locaTime")
	public LocalTime createDate() {
		return LocalTime.now();
	}

	public static void main(String[] args) {
		SpringApplication.run(Proj31BootDependencyInjectionAssignement1Application.class, args);

		// Get IOC container
		ApplicationContext context = SpringApplication.run(Proj31BootDependencyInjectionAssignement1Application.class,
				args);

		// Get Target Spring Bean Class Object
		WishMessageGenerator wmg = context.getBean("wmg", WishMessageGenerator.class);

		// Invoke the Business Methods
		String wishMsg = wmg.wishMessage("Armaan");

		System.out.println("Hey! " + wishMsg);

		// Close the IOC container
		((ConfigurableApplicationContext) context).close();
	}

}
