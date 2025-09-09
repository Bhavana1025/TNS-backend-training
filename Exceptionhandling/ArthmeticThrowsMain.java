package com.tns.Exceptionhandling;

public class ArthmeticThrowsMain {

	public static void main(String[] args) {
		try {
			ArthmeticThrows.divide(10,0);
		}
		catch(ArithmeticException e) {
			System.err.println("cant divide by zero.enter another number");
		}
	}

}
