package com.kanha.runners;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kanha.service.ICollegeMgmtService;

@Component
public class AssociationMappingTestRunner implements CommandLineRunner {
	@Autowired
	private  ICollegeMgmtService  clgService;

	@Override
	public void run(String... args) throws Exception {
		/*  //parent to child
		List<Object[]> list=clgService.fetchCollegeAndStudentsData();
		list.forEach(row->{
		System.out.println(Arrays.toString(row));
		});
		*/
		// child to parent
		List<Object[]>  list=clgService.fetchStudentsAndCollegesData();
		list.forEach(row->{
			System.out.println(Arrays.toString(row));
		});
		
	}//main

}//class
