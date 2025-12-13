package com.kanha.sbeans;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Non-Option Arguments values:: " + args.getNonOptionArgs());
		
		System.out.println("Option Arguments names and values:: ");
		for (String name : args.getOptionNames()) {
			System.out.println(name + " ------> " + args.getOptionValues(name));
		}
	}

}
