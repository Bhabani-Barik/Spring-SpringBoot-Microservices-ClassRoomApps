package com.kanha.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmg")
@Scope("prototype")
public class WishMessageGenerator {

	@Autowired // Field Injection
	@Qualifier("localDateTime1")
	private LocalDateTime localDateTime; // HAS-A property

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-param constructor");
	}
}
