//in hierarical inheritance we have one parent and many child classes
//all child classes inherit from the same parent class
package com.tns.oopsDemo;

public class HieraricalInheritanceShape {
public void area() {
	System.out.println("the area of rectangle is 6");
}
}
class Circle extends HieraricalInheritanceShape {
	public void area() {
		System.out.println("the area of circle is 3");
	}
}
class Rectangle extends HieraricalInheritanceShape{
	public void area() {
		System.out.println("the area of rectangle is 8");
	}
}
