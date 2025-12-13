package com.kanha.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kanha.serviceImpl.DoctorManagementServiceImpl;

@Component
public class JpaRepositoryRunnerTest implements CommandLineRunner{

	@Autowired
    private  DoctorManagementServiceImpl doctorService;

	@Override
	public void run(String... args) throws Exception {
	
		System.out.println(doctorService.deleteDoctorsByIdsInBatch(List.of(502, 503)));
		
		System.out.println(doctorService.deleteDoctorsByIdsInBatch(List.of(502, null))); // throws exception because List.of(-,-) does not allow null elements.
		
		System.out.println(doctorService.deleteDoctorsByIdsInBatch(Arrays.asList(502, null))); // Does not throw any exception

		
	}

}