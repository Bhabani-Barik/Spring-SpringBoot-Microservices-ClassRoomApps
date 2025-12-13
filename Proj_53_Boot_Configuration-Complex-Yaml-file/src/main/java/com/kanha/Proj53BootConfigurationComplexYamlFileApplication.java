package com.kanha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.kanha.sbeans.Employee;

@SpringBootApplication
public class Proj53BootConfigurationComplexYamlFileApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Proj53BootConfigurationComplexYamlFileApplication.class,
				args);
		Employee employee = context.getBean("employee", Employee.class);

		System.out.println(employee);
	}

}
