package com.kanha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.kanha.sbeans.Cricketer;

@SpringBootApplication
public class Proj36BootSolvingAmbiguityProblemLooseCouplingApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication
				.run(Proj36BootSolvingAmbiguityProblemLooseCouplingApplication.class, args);

		Cricketer cricketer = context.getBean("cricketer", Cricketer.class);

		String msg = cricketer.batting();

		System.out.println(msg);

		((ConfigurableApplicationContext) context).close();
	}

}
