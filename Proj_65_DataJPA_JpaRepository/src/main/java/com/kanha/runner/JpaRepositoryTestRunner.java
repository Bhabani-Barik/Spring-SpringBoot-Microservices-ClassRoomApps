package com.kanha.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.kanha.entity.DoctorEntity;
import com.kanha.service.IDoctorService;

public class JpaRepositoryTestRunner implements CommandLineRunner {

	@Autowired IDoctorService service;
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(service.deleteDoctorsByIdsInBatch(List.of(678, 901)));
		System.out.println(service.deleteDoctorsByIdsInBatch(List.of(678, null))); // throws Exception because List.of(-,-) does not allow null elements.
		System.out.println(service.deleteDoctorsByIdsInBatch(Arrays.asList(16, null))); // Does not throw any exception
	
	
	
		System.out.println("====================== findAll() =====================");
	
		DoctorEntity doctor = new DoctorEntity();
		
		doctor.setSpecialization("cardio");
		doctor.setIncome(9000000.0);
		service.showDoctorsByExampleData(doctor, true, "income").forEach(System.out::println);
		
		
		System.out.println("================= getReferenceById() ====================");
		
		System.out.println(service.findDoctorById(5674));
	}

}
