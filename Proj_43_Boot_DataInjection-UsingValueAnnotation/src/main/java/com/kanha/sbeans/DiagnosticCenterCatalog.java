package com.kanha.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dcc")
public class DiagnosticCenterCatalog {
	
	// Injecting values to spring bean properties by collecting  them from properties file.
	
	@Value("${dc.xrayRate}")
	private Double xrayPrice;
	
	@Value("${dc.ctScanRate}")
	private Double ctScanPrice;

	@Value("${dc.mriScanRate}")
	private Double MRIScanPrice;


	
	// Setters & Getters
	public Double getXrayPrice() {
		return xrayPrice;
	}

	public void setXrayPrice(Double xrayPrice) {
		this.xrayPrice = xrayPrice;
	}

	public Double getCtScanPrice() {
		return ctScanPrice;
	}

	public void setCtScanPrice(Double ctScanPrice) {
		this.ctScanPrice = ctScanPrice;
	}

	public Double getMRIScanPrice() {
		return MRIScanPrice;
	}

	public void setMRIScanPrice(Double mRIScanPrice) {
		MRIScanPrice = mRIScanPrice;
	}
}
