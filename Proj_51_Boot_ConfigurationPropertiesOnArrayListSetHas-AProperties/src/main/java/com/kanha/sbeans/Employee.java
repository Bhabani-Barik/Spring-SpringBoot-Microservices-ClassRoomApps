package com.kanha.sbeans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("employee")
@ConfigurationProperties(prefix = "org.nit")
public class Employee {

	// simple properties
	private Integer eno;
	private String ename;

	// Array type
	private String[] favColors;

	// Collection type
	private List<String> nickName;
	private Set<Long> phoneNumbers;
	private Map<String, Object> idDetails;

	// HAS-A property
	private Company company;

	// Setters and Getters
	public Integer getEno() {
		return eno;
	}

	public void setEno(Integer eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String[] getFavColors() {
		return favColors;
	}

	public void setFavColors(String[] favColors) {
		this.favColors = favColors;
	}

	public List<String> getNickName() {
		return nickName;
	}

	public void setNickName(List<String> nickName) {
		this.nickName = nickName;
	}

	public Set<Long> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Set<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public Map<String, Object> getIdDetails() {
		return idDetails;
	}

	public void setIdDetails(Map<String, Object> idDetails) {
		this.idDetails = idDetails;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	// toString()
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", favColors=" + Arrays.toString(favColors) + ", nickName="
				+ nickName + ", phoneNumbers=" + phoneNumbers + ", idDetails=" + idDetails + ", company=" + company
				+ "]";
	}

}
