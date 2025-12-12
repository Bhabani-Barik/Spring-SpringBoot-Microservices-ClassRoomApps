package com.kanha.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.kanha.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	
	public DependencyInjectionTest() {
		
	}

	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main():: Start");
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/kanha/configurations/applicationContext.xml");
		Object obj = ctx.getBean("wmg");
		WishMessageGenerator generator = (WishMessageGenerator) obj;
		String result = generator.generateWishMessage("Shwetapurna");
		System.out.println(result);
		ctx.close();
		System.out.println("DependencyInjectionTest.main():: End");
	}
}
