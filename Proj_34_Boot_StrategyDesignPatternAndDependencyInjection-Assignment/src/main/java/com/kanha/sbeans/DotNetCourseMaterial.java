package com.kanha.sbeans;

import org.springframework.stereotype.Component;

@Component("dotnetMaterial")
public class DotNetCourseMaterial implements IMaterial {
	
	public DotNetCourseMaterial() {
		System.out.println("DotNetCourseMaterial:: 0-param constructor");
	}

	@Override
	public void courseMaterial() {
		System.out.println("DotNetCourseMaterial:: 0-param constructor");
	}

}
