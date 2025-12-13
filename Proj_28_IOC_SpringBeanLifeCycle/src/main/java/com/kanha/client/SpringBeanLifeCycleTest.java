package com.kanha.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kanha.config.AppConfig;
import com.kanha.sbeans.CheckingVotingEligibility;

public class SpringBeanLifeCycleTest {
	
	public static void main(String[] args) {
		
		// Create IOC container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// get target spring bean class object reference
		CheckingVotingEligibility voter = ctx.getBean("voter", CheckingVotingEligibility.class);
		
		// Invoke business methods
		try {
			String result = voter.checkEligibilit();
			System.out.println(result);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// close the IOC container
		ctx.close();
	} // end main
} // end class
