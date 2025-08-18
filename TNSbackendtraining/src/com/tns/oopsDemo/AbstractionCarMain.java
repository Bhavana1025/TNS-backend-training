package com.tns.oopsDemo;

public class AbstractionCarMain {

	public static void main(String[] args) {
		AbstractionCar obj = new rollesroyce();
		obj.start();
		obj.fueltype();
		AbstractionCar ob = new kia();
		ob.start();
		ob.fueltype();

	}

}
