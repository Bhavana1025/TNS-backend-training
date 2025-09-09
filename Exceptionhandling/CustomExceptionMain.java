package com.tns.Exceptionhandling;

public class CustomExceptionMain {

	public static void main(String[] args) {
		try {
			CustomException.validateAge(15);
		}
		catch(InvalidAgeException e) {
			System.err.println("Caught exception:" + e.getMessage());
		}
		System.out.println("program continues");
	}

}
