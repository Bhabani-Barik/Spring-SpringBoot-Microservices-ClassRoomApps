package com.kanha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.kanha.sbeans.Hotel;

@SpringBootApplication
public class Proj42BootValueAnnotationSpelApplication {

	public static void main(String[] args) {

		// Get IOC container
		ApplicationContext context = SpringApplication.run(Proj42BootValueAnnotationSpelApplication.class, args);

		// Get Target Spring bean class object reference
		Hotel hotel = context.getBean("hotel", Hotel.class);

		System.out.println(hotel);

		// close the IOC container
		((ConfigurableApplicationContext) context).close();
	}

}
