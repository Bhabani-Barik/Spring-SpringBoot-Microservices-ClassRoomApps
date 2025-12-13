package com.kanha.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {

	@Autowired
	@Qualifier("javaMeterial")
	private IMaterial material; // HAS-A Property

	public Student() {
		System.out.println("Student:: 0-param constrctor");
	}
	
	// Business Methods
	public void prepare() {
		material.courseMaterial();
		System.out.println("Take this material and prepare for the interview." );
	}
	
}
