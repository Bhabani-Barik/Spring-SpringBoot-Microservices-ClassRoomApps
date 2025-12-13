package com.kanha.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("menup")
public class MenuItemPrices {
	
	// Injecting values by collecting from properties file.
	
	@Value("${menu.dosarate}")
	private Float dosaPrice;
	
	@Value("${menu.idlyrate}")
	private Float idlyPrice;
	
	@Value("${menu.poharate}")
	private Float pohaPrice;
	
	@Value("${menu.vprate}")
	private Float vadaPavaPrice;

	
	// Getters & Setters
	public Float getDosaPrice() {
		return dosaPrice;
	}

	public void setDosaPrice(Float dosaPrice) {
		this.dosaPrice = dosaPrice;
	}

	public Float getIdlyPrice() {
		return idlyPrice;
	}

	public void setIdlyPrice(Float idlyPrice) {
		this.idlyPrice = idlyPrice;
	}

	public Float getPohaPrice() {
		return pohaPrice;
	}

	public void setPohaPrice(Float pohaPrice) {
		this.pohaPrice = pohaPrice;
	}

	public Float getVadaPavaPrice() {
		return vadaPavaPrice;
	}

	public void setVadaPavaPrice(Float vadaPavaPrice) {
		this.vadaPavaPrice = vadaPavaPrice;
	}

	// toString() method
	@Override
	public String toString() {
		return "MenuItemPrices [dosaPrice=" + dosaPrice + ", idlyPrice=" + idlyPrice + ", pohaPrice=" + pohaPrice
				+ ", vadaPavaPrice=" + vadaPavaPrice + "]";
	}
	
	
	
	
	

}
