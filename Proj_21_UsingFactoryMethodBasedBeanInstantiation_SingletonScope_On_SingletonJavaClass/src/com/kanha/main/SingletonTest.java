package com.kanha.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kanha.configurations.AppConfiguration;
import com.kanha.singleton.Printer;

public class SingletonTest {
	
	public static void main(String[] args) {
		
		// Create IOC container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		// get  spring bean
		Printer p1 = context.getBean("printer1", Printer.class);
		Printer p2 = context.getBean("printer2", Printer.class);
		System.out.println(p1.hashCode() + " " + p2.hashCode());
		
		System.out.println("--------------------------------------");
		
		Printer p11 = context.getBean("printer1", Printer.class);
		Printer p12 = context.getBean("printer2", Printer.class);
		System.out.println(p11.hashCode() + " " + p12.hashCode());
		
	}

}
