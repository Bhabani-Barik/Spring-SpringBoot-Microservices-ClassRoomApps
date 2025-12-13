package com.kanha.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.kanha.entity.DoctorEntity;
import com.kanha.service.IDoctorService;

@Component
public class PagingAndSortingRepositoryRunnerTest implements CommandLineRunner{
	
	@Autowired
	private IDoctorService service;

	@Override
	public void run(String... args) throws Exception {
		service.showDoctorsBySorting(true, "doctorName").forEach(System.out::println);
		
		System.out.println("-------------------------");
		
		service.showDoctorsBySorting(true, "income", "doctorName").forEach(System.out::println);;
		
		
		System.out.println("------findAll(Pageable pageable)--------- ");
		
		try {
			// service.showDoctorsInfoByPageNo(1, 3, true, "doctorName").forEach(System.out::println);
			
			Page<DoctorEntity> page = service.showDoctorsInfoByPageNo(2, 3, false, "doctorName");
			
			System.out.println("page number :: " + page.getNumber());
			System.out.println("page count :: " + page.getTotalPages());
			System.out.println("Is it firstPage :: " + page.isFirst());
			System.out.println("Is it lastPage :: " + page.isLast());
			System.out.println("page size :: " + page.getSize());
			System.out.println("page Elements count :: " + page.getNumberOfElements());
			
			if (!page.isEmpty()) {
				List<DoctorEntity> content = page.getContent();
				content.forEach(System.out::println);
			} else {
				System.out.println("No page found");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}