package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.ston.Printer;

public class SpringBeanScopesTest {
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nt/cfgs/applicationContext.xml")) {
			// get spring bean class obj ref
			Printer p1 = ctx.getBean("prn1", Printer.class);
			Printer p11 = ctx.getBean("prn1", Printer.class);
			System.out.println(p1.hashCode() + "  " + p11.hashCode());

			/*
			 * Printer p2=ctx.getBean("prn2",Printer.class); Printer
			 * p12=ctx.getBean("prn2",Printer.class);
			 * System.out.println(p1.hashCode()+"  "+p11.hashCode());
			 * System.out.println("----------------------------");
			 * System.out.println(p2.hashCode()+"....."+p12.hashCode());
			 */

		}

	}
}
