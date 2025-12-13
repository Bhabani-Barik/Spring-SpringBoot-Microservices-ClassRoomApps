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
		Object obj = ctx.getBean("wmg");
		
		// TypeCasting
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		
		// Invoke business method
		String result = generator.generateWishMessage("Tonny Stark");
		
		System.out.println(result);
		
		// Close the IOC container
		ctx.close();
		
		System.out.println("DependencyInjectionTest.main():: End");
		
	}

}

/* 
 	Q: If we enable	both setter injection and constructor injection on target spring bean property having two different sets of values.
 		Can you tell us, which value will be injected as the final value?
 		
 		Answer: Setter injection value override the value injected by constructor injection.
 
 */
