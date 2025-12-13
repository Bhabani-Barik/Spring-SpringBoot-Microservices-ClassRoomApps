package com.kanha.service;

import com.kanha.entity.CustomerEntity;

public interface ICustomerService {
	public String registerCustomer(CustomerEntity doctor);
	public boolean isCustomerAvailable(Integer id);
	public String updateCustomerAddress(int cno, String newAddress);
}