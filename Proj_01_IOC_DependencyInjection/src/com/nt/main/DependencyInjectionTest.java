package com.nt.main;

import java.time.LocalDate;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		// create IOC container
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
				"src/com/nt/cfgs/applicationContext.xml");

		/*
		 * //get Spring bean class obj ref Object obj=ctx.getBean("wmg");
		 * 
		 * //typecasting WishMessageGenerator generator=(WishMessageGenerator)obj;
		 * 
		 * //invoke b.method String result=generator.showWishMessage("raja");
		 * System.out.println("Result ::"+result);
		 */

		System.out.println("========================");
		WishMessageGenerator generator1 = ctx.getBean("wmg", WishMessageGenerator.class);
		WishMessageGenerator generator2 = ctx.getBean("wmg", WishMessageGenerator.class);
		WishMessageGenerator generator3 = ctx.getBean("wmg", WishMessageGenerator.class);
		System.out.println(generator1.hashCode() + "   " + generator2.hashCode() + "  " + generator3.hashCode());
		System.out.println("========================");
		WishMessageGenerator generator11 = ctx.getBean("wmg1", WishMessageGenerator.class);
		WishMessageGenerator generator22 = ctx.getBean("wmg1", WishMessageGenerator.class);
		WishMessageGenerator generator33 = ctx.getBean("wmg1", WishMessageGenerator.class);
		System.out.println(generator11.hashCode() + "   " + generator22.hashCode() + "  " + generator33.hashCode());
		System.out.println("======================");
		LocalDate ldate = ctx.getBean("ldate", LocalDate.class);
		LocalDate ldate1 = ctx.getBean("ldate", LocalDate.class);
		System.out.println(ldate.hashCode() + "   " + ldate1.hashCode());

		// close IOCcontainer
		ctx.close();
	}

}
