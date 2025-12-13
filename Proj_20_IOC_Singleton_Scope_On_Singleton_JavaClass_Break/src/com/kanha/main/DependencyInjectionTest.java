package com.kanha.main;


import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kanha.configurations.AppConfiguration;

public class DependencyInjectionTest {
	
	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main():: Start");
		
		// create IOC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		// get target spring bean class object reference from the IOC container
		Date dt1  = ctx.getBean("date1", Date.class);
		Date dt2  = ctx.getBean("date1", Date.class);
		System.out.println(dt1.hashCode() + " " + dt2.hashCode());
		
		System.out.println("=====================================");
		
		Date dt11  =  ctx.getBean("date2", Date.class);
		Date dt12  =  ctx.getBean("date2", Date.class);
		System.out.println(dt11.hashCode() + " " + dt12.hashCode());
		
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
