package com.kanha.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kanha.service.IPoliticianMgmtService;

@Component
public class PL_SQLProcedureTestRunner implements CommandLineRunner {
	@Autowired
	private IPoliticianMgmtService  politicianService;

	@Override
	public void run(String... args) throws Exception {
		try {
			String result=politicianService.login("raja", "rani1");
			System.out.println("result ::"+result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}//main

}//class