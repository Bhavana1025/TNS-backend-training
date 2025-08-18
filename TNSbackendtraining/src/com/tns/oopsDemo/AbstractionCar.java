package com.tns.oopsDemo;

public abstract class AbstractionCar {
abstract void start();
void fueltype(){//concrete method applies for every child class
	System.out.println("all cars run on petrol or diesel");
}
}
class rollesroyce extends AbstractionCar{
	void start() {//here we have to start with start only becz in parent class we used abstract so every child class should start with void start()
		System.out.println("rollesroyce starts with push button");
	}
}
class kia extends AbstractionCar{
	void start() {
		System.out.println("kia starts with keyless ignition");
	}
}