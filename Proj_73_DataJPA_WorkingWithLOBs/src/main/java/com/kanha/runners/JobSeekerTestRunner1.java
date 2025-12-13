package com.kanha.runners;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kanha.entity.JobSeeker;
import com.kanha.service.IJobSeekerMgmtService;

@Component
public class JobSeekerTestRunner1 implements CommandLineRunner {
	@Autowired
	private IJobSeekerMgmtService jsService;

	@Override
	public void run(String... args) throws Exception {
		try (Scanner sc = new Scanner(System.in)) {
			
			// read inputs
			System.out.println("enter  Job seeker Id::");
			int jsid = sc.nextInt();
			
			// invoe the method
			JobSeeker js = jsService.findJobSeekerById(jsid);
			System.out.println(js.getJsid() + "....." + js.getJsname() + "....." + js.getJsaddrs());
			byte[] photoContent = js.getPhoto();
			char[] resumeContent = js.getResume();
			
			// create Photo file having byte[] content
			try (FileOutputStream fos = new FileOutputStream("retrive_photo.jpeg")) {
				fos.write(photoContent);
				fos.flush();
			}
			
			System.out.println("Photo is retrieved");

			try (FileWriter writer = new FileWriter("retrieve_resume.txt")) {
				writer.write(resumeContent);
				writer.flush();
			}
			
			System.out.println("resumt is retrieved");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}// main

}// class
