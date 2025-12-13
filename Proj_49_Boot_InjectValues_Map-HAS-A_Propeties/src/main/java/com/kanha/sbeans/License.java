package com.kanha.sbeans;

import org.springframework.stereotype.Component;

@Component("license")

public class License {
	
	private Integer lid;
	private String type;
	private String issuedBy;
	
	
	public Integer getLid() {
		return lid;
	}
	public void setLid(Integer lid) {
		this.lid = lid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getIssuedBy() {
		return issuedBy;
	}
	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}
	
	
	@Override
	public String toString() {
		return "License [lid=" + lid + ", type=" + type + ", issuedBy=" + issuedBy + "]";
	}
	
	
	
	

}
