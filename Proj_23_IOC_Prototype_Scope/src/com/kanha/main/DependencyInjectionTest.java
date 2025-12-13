package com.kanha.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kanha.configurations.AppConfiguration;
import com.kanha.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	
	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main():: Start");
		
		// create IOC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		// get target spring bean class object reference from the IOC container
		WishMessageGenerator generator1 = ctx.getBean("wmg", WishMessageGenerator.class);
		WishMessageGenerator generator2 = ctx.getBean("wmg", WishMessageGenerator.class);
		WishMessageGenerator generator3 = ctx.getBean("wmg", WishMessageGenerator.class);
		
		System.out.println(generator1.hashCode() + " " + generator2.hashCode() +" "+ generator3.hashCode());
		System.out.println("generator1 == generator2 ? " + (generator1 == generator2));
		System.out.println("generator2 == generator3 ? " + (generator2 == generator3));
		
		
		// Close the IOC container
		ctx.close();
		
		System.out.println("DependencyInjectionTest.main():: End");
		
	}

}