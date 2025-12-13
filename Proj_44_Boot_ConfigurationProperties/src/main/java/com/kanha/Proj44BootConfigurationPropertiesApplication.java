package com.kanha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.kanha.sbeans.Company;

@SpringBootApplication
public class Proj44BootConfigurationPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Proj44BootConfigurationPropertiesApplication.class, args);

		Company company = context.getBean("company", Company.class);

		System.out.println(company);
	}

}
/*
NOTE:: 
	=> While doing bulk injection using the support of @ConfigurationProperties, if one or few properties of spring bean are not injected
	with values collected from the	 properties file because the names are not matched then we can go for @Value annotation for that single value annotation.

*/