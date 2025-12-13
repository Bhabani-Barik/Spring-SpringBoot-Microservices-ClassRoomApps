package com.kanha;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import com.kanha.controller.PayrollOperationsController;
import com.kanha.model.Employee;
import com.mchange.v2.c3p0.ComboPooledDataSource;

@SpringBootApplication
public class Proj55BootSpringBootProfilesApplication {

	@Autowired
	private Environment env;

	@Bean(name = "c3P0Ds")
	@Profile("test")
	public ComboPooledDataSource createC3P0Ds() throws Exception {
		ComboPooledDataSource cds = new ComboPooledDataSource();
		cds.setDriverClass(env.getProperty("spring.datasource.driver-class-name"));
		cds.setJdbcUrl(env.getProperty("spring.datasource.url"));
		cds.setUser(env.getProperty("spring.datasource.username"));
		cds.setPassword(env.getProperty("spring.datasource.password"));

		cds.setMinPoolSize(Integer.parseInt(env.getProperty("c3p0.minSize")));
		cds.setMaxPoolSize(Integer.parseInt(env.getProperty("c3p0.maxSize")));

		return cds;
	}

	public static void main(String[] args) {
		// Get IOC container
		ApplicationContext context = SpringApplication.run(Proj55BootSpringBootProfilesApplication.class, args);

		// Get Controller class object reference
		PayrollOperationsController controller = context.getBean("payroll", PayrollOperationsController.class);

		// Get Environment Object
		Environment env = context.getEnvironment();
		System.out.println("Active Profile:: " + Arrays.toString(env.getActiveProfiles()));

		// Invoke Business Methods
		try {
			List<Employee> list = controller.showAllemployeeByDesgs("CLERK", "MANAGER", "SALESMAN");

			// Process the results
			list.forEach(emp -> {
				System.out.println(emp);
			});
		} // try
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Internal Problem. --- Try Again ----");
		}

		// Close the IOC container
		((ConfigurableApplicationContext) context).close();
	} // main
} // class // It's the end of the application

/*
 * Layered Application :: CURD Application Mini Project
 * ====================================================== Get Employee Details
 * from the employee database table of oracle based on the given 3 designation.
 * 
 * Used: Starter Dependency:: - Jdbc API - Oracle Driver - Lombok
 * 
 */
