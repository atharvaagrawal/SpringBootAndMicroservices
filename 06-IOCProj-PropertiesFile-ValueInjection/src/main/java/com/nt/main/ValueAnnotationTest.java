package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.PersonInfo;

public class ValueAnnotationTest {

	public static void main(String[] args) {
		
		// create ioc container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// get spring bean class obj ref
		PersonInfo info = ctx.getBean("pi",PersonInfo.class);
		
		System.out.println(info);
		
		ctx.close();
	}

}
