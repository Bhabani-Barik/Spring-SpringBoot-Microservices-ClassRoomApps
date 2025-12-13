package com.kanha.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {
	
	@Bean(name="messageSource") // messageSource is the fixed bean id
	public ResourceBundleMessageSource createRBMS() {
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasename("com/kanha/commons/App");
		return source;
	}

}
