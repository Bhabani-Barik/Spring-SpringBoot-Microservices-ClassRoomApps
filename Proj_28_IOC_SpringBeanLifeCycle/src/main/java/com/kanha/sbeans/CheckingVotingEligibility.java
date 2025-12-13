package com.kanha.sbeans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("voter")
@PropertySource("com/kanha/commons/info.properties")
public class CheckingVotingEligibility {
	
	@Value("${voter.id}")
	private Integer id;
	
	@Value("${voter.name}")
	private String name;
	
	@Value("${voter.age}")
	private Integer age;
	
	private Date verifiedOn;
	
	public CheckingVotingEligibility() {
		System.out.println("CheckingVotingEligibility:: 0-param constructor");
	}
	
	@PostConstruct
	public void myInit() { // init() life cycle method
		System.out.println("CheckingVotingEligibility.myInit()");
		
		// Initialize the left over properties that had not participated in the injections
		verifiedOn = new Date();
		
		// validation logics
		if ( name == null || age <= 0) {
			throw new IllegalArgumentException("Set Correcr Values to name, age properties");
		}
	}
	
	@PreDestroy
	public void myDestroy() { // destroy life cycle method
		System.out.println("CheckingVotingEligibility.myDestroy()");
		
		// nullification of the bean properties
		name = null;
		age = null;
		verifiedOn = null;
		id = null;		
	}
	
	// Business Method
	public String checkEligibilit() {
		System.out.println("CheckingVotingEligibility.checkEligibilit()");
		
		if (age < 18) {
			return "Mr./Miss/Mrs. " + name + " you're not eligible for voting. verified on :: " + verifiedOn;
		} 
		else {
			return "Mr./Miss/Mrs. " + name + " you're elgible for voting. verified on :: " + verifiedOn;
		}
	}

}
