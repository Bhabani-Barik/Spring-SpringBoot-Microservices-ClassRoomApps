package com.kanha.service;

import java.util.List;

import com.kanha.entity.Customer;

public interface ICustomerMgmtService {
	public String registerCustomer(Customer cust);

	public Customer showCustomerByNo(int no);

	public List<Customer> showAllCustomers();

	public double findCustomerAgeById(int id);

	public List<Object[]> findCustomersNameAndAge();
}
