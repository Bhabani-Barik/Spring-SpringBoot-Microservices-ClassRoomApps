package com.kanha.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kanha.entity.Politician;
import com.kanha.service.IPoliticianMgmtService;

@Component
public class InMemoryDBTestRunner implements CommandLineRunner {
	@Autowired
	private   IPoliticianMgmtService  politicianService;

	@Override
	public void run(String... args) throws Exception {
		
		try {
		//save object
		Politician  politician=new Politician("rajesh", "mumbai", 910000.0, "BJP", "galli", 50);
		String msg=politicianService.registerPolitiician(politician);
		System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("==========================");
		try {
			politicianService.showAllPoliticians().forEach(System.out::println);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("Press any  key to terminate the app");
		int ch=System.in.read();
		System.exit(0);
		
		
	}

}
