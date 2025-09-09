package com.tns.Exceptionhandling;

public class WithException {

	public static void main(String[] args) {
		try {
			int n =10/0;
			System.out.println("the result"+n);
		}
		catch(ArithmeticException e) {
			System.err.println("dividing with zero is not allowed. give a positive number");
		}

	}

}
