package com.nit.sbeans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component("vd")
public class VoterDetails {
	
	@Value("${voter.ano}")
	private long vid;
	
	@Value("${voter.name}")
	private String name;
	
	@Value("${voter.age}")
	private int age;
	
	private Date dov;
	
	public VoterDetails() {
		System.out.println("VoterDetails::0-arg Constructor");
	}
	
	// Custom init method 
	@PostConstruct
	public void myInit() {
		System.out.println("VoterDetails.myInit");
		
		// initialize left over propertites
		dov = new Date();
		
		// check whether correct values are injected to spring bean properties or not
		if( name==null || age < 18 || age > 120 || vid <= 0L) {
			throw new IllegalArgumentException("Invalid Inputs");
		}	
	}
	
	public String checkVotingElegibility() {
		if(age < 18)
			return name+ " you are u r not eligible for voting: "+ dov;
		else
			return name+ " you are u r eligible for voting: "+ dov;
	}
	
	// custom destroy
	@PreDestroy
	public void destroy() {
		System.out.println("VoterDetails.destroy()");
		
		dov = null;
		vid = 0L;
		age = 0;
	}
	
	
}
