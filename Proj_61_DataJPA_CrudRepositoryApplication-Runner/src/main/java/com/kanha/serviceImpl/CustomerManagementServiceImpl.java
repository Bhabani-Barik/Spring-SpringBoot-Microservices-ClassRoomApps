package com.kanha.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanha.entity.CustomerEntity;
import com.kanha.repository.ICustomerRepository;
import com.kanha.service.ICustomerService;

@Service("doctorService")
public class CustomerManagementServiceImpl implements ICustomerService {

	@Autowired 
	private ICustomerRepository customerRepository;
	
	@Override
	public String registerCustomer(CustomerEntity customer) {
		System.out.println("Customer ID(Before save:: " + customer.getCustomerID());
		CustomerEntity addDoctor = customerRepository.save(customer);
		return "Customer object is saved with ID value : " + addDoctor.getCustomerID();
	}

	@Override
	public boolean isCustomerAvailable(Integer id) {
		//use repo
		boolean flag = customerRepository.existsById(id);
		return flag;
	}

	@Override
	public String updateCustomerAddress(int cno, String newAddress) {
		//Load the customer
		Optional<CustomerEntity> opt = customerRepository.findById(cno);
		if (opt.isPresent()) {
			//get the customer object from the Optional object 
			CustomerEntity customer = opt.get();
			customer.setCustomerAddress(newAddress);
			customerRepository.save(customer);
			return cno + " customer address is updated";
		}
		return cno + " customer id is not found for updation";
	}

}
