package com.kanha.service;

import java.util.List;

import com.kanha.entity.Employee;

public interface IEmployeeMgmtService {
	public String registerEmployee(Employee emp);

	public List<Employee> showEmployees();
}
