package com.nt.comps;

public class LuxuryCar implements ICar {

	@Override
	public void assemble() {
		System.out.println("LuxuryCar::Rolls-Royce assembling");
	}

	@Override
	public void testDrive() {
		System.out.println("LuxuryCar::Rolls-Royce test drive");
	}

	@Override
	public void deliver() {
		System.out.println("LuxuryCar::Rolls-Royce delivery to Customer");
	}

	@Override
	public void drive() {
		System.out.println("LuxuryCar::Customer is driving Rolls-Royce");		
	}
}
