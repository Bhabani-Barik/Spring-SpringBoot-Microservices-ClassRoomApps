package com.kanha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.kanha.sbeans.Company;

@SpringBootApplication
public class Proj48BootInjectValuesArrayListSetSpringBeanPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication
				.run(Proj48BootInjectValuesArrayListSetSpringBeanPropertiesApplication.class, args);

		Company company = context.getBean("company", Company.class);

		System.out.println(company);
	}

}
