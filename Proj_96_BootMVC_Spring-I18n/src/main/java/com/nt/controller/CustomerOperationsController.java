package com.nt.controller;

import java.util.Date;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.nt.model.Customer;

@Controller
public class CustomerOperationsController {
	
	@GetMapping("/")
	public  String showHome(Map<String,Object> map) {
		//add model  attributes
		  map.put("sysDate", new Date());
		  map.put("price",new Random().nextInt(100000005));
		  map.put("distance", new Random().nextInt(45454667));
		  map.put("avg", 0.57);
		  
		//return LVN
		return "welcome";
	}
	
	@GetMapping("/register")
	public   String  showCustomerRegistrationFormPage(@ModelAttribute("cust") Customer cust) {
		//return LVN
		return "customer_register";
	}

}
