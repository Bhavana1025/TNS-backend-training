package com.tns.oopsDemo;

public class InheritancePerson {
public void name() {
	System.out.println("name is bhavana");
}
public void age() {
	System.out.println("age is 21");
}
}
class Students extends InheritancePerson{
	public void rollno() {
		System.out.println("rollno is 124567");
	}
}