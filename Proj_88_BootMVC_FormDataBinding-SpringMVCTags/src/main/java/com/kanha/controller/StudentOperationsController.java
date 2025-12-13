package com.kanha.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kanha.model.Student;

@Controller
public class StudentOperationsController {
	
	
	@GetMapping("/")
	public  String  showHomePage() {
		System.out.println("StudentOperationsController.showHomePage()");
		//return LVN
		return "welcome";
	}
	
	@GetMapping("/register")  //for  launching the form page
	public  String  showStudentRegistrationPage(@ModelAttribute Student st) {
		System.out.println("StudentOperationsController.showStudentRegistrationPage()");
		//return  LVN
		return "student_register_form";
	}
	
	@PostMapping("/register")  //for submitting the form page
	public  String  processStudentRegistration(@ModelAttribute Student st,
			                                                                      Map<String,Object> map) {
		System.out.println("StudentOperationsController.processStudentRegistration()::"+st);
		//write b.logic
		String result=null;
		if(st.getAvg()>=75)
			result="First Class with Dist";
		else if(st.getAvg()>=60)
			result="First Class ";
		else if(st.getAvg()>=50)
			result="Second class";
		else if(st.getAvg()>=35)
			result="Third class";
		else
			result="fail";
		//keep the result in model attribute
		map.put("resultMsg", result);
		//return LVN
		return "display";
	}

}
