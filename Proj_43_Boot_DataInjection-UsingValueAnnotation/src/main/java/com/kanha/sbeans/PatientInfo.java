package com.kanha.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pInfo")
public class PatientInfo {

	@Value("10001") // Direct value injection
	private Integer pid;

	// Injecting the values to spring bean properties by collecting them from
	// properties file.
	@Value("${pi.name}")
	private String pname;

	@Value("${pi.mobileNo}")
	private String mobileNo;

	@Value("${pi.address}")
	private String address;

	// SPEL based injection (dcc-bean id, xrayPrice -property name)
	@Value("#{dcc.xrayPrice + dcc.ctScanPrice}")
	private Double billAmt;

	@Value("#{dcc.ctScanPrice<=0}") // SPEL
	private boolean ctScanFree;

	@Value("{os.name}") // Fixed System property name
	private String osName; // To hold system property value

	@Value("${path}") // Fixed environment variable name
	private String pathData; // To hold environment variable value

	// Getters & Setters
	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getBillAmount() {
		return billAmt;
	}

	public void setBillAmount(Double billAmount) {
		this.billAmt = billAmount;
	}

	public boolean isctScanFree() {
		return ctScanFree;
	}

	public void setCtScanFree(boolean ecgFree) {
		this.ctScanFree = ecgFree;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getPathData() {
		return pathData;
	}

	public void setPathData(String pathData) {
		this.pathData = pathData;
	}

	@Override
	public String toString() {
		return "PatientInfo [pid=" + pid + ", pname=" + pname + ", mobileNo=" + mobileNo + ", address=" + address
				+ ", billAmount=" + billAmt + ", ctScanFree=" + ctScanFree + ", osName=" + osName + ", pathData="
				+ pathData + "]";
	}

}
