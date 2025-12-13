package com.kanha.runners;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kanha.service.ICustomerMgmtService;

@Component
public class DateAndTimeTestRunner implements CommandLineRunner {
	@Autowired
	private ICustomerMgmtService  custService;

	@Override
	public void run(String... args) throws Exception {
		/*try {
			Customer cust=new Customer("suresh","delhi",51566.0,LocalDate.of(1990, 10, 20),
					                                                                                         LocalTime.of(20, 30),
					                                                                                         LocalDateTime.of(2016, 10,20,6,55));
			//use service
			String msg=custService.registerCustomer(cust);
			System.out.println(msg);
					                                                                                         
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*try {
			Customer  cust=custService.showCustomerByNo(100);
			System.out.println(cust);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		/*	try {
				custService.showAllCustomers().forEach(System.out::println);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		try {
			double age=custService.findCustomerAgeById(120);
			System.out.println("age::"+age);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("---------------------------------------");
			try {
				List<Object[]> list=custService.findCustomersNameAndAge();
				list.forEach(row->{
					System.out.println(Arrays.toString(row));
				});
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
		
	}

}
