package com.kanha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.kanha.sbeans.Customer;

@SpringBootApplication
public class Proj54BootConfigurationUserDefinedYamlFileApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Proj54BootConfigurationUserDefinedYamlFileApplication.class,
				args);

		Customer customer = context.getBean("customer", Customer.class);

		System.out.println(customer);
	}

}
