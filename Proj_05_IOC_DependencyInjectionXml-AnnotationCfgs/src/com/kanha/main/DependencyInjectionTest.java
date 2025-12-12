package com.kanha.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kanha.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main():: Start");

		// create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/kanha/configurations/applicationContext.xml");

		// get target spring bean class object ref from the IOC container
		Object obj = ctx.getBean("wmg");

		// TypeCasting
		WishMessageGenerator generator = (WishMessageGenerator) obj;

		// Invoke business method
		String result = generator.generateWishMessage("Armaan");

		System.out.println(result);

		// Close the IOC container
		ctx.close();

		System.out.println("DependencyInjectionTest.main():: End");

	}

}

/*
 * Q: If we enable both setter injection and constructor injection on target
 * spring bean property having two different sets of values. Can you tell us,
 * which value will be injected as the final value?
 * 
 * Answer: Setter injection value override the value injected by constructor
 * injection.
 * 
 */
