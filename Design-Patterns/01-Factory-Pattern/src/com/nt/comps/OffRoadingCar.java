package com.nt.comps;


public class OffRoadingCar implements ICar {

	@Override
	public void assemble() {
		System.out.println("OffRoadingCar::Thar Roxx assembling");
	}

	@Override
	public void testDrive() {
		System.out.println("OffRoadingCar::Thar Roxx test drive");
	}

	@Override
	public void deliver() {
		System.out.println("OffRoadingCar::Thar Roxx delivery to Customer");
	}
	
	@Override
	public void drive() {
		System.out.println("LuxuryCar::Customer is driving Thar Roxx");		
	}
}
