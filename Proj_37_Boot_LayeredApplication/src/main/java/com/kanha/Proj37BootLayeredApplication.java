package com.kanha;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.kanha.controller.PayrollOperationsController;
import com.kanha.model.Employee;

@SpringBootApplication
public class Proj37BootLayeredApplication {

public static void main(String[] args) {
		
		// Get IOC container
		ApplicationContext context = SpringApplication.run(Proj37BootLayeredApplication.class, args);
	
		// Get Controller class object reference
		PayrollOperationsController controller = 
				context.getBean("payroll", PayrollOperationsController.class);	
		
		// Invoke Business Methods
		try {
			List<Employee> list = controller.showAllemployeeByDesgs("CLERK", "MANAGER", "SALESMAN");
			
			// Process the results
			list.forEach(emp -> {
				System.out.println(emp);
			});
		} // try
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Internal Problem. --- Try Again ----");
		}
		
		// Close the IOC container
		((ConfigurableApplicationContext) context).close();
	} // main
} // class // It's the end of the application


/*  Layered Application :: CURD Application Mini Project
 	======================================================
	Get Employee Details from the employee database table of oracle based on the given 3 designation.
	
	Used:
		Starter Dependency::
			- Jdbc API
			- Oracle Driver
			- Lombok
		
*/