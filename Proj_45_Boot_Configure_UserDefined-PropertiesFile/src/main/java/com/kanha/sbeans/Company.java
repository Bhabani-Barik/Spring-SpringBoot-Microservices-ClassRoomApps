package com.kanha.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("company")
@PropertySource("app.properties")
public class Company {
	
	@Value("${nit.size}")
	private Integer size;

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Company [size=" + size + "]";
	}
	
	
}
