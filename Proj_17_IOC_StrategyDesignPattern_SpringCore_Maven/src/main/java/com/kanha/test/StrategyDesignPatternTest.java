package com.kanha.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kanha.configs.AppConfig;
import com.kanha.sbeans.Student;

public class StrategyDesignPatternTest {

	public static void main(String[] args) {
		
		// IOC container Creation
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// get the target spring bean class object from the IOC container
		Student student = context.getBean("student", Student.class);
		
		// Invoke the Business Method
		student.preparation();
		
		// close the IOC container
		context.close();
	}
}
