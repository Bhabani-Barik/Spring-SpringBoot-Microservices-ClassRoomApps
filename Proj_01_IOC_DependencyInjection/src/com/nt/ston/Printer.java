package com.nt.ston;

public class Printer {
	private static Printer INSTANCE;

	// private 0-param constructor
	private Printer() {
		System.out.println("Printer:: 0-param constructor");
	}

	// public static factory method having singleton logic
	public static Printer getInstance() {
		System.out.println("Printer.getInstance()");
		if (INSTANCE == null)
			INSTANCE = new Printer();

		return INSTANCE;
	}

	// b.mehtod
	public void print(String message) {
		System.out.println("Printer.print()");
		System.out.println(message);
	}
}
