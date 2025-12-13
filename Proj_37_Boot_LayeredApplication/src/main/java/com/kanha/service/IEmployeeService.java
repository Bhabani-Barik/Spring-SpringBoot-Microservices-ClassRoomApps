package com.kanha.service;

import java.util.List;

import com.kanha.model.Employee;

public interface IEmployeeService {
	public List<Employee> fetchAllEmployeeByDegs(String designationOne,
												String designationTwo,
												String designationThree) throws Exception;

}
