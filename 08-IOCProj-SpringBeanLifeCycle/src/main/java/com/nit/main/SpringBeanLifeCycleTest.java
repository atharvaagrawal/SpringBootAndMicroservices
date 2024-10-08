package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.VoterDetails;

public class SpringBeanLifeCycleTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new
				AnnotationConfigApplicationContext(AppConfig.class);	
		
		VoterDetails details = ctx.getBean("vd", VoterDetails.class);
		
		// invoke the b.method
		String resultMsg = details.checkVotingElegibility();
		System.out.println(resultMsg);
		
		ctx.close();
	}
}
