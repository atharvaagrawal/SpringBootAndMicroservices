package com.nt.sbeans;

import java.util.Arrays;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("amz")
public final class Amazon {
	
	// HAS-A Property
	@Autowired
	@Qualifier("shipper") // you can link this with property file so no need to hardcode
	private ICourier courier;
	
	
	// b.method
	public String shopping(String items[], double prices[]) {
		double totalAmt = 0.0;
		
		// cal bill amount
		for( double p:prices ) { 
			totalAmt = totalAmt + p;
		}
		
		// generate random number as the orderId
		int oid = new Random().nextInt(3000);
		
		// use dependent
		String dMsg = courier.deliver(oid);
		
		return Arrays.toString(items) + " are purchased having prices "+ Arrays.toString(prices) + " bill Amt::" + totalAmt + "....." + dMsg;
	}
}
