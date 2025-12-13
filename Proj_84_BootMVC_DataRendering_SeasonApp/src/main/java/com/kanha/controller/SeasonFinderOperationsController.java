package com.kanha.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.kanha.service.ISeasonFinderService;

@Controller
public class SeasonFinderOperationsController {
	@Autowired
	private  ISeasonFinderService  service;
	
	// handler method  for home page
	@GetMapping("/")
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

}