package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("BlueDart")
//@Component("courier") // property name with bean id (tight-coupling
public final class BlueDart implements ICourier{
	
	@Override
	public String deliver(int oid) {
		return  oid+ " order id order is assigned to BlueDart for delivery";
	}
}
