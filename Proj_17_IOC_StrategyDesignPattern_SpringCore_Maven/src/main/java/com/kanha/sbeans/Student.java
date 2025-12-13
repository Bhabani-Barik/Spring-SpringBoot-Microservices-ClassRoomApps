// Target Class
package com.kanha.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("student")
public final class Student {
	
	@Autowired
	@Qualifier("java")
	private ICourseMaterial courseMaterial; // HAS-A property
	
	
	// Business Method
	public void preparation() {
		System.out.println("Student.preparation()");
		courseMaterial.material();
		
	}

}
