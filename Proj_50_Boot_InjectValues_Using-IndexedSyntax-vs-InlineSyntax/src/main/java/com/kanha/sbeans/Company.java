package com.kanha.sbeans;

import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("company")
@ConfigurationProperties(prefix="emp.info")
public class Company {
	
		private Set<Long> phones;
		
		
		// Setters and Getters
		public Set<Long> getPhones() {
			return phones;
		}

		public void setPhones(Set<Long> phones) {
			this.phones = phones;
		}

		// toString
		@Override
		public String toString() {
			return "Company [phones=" + phones + "]";
		}
}
