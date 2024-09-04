package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.time.LocalDate;

@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig::0 arg constructor");
	}
	
	// Predefined class LocalDate
	@Bean("id")
	public LocalDate getLocalDate() {
		System.out.println("getLocalDate Obj");
		return LocalDate.now();
	}
}
