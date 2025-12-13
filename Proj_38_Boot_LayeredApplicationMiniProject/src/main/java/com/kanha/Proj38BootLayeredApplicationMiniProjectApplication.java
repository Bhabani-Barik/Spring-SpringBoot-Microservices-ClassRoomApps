package com.kanha;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.kanha.controller.HospitalsOperationController;
import com.kanha.model.Hospitals;

@SpringBootApplication
public class Proj38BootLayeredApplicationMiniProjectApplication {

	public static void main(String[] args) {

		// Get IOC container
		ApplicationContext context = SpringApplication.run(Proj38BootLayeredApplicationMiniProjectApplication.class,
				args);

		// Get Controller class object reference
		HospitalsOperationController controller = context.getBean("hospitalControl",
				HospitalsOperationController.class);

		// Invoke Business Methods
		try {
			List<Hospitals> list = controller.showAllHospitalsByLocation("Bhubaneswar", "Balasore", "Cuttack");

			// Process the results
			list.forEach(hospital -> {
				System.out.println(hospital);
			});
		} // try
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Internal Problem. --- Try Again ----");
		}

		// Close the IOC container
		((ConfigurableApplicationContext) context).close();
	}

}
