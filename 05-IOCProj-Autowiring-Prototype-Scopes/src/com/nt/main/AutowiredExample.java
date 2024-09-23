package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WeekDayFinder;
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
		
		/* WeekDayFinder wdf1 = ctx.getBean("wdf", WeekDayFinder.class);
		WeekDayFinder wdf2 = ctx.getBean("wdf", WeekDayFinder.class);
		
		System.out.println(wdf1.hashCode()+"------"+wdf2.hashCode());
		System.out.println(wdf1==wdf2);
		*/
		
		Printer prn1 = ctx.getBean("prn1", Printer.class);
		Printer prn2 = ctx.getBean("prn2", Printer.class);
		
		System.out.println(prn1.hashCode()+"--=----------"+prn2.hashCode());
		System.out.println(prn1==prn2);		
		
		ctx.close();
	}
}
