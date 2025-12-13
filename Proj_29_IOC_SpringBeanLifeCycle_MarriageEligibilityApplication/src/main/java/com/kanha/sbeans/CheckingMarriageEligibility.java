package com.kanha.sbeans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("candidate")
@PropertySource("com/kanha/commons/info.properties")
public class CheckingMarriageEligibility {
	
	@Value("${candidate.name}")
	private String name;
	
	@Value("${candidate.age}")
	private Integer age;
	
	private Date verifiedOn;
	
	public CheckingMarriageEligibility() {
		System.out.println("CheckingMarriageEligibility:: 0-param constructor");
	}
	
	@PostConstruct
	public void myInit() { // init() life cycle method
		System.out.println("CheckingMarriageEligibility.myInit()");
		
		// Initialize the left over properties that had not participated in the injections
		verifiedOn = new Date();
		
		// validation logics
		if ( name == null || age <= 0) {
			throw new IllegalArgumentException("Set Correct Values to name, age properties");
		}
	}
	
	@PreDestroy
	public void myDestroy() { // destroy life cycle method
		System.out.println("CheckingMarriageEligibility.myDestroy()");
		
		// nullification of the bean properties
		name = null;
		age = null;
		verifiedOn = null;	
	}
	
	// Business Method
	public String checkEligibilit() {
		System.out.println("CheckingMarriageEligibility.checkEligibilit()");
		
		if (age < 18) {
			return "Mr./Miss/Mrs. " + name + ", OOPs! Sorry you're legally not eligible to marry someone. verified on :: " + verifiedOn;
		} 
		else {
			return "Mr./Miss/Mrs. " + name + " Awesome! You're legally eligible to marry someone  . verified on :: " + verifiedOn;
		}
	}

}
