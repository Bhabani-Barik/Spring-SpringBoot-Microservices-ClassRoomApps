package com.kanha.runners;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kanha.entity.Employee;
import com.kanha.service.IEmployeeMgmtService;

@Component
public class CollectionMappingTestRunner implements CommandLineRunner {
	@Autowired
	private IEmployeeMgmtService empService;

	@Override
	public void run(String... args) throws Exception {
		try {
			Employee emp = new Employee("raja1", "hyd",
					List.of("rajesh1", "suresh1", "mahesh1"),
					Set.of(9999999999L, 888888888L, 777777777L),
					Map.of("aadhar", "4545455", "pan", "5454545", "voterid", "4454545"));
			
			String msg = empService.registerEmployee(emp);
			System.out.println(msg);

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			empService.showEmployees().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
