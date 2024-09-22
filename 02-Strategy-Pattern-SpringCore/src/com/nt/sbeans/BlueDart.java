package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("BlueDart")
@Lazy(true)
//@Component("courier") // property name with bean id (tight-coupling
public final class BlueDart implements ICourier{
	
	public BlueDart() {
		System.out.println("BlueDart.BlueDart()");
	}
	
	@Override
	public String deliver(int oid) {
		return  oid+ " order id order is assigned to BlueDart for delivery";
	}
}
