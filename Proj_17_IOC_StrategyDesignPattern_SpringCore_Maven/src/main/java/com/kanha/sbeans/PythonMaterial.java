// Dependent Class
package com.kanha.sbeans;

import org.springframework.stereotype.Component;

@Component("python")
public final class PythonMaterial implements ICourseMaterial {

	@Override
	public void material() {
		System.out.println("Python Material");
	}

}
