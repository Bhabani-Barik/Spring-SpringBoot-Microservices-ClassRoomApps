package com.kanha.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kanha.service.IHospitalMgmtService;

@Component
public class ManyToManyAssociationTestRunner implements CommandLineRunner {
	@Autowired
	private IHospitalMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		/*try {
			Doctor  doc1=new Doctor("raja", "hyd", "cardio");
			Doctor  doc2=new Doctor("suresh", "vizag", "cardio");
			Patient pat1=new Patient("suresh","vizag");
			Patient pat2=new Patient("karan","delhi");
			Patient pat3=new Patient("nagesh","hyd");
			
			//add patients  to doctors
			doc1.getPatients().add(pat1); doc1.getPatients().add(pat2); doc1.getPatients().add(pat3);
			doc2.getPatients().add(pat3); doc2.getPatients().add(pat2);
			// add doctors to patients
			pat1.getDoctors().add(doc1);  
			pat2.getDoctors().add(doc1); pat2.getDoctors().add(doc2);
			pat3.getDoctors().add(doc1); pat3.getDoctors().add(doc2);
			
			//invoke the service class method
			String msg=service.saveDoctorsAndPatients(Arrays.asList(doc1,doc2));
			System.out.println(msg);
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*	try {
				Doctor  doc1=new Doctor("raja1", "hyd", "cardio");
				Doctor  doc2=new Doctor("suresh1", "vizag", "cardio");
				Patient pat1=new Patient("suresh1","vizag");
				Patient pat2=new Patient("karan1","delhi");
				Patient pat3=new Patient("nagesh1","hyd");
				
				//add patients  to doctors
				doc1.getPatients().add(pat1); doc1.getPatients().add(pat2); doc1.getPatients().add(pat3);
				doc2.getPatients().add(pat3); doc2.getPatients().add(pat2);
				// add doctors to patients
				pat1.getDoctors().add(doc1);  
				pat2.getDoctors().add(doc1); pat2.getDoctors().add(doc2);
				pat3.getDoctors().add(doc1); pat3.getDoctors().add(doc2);
				
				//invoke the service class method
				String msg=service.savePatientsAndDoctors(Arrays.asList(pat1,pat2,pat3));
				System.out.println(msg);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		/*try {
			 service.showAllDoctorsAndTheirPatients().forEach(doc->{
				 System.out.println("Doctor::"+doc);
				 Set<Patient>  set=doc.getPatients();
				 set.forEach(pat->{
					 System.out.println("Patient::"+pat);
				 });
				 System.out.println("---------------------------");
			 });
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*	try {
				service.showAllPatientsAndTheirDoctors().forEach(pat->{
					System.out.println("patient ::"+pat);
					Set<Doctor>  set=pat.getDoctors();
					set.forEach(doc->{
						System.out.println("doctor::"+doc);
					});
					System.out.println("----------------------------");
				});
			}//try
				catch(Exception e) {
					e.printStackTrace();
				}*/
		
		try {
			String msg=service.removeCertainPatientsFromADoctor(1000, List.of(1,2));
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
		
				
	}//main
}//class
