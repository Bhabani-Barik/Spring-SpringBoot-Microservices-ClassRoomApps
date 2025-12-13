package com.kanha.service;

import java.util.List;

import com.kanha.model.Hospitals;

public interface IHospitalService {
	
	public List<Hospitals> fetchALLHospitalsDetailsByLocation(	String locationOne,
																String locationTwo,
																String locationThree) throws Exception;

}
