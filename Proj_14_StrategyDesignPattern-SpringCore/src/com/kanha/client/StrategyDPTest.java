// Client Application
package com.kanha.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kanha.config.AppConfig;
import com.kanha.sbeans.Flipkart;

public class StrategyDPTest {
	public static void main(String[] args) {
		
		// create IOC container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// get target spring bean class object reference
		Flipkart fpkt = context.getBean("fpkt", Flipkart.class);
		
		// invoke the business method
		String resultMsg = fpkt.shopping(new String[] {"shirt", "trouser"}, new double[] {8900, 9900});
		System.out.println(resultMsg);
		
		// close the IOC container
		context.close();
	} // end main
} // end class
