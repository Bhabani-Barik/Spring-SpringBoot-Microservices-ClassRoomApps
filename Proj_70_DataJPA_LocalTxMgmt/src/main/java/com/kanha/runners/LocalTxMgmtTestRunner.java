package com.kanha.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kanha.service.IBankMgmtService;

@Component
public class LocalTxMgmtTestRunner implements CommandLineRunner {
	@Autowired
	private  IBankMgmtService  bankService;

	@Override
	public void run(String... args) throws Exception {
		try {
			String msg=bankService.transferMoney(1001, 1012, 2000.0);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}