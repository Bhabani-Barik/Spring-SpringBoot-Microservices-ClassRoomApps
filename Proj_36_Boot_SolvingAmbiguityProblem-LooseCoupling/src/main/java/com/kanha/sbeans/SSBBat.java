package com.kanha.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("ssbBat")
public class SSBBat implements ICricketBat {
	
	public SSBBat() {
		System.out.println("SSBBat:: 0-param constructor");
	}

	@Override
	public int scoreRuns() {
		System.out.println("SSBBat.scoreRuns()");
		int score = new Random().nextInt(200);
		return score;
	}

}
