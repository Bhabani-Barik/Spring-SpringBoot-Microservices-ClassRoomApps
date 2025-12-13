package com.kanha.controller;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.kanha.model.Customer;

@Controller
public class CustomerOperationsController {
	
	
	// passing different kind of data from controller components to view component using data rendering technique.
	
	@GetMapping("/report")
	public   String showReport(Map<String,Object> map) {
		
		//add model attributes (simple values) in shared memory
		map.put("name", "raja");
		map.put("age", new Random().nextInt(30));  // Here simple value will be converted into wrapper object,means primitive value  becomes Integer value.
		
		//  add model attributes  (arrays, collections) in shared memory
		map.put("favColors", new String[] {"red","green","yellow"});
		map.put("friends",List.of("raja","rajesh","suresh"));
		map.put("phones",Set.of(9999999,888888888,777777777));
		map.put("idDetails",Map.of("aadhar",545455,"pan",4545454));
		
		//  keep model class object as the model attribute in shared memory
		Customer cust=new Customer(1001,"raja","hyd",78900.0);
		map.put("custData",cust);
		
		//keep   List of Customers [Collection of Model class object] info  as the model attribute in shared memory
		Customer cust1=new Customer(1001,"raja","hyd",78900.0);
		Customer cust2=new Customer(1002,"rajesh","hyd",71900.0);
		Customer cust3=new Customer(1003,"suresh","vizag",73900.0);
		List<Customer> custList=List.of(cust1,cust2,cust3);
		map.put("custList", custList);
		
		//return LVN
		return "show_report";
		
		
	}

}