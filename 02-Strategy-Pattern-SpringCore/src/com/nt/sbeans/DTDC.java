package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("DTDC")
@Lazy(true)
// @Primary (tight-coupling)
public final class DTDC implements ICourier{

	public DTDC() {
		System.out.println("DTDC.DTDC()");
	}
	
	@Override
	public String deliver(int oid) {
		return  oid+ " order id order is assigned to DTDC for delivery";
	}
}
