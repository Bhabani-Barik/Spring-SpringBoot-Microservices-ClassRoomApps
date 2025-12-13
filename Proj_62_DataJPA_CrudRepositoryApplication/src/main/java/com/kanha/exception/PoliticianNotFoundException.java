package com.kanha.exception;


public class PoliticianNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PoliticianNotFoundException() {
	    
	}
	
    public PoliticianNotFoundException(String msg) {
	    super(msg);
	}
	
	
}
