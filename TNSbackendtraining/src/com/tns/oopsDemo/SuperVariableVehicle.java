package com.tns.oopsDemo;

public class SuperVariableVehicle {
	String brand1 = "rollesroyc";
}
class car extends SuperVariableVehicle{ 
		String brand2 = "kia";
void displayBrand() {
	System.out.println("Car Brand:"+super.brand1);
	System.out.println("Car Brand:"+brand2);
}
}
