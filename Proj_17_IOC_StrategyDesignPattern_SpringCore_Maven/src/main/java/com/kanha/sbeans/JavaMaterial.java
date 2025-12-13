// Dependent Class
package com.kanha.sbeans;

import org.springframework.stereotype.Component;

@Component("java")
public final class JavaMaterial implements ICourseMaterial{

	@Override
	public void material() {
		System.out.println("Java Material");
	}

}
