package com.tns.InterfaceDemo;

public class SimpleCalculator implements Calculator {//implementation for calculator

	@Override//not mandatory
	public void add(int a, int b) {
		System.out.println("addition of two numbers:"+(a+b));
		
	}

	@Override
	public void subract(int a, int b) {
		System.out.println("subraction of two numbers:"+(a-b));
		
	}
@Override
	
	public void divide(int a, int b) {
		System.out.println("division of two numbers:"+(a/b));
		
	}

@Override
	public void multiply(int a, int b) {
		System.out.println("mltiply of two numbers:"+(a*b));
		
	}
//here if you want, you can add extra method also like void remainder()

}
