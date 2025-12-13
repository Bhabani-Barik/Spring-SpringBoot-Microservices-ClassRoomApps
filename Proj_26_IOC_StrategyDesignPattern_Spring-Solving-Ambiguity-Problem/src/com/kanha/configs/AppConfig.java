// Configuration class
package com.kanha.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration	
@ComponentScan(basePackages="com.kanha.components")
@ImportResource("com/kanha/xmlconfigs/applicationContext.xml") // Linking the spring bean file with the configuration class.
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig:: 0-param constructor");
	}

}
