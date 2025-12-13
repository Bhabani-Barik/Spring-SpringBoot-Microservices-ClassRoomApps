package com.kanha.runners;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.kanha.entity.JobSeeker;
import com.kanha.service.IJobSeekerMgmtService;

//@Component
public class JobSeekerTestRunner implements CommandLineRunner {
	@Autowired
	private IJobSeekerMgmtService jsService;

	@Override
	public void run(String... args) throws Exception {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			// read inputs
			System.out.println("enter  Job Seeker name::");
			String name = sc.next();
			System.out.println("enter job seeker  address::");
			String addrs = sc.next();
			System.out.println("enter marital status ::");
			
			boolean flag = sc.nextBoolean();
			
			System.out.println("Enter  photo path ::");
			String photoPath = sc.next();
			System.out.println("Enter  resume path ::");
			String resumePath = sc.next();
			
			// get byte[] from the photo content
			File file = new File(photoPath);
			byte[] phtoContent = new byte[(int) file.length()];
			
			try (FileInputStream fis = new FileInputStream(photoPath)) {
				phtoContent = fis.readAllBytes();
			}
			
			// get char[] from resume content
			File file1 = new File(resumePath);
			char[] resumeContent = new char[(int) file1.length()];
			
			try (FileReader reader = new FileReader(resumePath)) {
				reader.read(resumeContent);
			}
			
			// create JobSeeker object
			JobSeeker js = new JobSeeker();
			js.setJsname(name);
			js.setJsaddrs(addrs);
			js.setMaritalStatus(flag);
			js.setPhoto(phtoContent);
			js.setResume(resumeContent);
			
			// invoke the b.method
			String msg = jsService.registerJobSeeker(js);
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// main

}// class
