package com.kanha.main;

import java.lang.reflect.Constructor;

public class ReflectionAPITest {

	public static void main(String[] args) throws Exception {
		
		// load the class
		Class c = Class.forName("com.kanha.singleton.Printer");
		
		// get all constructors of the loaded class
		Constructor cons[] = c.getDeclaredConstructors();
		
		// get access to private constructor
		cons[0].setAccessible(true);
		
		// Create objects
		Object obj1 = cons[0].newInstance();
		Object obj2 = cons[0].newInstance();
		
		// display the data
		System.out.println(obj1.getClass() + "  " + obj2.getClass());
		System.out.println(obj1.hashCode() + " " + obj2.hashCode());
		
	}
}
