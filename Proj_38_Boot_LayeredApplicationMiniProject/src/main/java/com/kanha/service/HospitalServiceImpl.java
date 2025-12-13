package com.kanha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanha.dao.IHospitalsDAO;
import com.kanha.model.Hospitals;

@Service("hospitalService")
public class HospitalServiceImpl implements IHospitalService {

	@Autowired
	private IHospitalsDAO hospitalDAO; // // HAS-A Property // DAO Impl class object is injected

	@Override
	public List<Hospitals> fetchALLHospitalsDetailsByLocation(String locationOne, String locationTwo,
			String locationThree) throws Exception {

		// Convert the designation into UPPERCASE letters
		locationOne = locationOne.toUpperCase();
		locationTwo = locationTwo.toUpperCase();
		locationThree = locationThree.toUpperCase();

		// Use DAO
		List<Hospitals> list = hospitalDAO.getHospitalsDetailsByLocation(locationOne, locationTwo, locationThree);

		// Sort the object in List Collection
		list.sort((t1, t2) -> t1.getId().compareTo(t2.getId()));

		return list;
	}

}
