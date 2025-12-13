package com.kanha;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.kanha.sbeans.Employee;

@SpringBootApplication
public class Proj51BootConfigurationPropertiesOnArrayListSetHasAPropertiesApplication {

	public static void main(String[] args) {
		
		// To disable the banner of the spring boot app
		SpringApplication app = new SpringApplication(
				Proj51BootConfigurationPropertiesOnArrayListSetHasAPropertiesApplication.class);
		app.setBannerMode(Banner.Mode.OFF);

		// Get IOC container
		ApplicationContext context = app.run(args);

		// Get Target Spring Bean class from IOC container
		Employee employee = context.getBean("employee", Employee.class);

		System.out.println(employee);

		// close the IOC container
		((ConfigurableApplicationContext) context).close();
	}

}
