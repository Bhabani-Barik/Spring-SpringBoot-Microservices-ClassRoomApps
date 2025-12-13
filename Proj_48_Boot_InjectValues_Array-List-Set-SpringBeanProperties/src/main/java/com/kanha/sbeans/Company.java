package com.kanha.sbeans;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("company")
@ConfigurationProperties(prefix="org.nit")
public class Company {

	private String[] branches;
	private List<String> owners;
	private Set<Long> phones;
	
	//Getter & Setters
	public String[] getBranches() {
		return branches;
	}
	public void setBranches(String[] branches) {
		this.branches = branches;
	}
	public List<String> getOwners() {
		return owners;
	}
	public void setOwners(List<String> owners) {
		this.owners = owners;
	}
	public Set<Long> getPhones() {
		return phones;
	}
	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}
	
	@Override
	public String toString() {
		return "Company [branches=" + Arrays.toString(branches) + ", owners=" + owners + ", phones=" + phones + "]";
	}	
}
