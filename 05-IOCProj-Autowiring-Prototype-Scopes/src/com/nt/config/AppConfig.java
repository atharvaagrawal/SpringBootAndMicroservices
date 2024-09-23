package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.nt.ston.Printer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.time.LocalDate;

@Configuration
@ComponentScan(basePackages="com.nt")
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
	
	@Bean(name="prn1")
	@Scope("prototype")
	public Printer createPrinter1() {
		System.out.println("AppConfig.createPrinter1()");
		return Printer.getInstance();
	}
	
	@Bean(name="prn2")
	@Scope("prototype")
	public Printer createPrinter2() {
		System.out.println("AppConfig.createPrinter2()");
		return Printer.getInstance();
	}
	
}
