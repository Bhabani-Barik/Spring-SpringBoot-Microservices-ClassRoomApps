package com.kanha.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("company")
@ConfigurationProperties(prefix="org.nit")
public class Company {
	
	private String name;
	private String address;
	private Long pincode;
	private long contact;
	
	
	// Setters & Getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	
	
	@Override
	public String toString() {
		return "Company [name=" + name + ", address=" + address + ", pincode=" + pincode + ", contact=" + contact + "]";
	}
	
	
	/*
	 	NOTE::
	 	=> If the specified common prefix of @ConfigurationProperties is not there for the keys of the properties file then we need use @Value annotation for single value injection.
	 	=> Common Prefix is mandatory for keys in the properties file and that prefix must be specified in @ConfigurationProperties annotation.
	 	=> The keys (after prefix) in properties file and the property names in spring bean class must be match.
	 	=> here, setter injection takes place, setter methods are mandatory to place.
	 	=> We can not place multiple prefixes in @ConfigurationProperties annotation of single spring bean class.
	 	=> We can not use this for injecting system properties value, environment variable values and SPEL.
	 	
	 */
	
	

}
