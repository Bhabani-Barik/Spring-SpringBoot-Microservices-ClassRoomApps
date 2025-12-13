package com.kanha.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kanha.service.IBankMgmtService;

@Component
public class VersionAndTimestampTestRunner implements CommandLineRunner {
	@Autowired
	private  IBankMgmtService  bankService;

	@Override
	public void run(String... args) throws Exception {
			try {
				String msg=bankService.transferMoney(10000063, 10000064, 2000.0);
				System.out.println(msg);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
		/*try {
			BankAccount  account=new BankAccount();
			account.setHodlername("suresh"); account.setBalance(50000.0);
			//invoke the b.method
			String msg=bankService.openAccount(account);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
			
		
			/*try {
				String msg=bankService.withdraw(10000063,5000.0);
				System.out.println(msg);
				BankAccount account=bankService.showAccountDetails(10000063);
				System.out.println("Bank account is  modified for "+account.getUpdateCount()+" times  and last modiffied at::"+account.getUpdationTme());
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
			
			/*try {
				String msg=bankService.deposite(10000063,7000.0);
				System.out.println(msg);
				BankAccount account=bankService.showAccountDetails(10000063);
				System.out.println("Bank account is  modified for "+account.getUpdateCount()+" times  and last modiffied at::"+account.getUpdationTme());
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
			
	}

}
