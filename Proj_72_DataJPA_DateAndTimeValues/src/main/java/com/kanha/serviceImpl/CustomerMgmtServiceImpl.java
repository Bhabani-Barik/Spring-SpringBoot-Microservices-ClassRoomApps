package com.kanha.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanha.entity.Customer;
import com.kanha.repository.ICustomerRepository;
import com.kanha.service.ICustomerMgmtService;

@Service
public class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	@Autowired
	private  ICustomerRepository custRepo;

	@Override
	public String registerCustomer(Customer cust) {
		int idVal=custRepo.save(cust).getCno();
		return "Customer is registed with id value ::"+idVal;
	}
	
	@Override
	public Customer showCustomerByNo(int no) {
		return  custRepo.findById(no).orElseThrow(()->new IllegalArgumentException("Invalid Id"));
	}

	@Override
	public List<Customer> showAllCustomers() {
		return custRepo.findAll();
	}
	
	@Override
	public double findCustomerAgeById(int id) {
		
		return  custRepo.getCustomeAgeByNo(id);
	}
	
	@Override
	public List<Object[]> findCustomersNameAndAge() {
		return custRepo.showCustomersNameAndAge();
	}

}
