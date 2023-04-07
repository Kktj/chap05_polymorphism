package com.javalab.polymorphism.pkg08;

public class VehicleMain {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Vehicle[] vehicles = new Vehicle[2];
		vehicles[0] = new Taxi();
		vehicles[1] = new Bus();
		
		for (Vehicle vehicle : vehicles) {
			driver.drive(vehicle);
		}

	}

}
