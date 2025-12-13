package com.kanha.dao;

import java.util.List;

import com.kanha.model.Employee;

public interface IEmployeeDAO {
	   public  List<Employee>  getEmpsByDesgs(String desg1,String desg2,String desg3)throws Exception;
	   public   int    insert(Employee emp)throws Exception;
	}

