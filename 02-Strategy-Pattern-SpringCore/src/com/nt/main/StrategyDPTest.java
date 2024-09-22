package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Amazon;

public class StrategyDPTest {

	public static void main(String args[]) {
		
		// create IOC Container
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("IOC Container Created");
		
		// get target class obj
		Amazon amz = ctx.getBean("amz", Amazon.class); 
				
		// invoke the b.method
		String resultMsg = amz.shopping(new String[] {"Dress", "Bike", "Chain"},  
				new double[] {5000.0, 120000.0, 40000.0});
		
		System.out.println(resultMsg);
		
		// close the container
		ctx.close();
	}
}
