package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.ston.Printer;

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
		
//		Printer prn1 = ctx.getBean("prn",Printer.class);
//		Printer prn2 = ctx.getBean("prn",Printer.class);		
//		System.out.println(prn1.hashCode()+"...."+prn2.hashCode());
//		System.out.println(prn1==prn2);

		Printer prn1 = ctx.getBean("prn1",Printer.class);
		Printer prn2 = ctx.getBean("prn1",Printer.class);		
		System.out.println(prn1.hashCode()+"...."+prn2.hashCode());
		System.out.println(prn1==prn2);
		
		Printer prn11 = ctx.getBean("prn2",Printer.class);
		Printer prn22 = ctx.getBean("prn2",Printer.class);		
		System.out.println(prn11.hashCode()+"...."+prn22.hashCode());
		System.out.println(prn11==prn22);
		
		/*
		WeekDayFinder wdf2 = ctx.getBean("wdf",WeekDayFinder.class);
		
		System.out.println("WeekDayFinder Object Retrieved");
		
		System.out.println(wdf1.hashCode()+"...."+wdf2.hashCode());
		System.out.println(wdf1==wdf2);
		
		System.out.println(wdf1.checkDay());
		
		System.out.println("all bean ids count::"+ctx.getBeanDefinitionCount());
		System.out.println("all bean ids::"+Arrays.toString(ctx.getBeanDefinitionNames()));
		*/
		ctx.close();
	}
}
