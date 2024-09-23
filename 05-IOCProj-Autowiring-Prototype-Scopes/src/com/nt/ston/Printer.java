package com.nt.ston;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("prn")
@Scope("prototype")
public class Printer {

	// ref variable to hold that single object
	private static Printer INSTANCE;
	
	// private constructor
	private Printer() { 
		System.out.println("Printer:0-arg Constructor");
	}
	
	// static factory method having singleton logic
	public static Printer getInstance() {
		if( INSTANCE == null) {
			INSTANCE = new Printer(); 
		}
		return INSTANCE;
	}
	
	// b.method
	public void print(String data) {
		System.out.println("Printer.print():"+data);
	}
	
}
