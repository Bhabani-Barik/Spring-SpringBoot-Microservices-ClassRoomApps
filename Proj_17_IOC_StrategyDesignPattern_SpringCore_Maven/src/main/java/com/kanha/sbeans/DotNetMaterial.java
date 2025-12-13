// Dependent Class
package com.kanha.sbeans;

import org.springframework.stereotype.Component;

@Component("dotNet")
public final class DotNetMaterial implements ICourseMaterial {

	@Override
	public void material() {
		System.out.println("DotNet Material");
	}

}
