package com.kanha.dao;

import java.util.List;

import com.kanha.model.Hospitals;

public interface IHospitalsDAO {
	
	public List<Hospitals> getHospitalsDetailsByLocation(String locationOne, String locationTwo, String locationThree) throws Exception;
}
