package com.kanha.sbeans;

import org.springframework.stereotype.Component;

@Component("javaMeterial")
public class JavaCourseMaterial implements IMaterial {
	
	public JavaCourseMaterial() {
		System.out.println("JavaCourseMaterial:: 0-param constructor");
	}

	@Override
	public void courseMaterial() {
		System.out.println("Java Course Material.");
	}

}
