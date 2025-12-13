package com.kanha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kanha.model.Employee;
import com.kanha.service.IEmployeeMgmtService;

@Controller("empController")
public class EmployeeOperationsController {

    @Autowired
	private  IEmployeeMgmtService  empService;
	
	
	public  List<Employee>   showEmployeesByDesgs(String desg1,String desg2,String desg3)throws Exception{
		System.out.println("EmployeeOperationsController.showEmployeesByDesgs()");
		//use  service
		List<Employee>  list=empService.fetchEmpsByDesgs(desg1, desg2, desg3);
		return list;
	}
	
	public  String    doRegisterEmployee(Employee emp)throws Exception {
	 System.out.println("EmployeeOperationsController.doRegisterEmployee()");	
	   //use service
	  String msg=empService.regsiterEmployee(emp);
	  return msg;
	}

}