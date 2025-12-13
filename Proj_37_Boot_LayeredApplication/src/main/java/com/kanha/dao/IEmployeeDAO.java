package com.kanha.dao;

import java.util.List;

import com.kanha.model.Employee;

public interface IEmployeeDAO {
	public List<Employee> getEmployeeByDesignations(String designationOne, String designationTwo, String designationThree) throws Exception;

}
