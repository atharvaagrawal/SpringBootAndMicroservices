package com.at.comps;

public final class Vehicle {
	
	private IEngine engine;
	
	public void setEngine(IEngine engine) {
		this.engine = engine;
	}
	
	// b,method
	public String changeEngine() {
		return this.engine.changeEngine();
	}
}
