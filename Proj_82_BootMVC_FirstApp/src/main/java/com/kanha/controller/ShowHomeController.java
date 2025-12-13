package com.kanha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController {

	// @RequestMapping("/")
	@RequestMapping("/home")
	public String showHome() {
		System.out.println("Hello");
		// return LVN (Logical View Name)
		return "welcome";
	}
}
