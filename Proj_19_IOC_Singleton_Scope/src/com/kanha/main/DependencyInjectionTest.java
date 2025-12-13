package com.kanha.main;

import java.time.LocalDateTime;
import java.util.Arrays;

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
		
		System.out.println(generator1.hashCode() + " " + generator2.hashCode() + " " + generator3.hashCode()); // give the same hash code
		System.out.println("generator1 == generator2 ? " + (generator1 == generator2)); // true
		System.out.println("generator2 == generatoe3 ? " + (generator2 == generator3)); // true
		
		System.out.println("------------------------------------------");

		LocalDateTime localDateTime1 = ctx.getBean("localDateTime1", LocalDateTime.class);
		LocalDateTime localDateTime2 = ctx.getBean("localDateTime1", LocalDateTime.class);
		
		System.out.println(localDateTime1.hashCode() + " " + localDateTime2.hashCode()); // Gives the same hash code
		
		System.out.println("----------------------------------------------");
		
		LocalDateTime localDateTime3 = ctx.getBean("localDateTime1", LocalDateTime.class);
		LocalDateTime localDateTime4 = ctx.getBean("localDateTime1", LocalDateTime.class);
		
		System.out.println(localDateTime3.hashCode() + " " + localDateTime4	.hashCode()); // Gives the same hash code

		
		System.out.println("====================================================");
		
		System.out.println("All Bean ids count:: " + ctx.getBeanDefinitionCount());
		System.out.println("All Bean ids:: " + Arrays.toString(ctx.getBeanDefinitionNames()));
		
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
