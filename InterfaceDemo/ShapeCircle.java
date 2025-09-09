package com.tns.InterfaceDemo;

public class ShapeCircle implements shape {

	int radius;//instance variable if we use instance it is flexible we can give different radius(we can edit in constructor without changing code)
	ShapeCircle(int r){//constructor
		radius = r;//if we use local variable then (radius = 5(fixed))it is fixed we cant change value(we have to change the method logic)
	}
	public void area() {
		double area = Math.PI*radius*radius;
		System.out.println("area of circle:"+area);
	}


}
