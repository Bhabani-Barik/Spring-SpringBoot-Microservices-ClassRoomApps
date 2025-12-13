package com.kanha.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kanha.entity.CustomerEntity;
import com.kanha.service.ICustomerService;

@Component
public class CrudRepositoryTestRunner  implements CommandLineRunner{

	@Autowired
	ICustomerService service;
	
	@Override
	public void run(String... args) throws Exception {
		
		CustomerEntity customer1 = new CustomerEntity();
		customer1.setCustomerName("Kristen Musk");
		customer1.setCustomerAddress("USA");
		customer1.setBillAmount(99995996.0);
		String msg1 = service.registerCustomer(customer1);
		System.out.println(msg1);
		
		try {
			boolean flag = service.isCustomerAvailable(101);
			if(flag) {
				System.out.println("Customer Available.");
			} else {
				System.out.println("Customer Not Available");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			String msg = service.updateCustomerAddress(107, "Mumbai");
			System.out.println(msg);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
