package com.kanha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.kanha.sbeans.PatientInfo;

@SpringBootApplication
public class Proj43BootDataInjectionUsingValueAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Proj43BootDataInjectionUsingValueAnnotationApplication.class,
				args);

		// get target spring class object reference
		PatientInfo info = context.getBean("pInfo", PatientInfo.class);

		System.out.println(info);

		// close the IOC container
		((ConfigurableApplicationContext) context).close();
	}

}
