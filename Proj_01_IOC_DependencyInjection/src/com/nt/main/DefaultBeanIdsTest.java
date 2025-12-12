package com.nt.main;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DefaultBeanIdsTest {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/nt/cfgs/applicationContext.xml")) {

			System.out.println("bean ids ::" + Arrays.toString(ctx.getBeanDefinitionNames()));

		}

	}

}
