package com.kanha.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kanha.entity.JobSeekerEntity;
import com.kanha.repository.IJobSeekerRepository;

@Component
public class FinderMethodsTestRunner implements CommandLineRunner {
	
	@Autowired private IJobSeekerRepository jobSeekerRepository;


	@Override
	public void run(String... args) throws Exception {

		
		List<JobSeekerEntity> list = jobSeekerRepository.findByJobseekerNameEquals("mahesh");
		
		list.forEach(System.out::println);
		
		
		System.out.println("---------------------");
		
		jobSeekerRepository.readByJobseekerNameIs("Sakshi").forEach(System.out::println);
		
		System.out.println("========================");
		
		jobSeekerRepository.getByJobseekerNameIs("Suman").forEach(System.out::println);
		
		System.out.println("=========================");
		
		jobSeekerRepository.findByJobseekerNameStartingWith("S").forEach(System.out::println);
		
		System.out.println("=========================");
		
		jobSeekerRepository.findByPercentageBetween(70.0, 80.0).forEach(System.out::println);
		
		System.out.println("===========================");
		
		jobSeekerRepository.findByJobseekerNameEndingWithIgnoreCase("i").forEach(System.out::println);
		
		System.out.println("==========================");
		
		jobSeekerRepository.findByJobseekerNameContainingIgnoreCase("k").forEach(System.out::println);
		
		System.out.println("============================");

		jobSeekerRepository.findByJobseekerNameLikeIgnoreCase("S%").forEach(System.out::println);
		
		System.out.println("===============================");
		
		jobSeekerRepository.findByJobseekerNameLikeIgnoreCase("%n").forEach(System.out::println);
		
		System.out.println("==============================");
		
		jobSeekerRepository.findByJobseekerNameLikeIgnoreCase("%sh").forEach(System.out::println);
		
		System.out.println("===================================");
		
		jobSeekerRepository.findByQualificationInOrderByQualificationAsc(List.of("B.Tech", "MCA")).forEach(System.out::println);
		
		System.out.println("====================================");
		
		jobSeekerRepository.readByMobileNumberIsNull().forEach(System.out::println);
		
	}

}

