package com.kanha.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kanha.entity.Politician;
import com.kanha.service.IPoliticianMgmtService;

@Component
public class PL_SQLProcedureTestRunner implements CommandLineRunner {
	@Autowired
	private IPoliticianMgmtService  politicianService;

	@Override
	public void run(String... args) throws Exception {
		try {
			List<Politician>  list=politicianService.showPolicitiansByIncomeRange(4000.0, 120000.0);
			list.forEach(System.out::println);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
