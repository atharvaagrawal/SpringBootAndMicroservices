package com.at.mains;

import com.at.comps.Vehicle;
import com.at.factory.VehicleFactory;

public class Customer1 {
	
	public static void main(String args[]) {
		
		Vehicle vh = VehicleFactory.getInstance("petrol");
		String change = vh.changeEngine();
		System.out.println(change);
	}
}
