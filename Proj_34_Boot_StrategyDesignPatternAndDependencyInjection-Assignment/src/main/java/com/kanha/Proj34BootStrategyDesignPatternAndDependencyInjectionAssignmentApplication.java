package com.kanha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.kanha.sbeans.Student;

@SpringBootApplication
public class Proj34BootStrategyDesignPatternAndDependencyInjectionAssignmentApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication
				.run(Proj34BootStrategyDesignPatternAndDependencyInjectionAssignmentApplication.class, args);

		// get the target sprin bean from the IOC container
		Student student = context.getBean("student", Student.class);

		// invoke the business methods
		student.prepare();

		// close the IOC container
		((ConfigurableApplicationContext) context).close();
	}

}
