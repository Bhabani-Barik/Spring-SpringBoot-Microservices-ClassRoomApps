package com.kanha.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanha.entity.DoctorEntity;
import com.kanha.repository.IDoctorRepository;
import com.kanha.service.IDoctorService;

@Service("doctorService")
public class DoctorManagementServiceImpl implements IDoctorService {

	@Autowired 
	private IDoctorRepository doctorRepository;
	
	@Override
	public String registerDoctor(DoctorEntity doctor) {
		System.out.println("Doctor ID(Before save:: " + doctor.getDoctorID());
		DoctorEntity addDoctor = doctorRepository.save(doctor);
		return "Doctor object is saved with ID value : " + addDoctor.getDoctorID();
	}

	@Override
	public long showDoctorsCount() {
		long count = doctorRepository.count();
		return count;
	}

	@Override
	public Iterable<DoctorEntity> showAllDoctor() {
		return doctorRepository.findAll();
	}

	@Override
	public Iterable<DoctorEntity> showAllDoctorsByIds(Iterable<Integer> ids) {
		return doctorRepository.findAllById(ids);
	}

	
	// Best way to write
	/*	@Override
		public DoctorEntity showDoctorById(Integer id) {
			DoctorEntity doctor = doctorRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Doctor ID Not Found!"));
					
			return doctor;
		}*/

	// or 
	
	public DoctorEntity showDoctorById(Integer id) {
		
		Optional<DoctorEntity> opt = doctorRepository.findById(id);
		
		if (opt.isPresent()) {
			return opt.get();		
		} else {
			throw new IllegalArgumentException("Doctor Id Not Found.");
		}
	}

	// or
	
	/*@Override
	public DoctorEntity showDoctorById(Integer id) {
	
		DoctorEntity dutyDoctor = new DoctorEntity();
		dutyDoctor.setSpecialization("dutyDoctor");
		DoctorEntity doctor = doctorRepository.findById(id).orElse(dutyDoctor);
		
		return doctor;
	}*/	

	@Override
	public String deleteDoctorById(Integer id) {
		
		// Load the object
		Optional<DoctorEntity> opt = doctorRepository.findById(id);
		if (opt.isPresent()) {
			doctorRepository.deleteById(id);
			return id + " Doctor id is deleted";
		} else {
			return id + " Doctor id not found for deletion";
		}
	}

	@Override
	public String removeAlldoctors() {
		long count = doctorRepository.count();
		if (count > 0) {
			doctorRepository.deleteAll();
			return  count + " number of records are deleted.";
		}
		return "no records found to be delete";
	}
}
