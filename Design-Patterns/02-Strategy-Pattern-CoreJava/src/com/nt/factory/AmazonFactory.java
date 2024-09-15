package com.nt.factory;

import com.nt.comps.Amazon;
import com.nt.comps.BlueDart;
import com.nt.comps.DTDC;
import com.nt.comps.ICourier;

public final class AmazonFactory {
	
	public static Amazon getInstance(String courierType) {
		ICourier courier = null;
		
		// Create Courier object based on the given courierType
		if(courierType.equalsIgnoreCase("dtdc")) { 
			courier = new DTDC();
		}
		else if(courierType.equalsIgnoreCase("bluedart")) {
			courier = new BlueDart();	
		}
		else {
			throw new IllegalArgumentException("Invalid Courier Type");	
		}
		
		// Create Target Class obj
		Amazon amz = new Amazon();
		
		// Assign dependent class obj to target class obj
		amz.setCourier(courier);
		
		return amz;
	}
}
