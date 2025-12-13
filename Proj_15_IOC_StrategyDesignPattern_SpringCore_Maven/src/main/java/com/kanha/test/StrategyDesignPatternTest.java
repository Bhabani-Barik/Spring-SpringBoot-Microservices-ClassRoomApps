package com.kanha.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kanha.configs.AppConfig;
import com.kanha.sbeans.Flipkart;

public class StrategyDesignPatternTest {
	public static void main(String[] args) {
		
		// Create the IOC container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// get the target spring bean class object from the IOC container
		Flipkart fpkt = context.getBean("flipkart", Flipkart.class);
		
		//Invoke the business method
		String resultMsg = fpkt.shopping(new String[] {"shirt", "trouser"}, new double[] {6500.00, 7659.90 });
		System.out.println(resultMsg);
		
		// close the IOC container
		context.close();
	} // end main()

} // end class