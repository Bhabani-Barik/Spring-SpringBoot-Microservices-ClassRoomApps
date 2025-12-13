package com.kanha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kanha.model.Employee;
import com.kanha.service.IEmployeeService;

@Controller("payroll")
public class PayrollOperationsController {
	
	@Autowired
	private IEmployeeService empService; // HAS-A Property  // Service Impl class object is injected

	public List<Employee> showAllemployeeByDesgs(String designationOne,
														String designationTwo,
														String designationThree) throws Exception {
		
		// use service
		List<Employee> list  = empService.fetchAllEmployeeByDegs(designationOne, designationTwo, designationThree);
		return list;
	} // method
} // class
