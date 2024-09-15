package com.at.factory;

import com.at.comps.DieselEngine;
import com.at.comps.ElectricEngine;
import com.at.comps.IEngine;
import com.at.comps.PetrolEngine;
import com.at.comps.Vehicle;

public class VehicleFactory {

	public static Vehicle getInstance(String engineName) {
		IEngine eng = null;
		
		if( engineName.equalsIgnoreCase("petrol") ) {
			eng = new PetrolEngine();
		}
		else if( engineName.equalsIgnoreCase("electric") ) {
			eng = new ElectricEngine();
		}
		else if( engineName.equalsIgnoreCase("diesel") ) {
			eng = new DieselEngine();
		}
		else {
			throw new IllegalArgumentException("Engine type not present");
		}
		
		
		// target class
		Vehicle vh = new Vehicle();
		vh.setEngine(eng);
		
		return vh;
	}
}
