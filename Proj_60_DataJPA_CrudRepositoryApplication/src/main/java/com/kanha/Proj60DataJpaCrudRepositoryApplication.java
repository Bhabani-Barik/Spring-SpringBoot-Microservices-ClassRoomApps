package com.kanha;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.kanha.entity.DoctorEntity;
import com.kanha.service.IDoctorService;

@SpringBootApplication
public class Proj60DataJpaCrudRepositoryApplication {

	public static void main(String[] args) {
		
		// get IOC container
		ApplicationContext ctx = SpringApplication.run(Proj60DataJpaCrudRepositoryApplication.class, args);

		// get service class object
		IDoctorService service = ctx.getBean("doctorService", IDoctorService.class);

		try {
			// create DoctorEntity class Object
			DoctorEntity doctor = new DoctorEntity();
			doctor.setDoctorName("Bhabani");
			doctor.setSpecialization("surgeon");
			doctor.setIncome(893450.0);

			// invoke business method
			String resultMsg = service.registerDoctor(doctor);
			System.out.println(resultMsg);

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("----- Count Operation ---------");
		try {
			System.out.println("Doctors count: " + service.showDoctorsCount());
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("------ findALl() operation --------");
		try {
			Iterable<DoctorEntity> it = service.showAllDoctor();

			it.forEach(doctor -> {
				System.out.println(doctor);
			}); // Java 8 forEach()

			System.out.println("-----------------------------------");

			it.forEach(doctor -> System.out.println(doctor)); // Improved forEach() method of Java 8

			System.out.println("------------------------------------");

			it.forEach(System.out::println); // Java 8 forEach() + static method reference

			System.out.println("--------------------------------------");

			for (DoctorEntity doctor : it) {
				System.out.println(doctor); // Java 5 enhanced for loop
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("------- findAllByIds() operation---------------------");
		try {
			service.showAllDoctorsByIds(List.of(1, 2, 52, 53, 102, 103)).forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("-------findById() operation ---------");
		try {
			DoctorEntity doctorId = service.showDoctorById(20);
			System.out.println(doctorId);

		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}

		System.out.println("------------Delete Operation ------");
		try {
			System.out.println(service.deleteDoctorById(752));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("------------ deleteAll() operation-------");
		try {
			System.out.println(service.removeAlldoctors());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// close the IOC container
		((ConfigurableApplicationContext) ctx).close();

	}

}
