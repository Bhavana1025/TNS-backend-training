package com.tns.Exceptionhandling;

public class UncheckedDemo {
	static void InsufficientBalance(double amount) throws CustomUncheckedException{
		if(amount<1000) {
			throw new CustomUncheckedException("the amount is too low");
		}
		else {
			System.out.println("sufficient balance"+amount);
		}
		
	}

}
