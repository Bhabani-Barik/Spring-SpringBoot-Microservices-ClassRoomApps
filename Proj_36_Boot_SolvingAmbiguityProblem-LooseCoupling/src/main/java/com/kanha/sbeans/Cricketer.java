package com.kanha.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cricketer")
public class Cricketer {

	@Autowired
	@Qualifier("ssbBat")
	private ICricketBat bat; // HAS-A Property
	
	public Cricketer() {
		System.out.println("Cricketer:: 0-param constructor");
	}
	
	public String batting () {
		System.out.println("Cricketer.batting()");
		//use the dependent
		int runs=bat.scoreRuns();
		return "Cricketer has scored " + runs + " runs";
	}
}
