package com.kanha.sbeans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MiniProjectTestRunner implements CommandLineRunner {

	@Autowired
	private StudentOperationsController controller;
	
	public MiniProjectTestRunner() {
		System.out.println("MiniProjectTestRunner.run()");
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("MiniProjectTestRunner.run()");
		
		try {
			List<Student> list = controller.processStudentDetails("Hyderabad", "Vizag", "Chennai");
			list.forEach(st -> {
				System.out.println(st);
			});
		}
		catch (Exception e) {
				e.printStackTrace();
		}
	}

}
