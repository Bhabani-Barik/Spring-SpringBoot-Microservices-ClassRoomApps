package com.kanha.sbeans;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("company")
@ConfigurationProperties(prefix="org.nit")
public class Company {
	
	private Map<String, Object> idDetails;
	private License licenseDetails; // HAS-A property  // Spring Bean

	
	// Setter & Getters
	public Map<String, Object> getIdDetails() {
		return idDetails;
	}


	public void setIdDetails(Map<String, Object> idDetails) {
		this.idDetails = idDetails;
	}
	
	
	public License getLicenseDetails() {
		return licenseDetails;
	}


	public void setLicenseDetails(License licenseDetails) {
		this.licenseDetails = licenseDetails;
	}


	@Override
	public String toString() {
		return "Company [idDetails=" + idDetails + ", licenseDetails=" + licenseDetails + "]";
	}


	
	
	
}
