package com.kanha.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kanha.service.ISeasonFinderService;

@Controller
public class SeasonFinderOperationsController {
	@Autowired
	private  ISeasonFinderService  service;
	
	// handler method  for home page
	@GetMapping("/") // Default Handler method, when no request path is given then this method executes automatically.
	public  String showHomePage() {
		System.out.println("SeasonFinderOperationsController.showHomePage()");
		return "welcome";
	}
	
	@GetMapping("/season")
	public   String  showSeason(Map<String,Object> map) {
		System.out.println("SeasonFinderOperationsController.showSeason()");
		
		//use  service
		String msg=service.findSeason();
		
		//add result as model attribute in Shared memory
		map.put("resultMsg", msg);
		
		//return LVN
		return  "display";
	}
	
	
	// request path is case sensitive in the handler methods
	@GetMapping("/report")
	public String reportOne() {
		System.out.println("TestController.reportOne()");
		return "show_report1";
	}

	@GetMapping("/REPORT")
	public String reportTwo() {
		System.out.println("TestController.reportTwo()");
		return "show_report2";
	}
		
	
	
	
	// One Handler method can mapped with multiple requests
	@RequestMapping({"/report1","/report2","/report3"})
	public String showReport1() {
		System.out.println("SeasonFinderOperationsController.showReport1()");
		return "show_report1";
	}
	
	
	
	// If no request path is given or handler method, the default request path will be "/"
	// NOTE :: Taking request path as "/" is equal to not taking any request path
	@RequestMapping
	public String homePage() {
		return "welcome";
	}
	
	
	
	// NOTE :: If we place both multiple request paths on the handler method having on both GET and POST mode,
	// then first request path will be taken and other request paths will be ignored.
	@GetMapping("/report") // First Request will be taken
	@PostMapping("report") // Will be ignored
	public String showReport() {
		System.out.println("SeasonFinderOperationsController.showReport1()");
		return "show_report1";
	}
	
	
	
	
	// NOTE :: Two handler methods of controller class can have same request path having two request modes like GET, POST
	
	// In @RequestMapping annotation, if no mode is specified the default mode is GET
	// @RequestMapping(value="/report",method=RequestMethod.GET)
	@GetMapping("/report")
	public String report1() {
		System.out.println("SeasonFinderOperationsController.showReport1()");
		return "show_report1";
	}
	
	// @RequestMapping(value="/report",method=RequestMethod.POST)
	@GetMapping("/report")
	public String report2() {
		System.out.println("SeasonFinderOperationsController.showReport2()");
		return "show_report2";
	}
	
	
	// Redirection Method handler chaining
	@GetMapping("/report1")
	public  String  showReport2() {
	 System.out.println("SeasonFinderOperationsController.showReport1()");
		return  "redirect:/test/report";
	}
	
	
	/*
	 	NOTE:: 
	 	
	 		1. Forward request handler method chaining can be done across the multiple requests.
	 		2. Forward request mode of communication takes place directly from source to destination handler method.
	 		3. Redirection request mode of communication takes place from source to destination handler method, after having network round-trip with browser.
	 */
	
		

}