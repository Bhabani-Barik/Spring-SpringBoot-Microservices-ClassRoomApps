package com.kanha.main;


import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kanha.configurations.AppConfiguration;
import com.kanha.singleton.Printer;

public class DependencyInjectionTest {
	
	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main():: Start");
		
		// create IOC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		// get target spring bean class object reference from the IOC container
		Printer p1 = ctx.getBean("printer", Printer.class);
		Printer p2 = ctx.getBean("printer", Printer.class);
		System.out.println(p1.hashCode() + " " + p2.hashCode()); // Gives same hash code,
			// Because the singleton java class is getting instantiated through static factory method where the singleton logic available.
		
		System.out.println("============================================================");
		
		// IOC container maintains lots of information about the  spring beans  that are being maintained
		// to get that information, we can call various methods  using IOC container object.
		System.out.println("Spring Bean Definitions count:: " + ctx.getBeanDefinitionCount());
		System.out.println("Spring Bean IDs:: " + Arrays.toString(ctx.getBeanDefinitionNames()));
		
		
		// Close the IOC container
		ctx.close();
		
		System.out.println("DependencyInjectionTest.main():: End");
		
	}

}


