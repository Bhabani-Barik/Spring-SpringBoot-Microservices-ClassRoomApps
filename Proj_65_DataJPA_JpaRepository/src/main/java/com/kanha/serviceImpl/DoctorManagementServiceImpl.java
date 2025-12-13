package com.kanha.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.kanha.entity.DoctorEntity;
import com.kanha.repository.IDoctorRepository;
import com.kanha.service.IDoctorService;

@Service("doctorService")
public class DoctorManagementServiceImpl implements IDoctorService {

	@Autowired 
	private IDoctorRepository doctorRepository;

	@Override
	public String deleteDoctorsByIdsInBatch(List<Integer> ids) {

		// Load the entities
		List<DoctorEntity> list = doctorRepository.findAll();
		
		// Delete the entities
		doctorRepository.deleteAllByIdInBatch(ids);
		return list.size() + " records are deleted";
	}

	@Override
	public List<DoctorEntity> showDoctorsByExampleData(DoctorEntity exDoctor, boolean ascOrder, String properties) {
		
		// Prepare sort object
		Sort sort = Sort.by(ascOrder ? Direction.ASC : Direction.DESC, properties);
		
		// Example Object
		Example example = Example.of(exDoctor);
		
		// Use the Repo
		List<DoctorEntity>list = doctorRepository.findAll(example, sort);
		
		return list;
	}

	@Override
	public DoctorEntity findDoctorById(Integer id) {
		
		// DoctorEntity doctor = doctorRepository.getById(id);
		DoctorEntity doctor = doctorRepository.getReferenceById(id);
		return doctor;
	}
	
	
}
