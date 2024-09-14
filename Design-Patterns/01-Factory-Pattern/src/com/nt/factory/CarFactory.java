package com.nt.factory;

import com.nt.comps.*;

public class CarFactory {

	// static factory method having factory pattern logic
	public static ICar getInstance(String carType) {
		ICar car = null;
		
		if(carType.equalsIgnoreCase("luxury")) {
			car = new LuxuryCar();
		}
		else if(carType.equalsIgnoreCase("sports")) {
			car = new SportsCar();
		}
		else if(carType.equalsIgnoreCase("off-roading")) {
			car = new OffRoadingCar();
		}
		else if(carType.equalsIgnoreCase("standard")) {
			car = new StandardCar();
		}
		else {
			throw new IllegalArgumentException("Invalid Car Type");
		}
		car.assemble();
		car.testDrive();
		car.deliver();
		return car;
	}
}
