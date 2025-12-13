package com.kanha.service;

import java.util.List;

import com.kanha.entity.Doctor;
import com.kanha.entity.Patient;

public interface IHospitalMgmtService {
	public String saveDoctorsAndPatients(List<Doctor> list);

	public String savePatientsAndDoctors(List<Patient> list);

	public List<Doctor> showAllDoctorsAndTheirPatients();

	public List<Patient> showAllPatientsAndTheirDoctors();

	public String removeCertainPatientsFromADoctor(int did, List<Integer> patIds);

}