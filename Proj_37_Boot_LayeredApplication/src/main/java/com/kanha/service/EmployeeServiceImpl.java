package com.kanha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanha.dao.IEmployeeDAO;
import com.kanha.model.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDAO empDAO; // HAS-A Property  // DAO Impl class object is injected
	
	@Override
	public List<Employee> fetchAllEmployeeByDegs(String designationOne, String designationTwo, String designationThree)
			throws Exception {
		
		// Convert the designation 	into UPPERCASE letters
		designationOne = designationOne.toUpperCase();
		designationTwo = designationTwo.toUpperCase();
		designationThree = designationThree.toUpperCase();
		
		// Use DAO
		List<Employee> list = empDAO.getEmployeeByDesignations(designationOne, designationTwo, designationThree);
		
		
		// Sort the object in List Collection
		list.sort((t1, t2) -> t1.getEno().compareTo(t2.getEno()));
		
		// Calculate gross salary  and net salary
		list.forEach(emp -> {
			emp.setGrossSalary(emp.getSalary() + (emp.getSalary() * 0.5));
			emp.setNetSalary(emp.getSalary()-(emp.getGrossSalary() * 0.2));
		});
		
		return list;
	}

}
