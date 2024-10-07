package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("DTDC")
public final class DTDC implements ICourier{

	@Override
	public String deliver(int oid) {
		return  oid+ " order id order is assigned to DTDC for delivery";
	}
}
