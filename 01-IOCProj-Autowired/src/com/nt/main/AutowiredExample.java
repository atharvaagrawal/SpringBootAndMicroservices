package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WeekDayFinder;

public class AutowiredExample {
	
	public AutowiredExample() {
		System.out.println("AutowiredExample::0arg Constructor");
	}
	
	public static void main(String args[]) {
		System.out.println("IOC Container Creation Start");
	
		// Create IOC Container
		AnnotationConfigApplicationContext ctx = new 
				AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("IOC Container Created");
		
		WeekDayFinder wdf = ctx.getBean("wdf",WeekDayFinder.class);
		
		System.out.println("WeekDayFinder Object Retrieved");
		
		System.out.println(wdf.checkDay());
		ctx.close();
	}
}
