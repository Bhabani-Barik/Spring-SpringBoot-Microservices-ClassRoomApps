package com.kanha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.kanha.sbeans.Customer;

@SpringBootApplication
public class Proj52BootConfigurationYamlFileApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Proj52BootConfigurationYamlFileApplication.class, args);
		Customer customer = context.getBean("customer", Customer.class);
		System.out.println(customer);
	}

}
