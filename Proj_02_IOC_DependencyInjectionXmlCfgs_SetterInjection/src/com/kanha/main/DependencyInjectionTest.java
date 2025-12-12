package com.kanha.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.kanha.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main():: Start");

		// create IOC container
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/kanha/configurations/applicationContext.xml");

		// get target spring bean class object ref from the IOC container
		Object obj = ctx.getBean("wmg");

		// TypeCasting
		WishMessageGenerator generator = (WishMessageGenerator) obj;

		// Invoke business method
		String result = generator.generateWishMessage("Muna");

		System.out.println(result);

		// Close the IOC container
		ctx.close();

		System.out.println("DependencyInjectionTest.main():: End");

	}
}
