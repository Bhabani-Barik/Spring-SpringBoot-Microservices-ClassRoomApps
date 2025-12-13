package com.kanha.sbeans;

import org.springframework.stereotype.Component;

@Component("phpMaterial")
public class PhpCourseMaterial implements IMaterial {

	public PhpCourseMaterial() {
		System.out.println("PhpCourseMaterial:: 0-param constructor");
	}
	
	@Override
	public void courseMaterial() {
		System.out.println("PHP Course Material");
	}

}
