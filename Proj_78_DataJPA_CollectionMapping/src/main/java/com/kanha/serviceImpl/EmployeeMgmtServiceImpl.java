package com.kanha.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanha.entity.Employee;
import com.kanha.repository.IEmployeeRepository;
import com.kanha.service.IEmployeeMgmtService;

@Service
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private  IEmployeeRepository  empRepo;

	@Override
	public String registerEmployee(Employee emp) {
		 //use repo
		int idVal=empRepo.save(emp).getEmpno();
		return "Employee is saved with id Value:"+idVal;
	}

	@Override
	public List<Employee> showEmployees() {
		return empRepo.findAll();
	}

}