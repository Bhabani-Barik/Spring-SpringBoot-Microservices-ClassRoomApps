package com.kanha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test") // Global Request Path
public class TestController {

	//@GetMapping("/report1")
	@GetMapping("/report")
	public   String showTestReport() {
		System.out.println("TestController.showTestReport()");
		return  "show_report2";
	}
	
	
	
	/*NOTE :: If two handler method of two different controller class having the same request and same request mode then will get "Ambigous Mapping" called IllegalStateException.
	To avoid these problem, along with the method level request paths provide the controller class level global path using @RequestMapping annotation.*/
	
	
	
}