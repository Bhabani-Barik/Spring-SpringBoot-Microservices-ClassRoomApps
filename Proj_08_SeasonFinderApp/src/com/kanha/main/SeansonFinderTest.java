package com.kanha.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kanha.configurations.AppConfiguration;
import com.kanha.sbeans.SeasonFinder;

public class SeansonFinderTest {
	public static void main(String[] args) {

		System.out.println("SeansonFinderTest.main():: Start");

		// Create IOC Container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

		// get target spring bean class object reference from IOC container
		Object obj = context.getBean("seasonFinder");

		// TypeCasting
		SeasonFinder sFind = (SeasonFinder) obj;

		// invoke business methods
		String result = sFind.findCurrentSeason();

		System.out.println(result);

		// close the IOC container
		context.close();
	}
}
