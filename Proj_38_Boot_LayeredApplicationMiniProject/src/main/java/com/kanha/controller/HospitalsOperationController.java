package com.kanha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kanha.model.Hospitals;
import com.kanha.service.IHospitalService;

@Controller("hospitalControl")
public class HospitalsOperationController {

	@Autowired
	private IHospitalService hospitalService; // HAS-A Property  // Service Impl class object is injected

	public List<Hospitals> showAllHospitalsByLocation(String locationOne,
														String locationTwo,
														String locationThree) throws Exception {
		
		// use service
		List<Hospitals> list  = hospitalService.fetchALLHospitalsDetailsByLocation(locationOne, locationTwo, locationThree);
		return list;
	}// method

} // class