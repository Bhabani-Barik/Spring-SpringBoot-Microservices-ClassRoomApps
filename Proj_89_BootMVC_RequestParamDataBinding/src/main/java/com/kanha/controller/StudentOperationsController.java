package com.kanha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentOperationsController {
	
	
	/*@GetMapping("/data")
	public  String  process(@RequestParam("sno") int no,
			                                    @RequestParam("sname") String name) {
		System.out.println("StudentOperationsController.process()");
		System.out.println(no+"......"+name);
		//return LVN
		return "show_result";
	}*/
	
	/*@GetMapping("/data")
	public  String  process(@RequestParam(required = false) Integer sno,
			                                    @RequestParam(required = false,defaultValue = "RRR") String sname) {
		System.out.println("StudentOperationsController.process()");
		System.out.println(sno+"......"+sname);
		//return LVN
		return "show_result";
	}*/
	
	/*	@GetMapping("/data")
		public  String  process(@RequestParam Integer sno,
				                                    @RequestParam String sname,
				                                    @RequestParam String[] sadd,
				                                    @RequestParam(name="sadd") List<String> saddList,
				                                    @RequestParam(name="sadd")  Set<String> saddSet) {
			System.out.println("StudentOperationsController.process()");
			System.out.println(sno+"......"+sname+"...."+Arrays.toString(sadd)+"..."+saddList+"...."+saddSet);
			//return LVN
			return "show_result";
		}*/
	
	@GetMapping("/data")
	public  String  process(@RequestParam Integer sno,
			                                    @RequestParam String sname,
			                                    @RequestParam String sadd) {
		System.out.println("StudentOperationsController.process()");
		System.out.println(sno+"......"+sname+"...."+sadd);
		//return LVN
		return "show_result";
	}
	

}
