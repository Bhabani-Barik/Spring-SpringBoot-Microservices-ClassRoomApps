package com.nt;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class BootMvcProj15MiniProjectI18nApplication {
	
	@Bean(name="localeResolver")
	public  SessionLocaleResolver  createResolver() {
		SessionLocaleResolver resolver=new SessionLocaleResolver();
		resolver.setDefaultLocale(Locale.of("en", "US"));
		return resolver;
	}
	
	@Bean(name="lci")
	public  LocaleChangeInterceptor   createLCI() {
		LocaleChangeInterceptor lci=new LocaleChangeInterceptor();
		lci.setParamName("lang");
		return lci;
	}

	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj15MiniProjectI18nApplication.class, args);
	}

}
