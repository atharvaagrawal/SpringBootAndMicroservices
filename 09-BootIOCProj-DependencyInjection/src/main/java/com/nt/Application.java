package com.nt;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.SeasonFinder;

@SpringBootApplication
public class Application {
	
	@Bean(name="dt")
	public LocalDate createLDat() {
		return LocalDate.now();
	}

	public static void main(String[] args) {
		
		// get ioc container
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		// get target spring bean class ref
		SeasonFinder finder = ctx.getBean("sf",SeasonFinder.class);
		
		// invoke the b.method
		String resultMsg = finder.findSeason();
		
		// display the results
		System.out.println(resultMsg);
		
		// close container
		((ConfigurableApplicationContext)ctx).close();
	}

}
