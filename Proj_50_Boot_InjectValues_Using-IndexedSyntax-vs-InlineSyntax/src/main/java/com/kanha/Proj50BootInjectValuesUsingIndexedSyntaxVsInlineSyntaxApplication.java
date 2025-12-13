package com.kanha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.kanha.sbeans.Company;

@SpringBootApplication
public class Proj50BootInjectValuesUsingIndexedSyntaxVsInlineSyntaxApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Proj50BootInjectValuesUsingIndexedSyntaxVsInlineSyntaxApplication.class, args);
		Company company = context.getBean("company", Company.class);
		System.out.println(company);
	}

}
