package com.kanha.serviceImpl;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kanha.entity.Doctor;
import com.kanha.entity.Patient;
import com.kanha.repository.IDoctorRepository;
import com.kanha.repository.IPatientRepository;
import com.kanha.service.IHospitalMgmtService;


@Service
public class HospitalMgmtServiceImpl implements IHospitalMgmtService {
	@Autowired
	private  IDoctorRepository  doctorRepo;
	@Autowired
	private  IPatientRepository  patientRepo;

	@Override
	public String saveDoctorsAndPatients(List<Doctor> list) {
		//save the objects
		List<Doctor>  savedList=doctorRepo.saveAll(list);
		//gather only saved doctor id values
		List<Integer> ids=savedList.stream().map(Doctor::getDid).collect(Collectors.toList());
		return  ids.size()+" no.of doctors and their patients  are saved with id Values:: "+ids;
	}

	@Override
	public String savePatientsAndDoctors(List<Patient> list) {
		//save the objects
		List<Patient>  savedList=patientRepo.saveAll(list);
		//gather only  saved Patient id values
		List<Integer> ids=savedList.stream().map(Patient::getPatid).collect(Collectors.toList());
		return  ids.size()+" no.of Patients and their doctors  are saved with id Values:: "+ids;
	}
	
	@Override
	public List<Doctor> showAllDoctorsAndTheirPatients() {
		return doctorRepo.findAll();
	}
	
	@Override
	public List<Patient> showAllPatientsAndTheirDoctors() {
		return patientRepo.findAll();
	}
	
	@Override
	@Transactional
	public String removeCertainPatientsFromADoctor(int did, List<Integer> patIds) {
		Doctor  doctor=doctorRepo.findById(did).orElseThrow(()-> new IllegalArgumentException("Invalid Id"));
		List<Patient> patList=patientRepo.findAllById(patIds);
		if(patList.size()==0)
			throw new IllegalArgumentException("Patients are not avaiable");
		//get existing  patients of  a doctor
		Set<Patient>  set=doctor.getPatients();
		//remove  the recived patients
		set.removeAll(patList);
		//update the doctor
		doctorRepo.save(doctor);
		return patIds+" patients are  removed from "+did +" Doctor";
  	}

}
