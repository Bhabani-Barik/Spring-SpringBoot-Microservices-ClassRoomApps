package com.kanha.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hotel")
public class Hotel {

	@Value("12345") // Direct Value Injection
	private Integer hotelId;
	
	// values are collected from application.properties file
	
	@Value("${hotel.name}")
	private String hostelName;
	
	@Value("${hotel.address}")
	private String hotelAddress;
	
	@Value("${hotel.contactno}")
	private String mobileNo;
	
	@Value("${customer.name}")
	private String customerName;
	
	// SPEL for arithmetic operation
	@Value("#{menup.dosaPrice + menup.idlyPrice}")
	private Float billAmount;
	
	
	// Injecting System properties
	
	@Value("${os.name}") // os.name is fixed system property key
	private String osName;
	
	@Value("${user.name}") // user.name is fixed system property key
	private String windowUser;
	
	
	// Injecting Environment variable value
	@Value("${path}") // path is fixed environment  variable name
	private String pathData;

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hostelName=" + hostelName + ", hotelAddress=" + hotelAddress
				+ ", mobileNo=" + mobileNo + ", customerName=" + customerName + ", billAmount=" + billAmount
				+ ", osName=" + osName + ", windowUser=" + windowUser + ", pathData=" + pathData + "]";
	}
	
	
}
